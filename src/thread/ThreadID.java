package thread;


import static sun.net.InetAddressCachePolicy.get;

public class ThreadID {
    private int nextID;

    public ThreadID() {
        nextID = 10001;
    }

    private synchronized Integer getNewID() {
        Integer id = new Integer(nextID);
        nextID++;
        return id;
    }


    protected Object initialValue() {
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID() {
        Integer id = (Integer) get();
        return id.intValue();
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}
