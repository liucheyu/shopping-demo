package idv.liucheyu.commonservice;

public class ResponseData {
    private int statusCode = 200;
    private String message = "";
    private Object data;

    public ResponseData() {
    }

    public ResponseData(Object data) {
        this.data = data;
    }

    public ResponseData(int code, String message, Object data) {
        this.statusCode = code;
        this.message = message;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
