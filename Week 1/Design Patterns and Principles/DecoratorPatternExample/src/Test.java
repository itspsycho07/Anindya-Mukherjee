public class Test {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Initial email notification.");

        System.out.println();

        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        smsNotifier.send("Notification with SMS.");

        System.out.println();

        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        slackNotifier.send("Notification with SMS and Slack.");
    }
}
