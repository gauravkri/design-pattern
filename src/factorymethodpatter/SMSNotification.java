package factorymethodpatter;

public class SMSNotification implements Notification{
    @Override
    public String getNotificationContent() {
        return "SMS OTP content";
    }
}
