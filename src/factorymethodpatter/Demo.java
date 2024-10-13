package factorymethodpatter;

public class Demo {


    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationCenter notificationCenter =factory.sendNotification("email");
        notificationCenter.sendNotification();

        NotificationCenter notificationCenter1 = factory.sendNotification("SMS");
        notificationCenter1.sendNotification();
    }
}
