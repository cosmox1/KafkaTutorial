package kafkatuorial.demo;

public class MessageRequest {
     public String message;

    public MessageRequest(String message) {
        this.message = message;
    }

    public MessageRequest() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
