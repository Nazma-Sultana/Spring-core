package car.example.bean;

public class MyBean {
    private String Message;

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "Message='" + Message + '\'' +
                '}';
    }
}
