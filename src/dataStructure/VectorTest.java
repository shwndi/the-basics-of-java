package dataStructure;
import java.util.Collections;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        vector.add("X");
        vector.add("M");
        vector.add("D");
        vector.add("A");
        vector.add("O");
        System.out.println(vector);
        Collections.sort(vector);
        System.out.println(vector);
        int d = Collections.binarySearch(vector, "D");
        System.out.println("the index of D in vector is "+d);
    }
}
