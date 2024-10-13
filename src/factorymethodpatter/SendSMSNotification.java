package factorymethodpatter;

public class SendSMSNotification extends NotificationCenter{
    @Override
    public void sendNotification() {
        Notification notification = getNotification();
        System.out.println(notification.getNotificationContent());

    }

    @Override
    public Notification getNotification() {
        return new SMSNotification();
    }
}
