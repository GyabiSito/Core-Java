package privatemethods;

public interface SendNotifications {
    default void sendNotifications() {
        estableshingConnection();
        System.out.println("Sending notifications");
    }
    default void sendNotification() {
        estableshingConnection();
        System.out.println("Send notification");
    }
    private  void estableshingConnection(){
        System.out.println("Establishing connection");
    }
}
