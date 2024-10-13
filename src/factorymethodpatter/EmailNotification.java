package factorymethodpatter;

public class EmailNotification implements Notification{
    @Override
    public String getNotificationContent() {
       return  "Email Notification Content";
    }
}
