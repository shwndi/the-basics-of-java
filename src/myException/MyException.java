package myException;

/**
 * 构造一个基本异常.
 * (自定义异常)
 */
public class MyException extends Exception {
    /**
     * 错误编码
     */
    private String errorCode;


    public MyException() {
    }

    /**
     *
     * @param message 信息描述
     */
    public MyException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
