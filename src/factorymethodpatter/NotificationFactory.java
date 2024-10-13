package factorymethodpatter;

public class NotificationFactory {

    public NotificationCenter sendNotification(String type){
        if (type.equals("email"))
            return new SendEmailNotification();
        else
            return new SendSMSNotification();
    }
}
