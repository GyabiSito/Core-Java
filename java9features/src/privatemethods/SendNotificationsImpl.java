package privatemethods;

public class SendNotificationsImpl implements SendNotifications {
    public static void main(String[] args) {
        SendNotifications sendNotifications=new SendNotificationsImpl();
        sendNotifications.sendNotification();
        sendNotifications.sendNotifications();
    }

    @Override
    public void sendNotifications() {
        SendNotifications.super.sendNotifications();
    }

}
