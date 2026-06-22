public class Day14_factory {
    interface Notification {
        void send(String to, String message);
    }
    static class EmailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: " + message + ", to " + to);
        }
    }
    static class WhatsappNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending WhatsApp: " + message + ", to " + to);
        }
    }
    static Notification getNotification(Day14_factory factory, String type) {
        return switch (type) {
            case "Email" -> new EmailNotification();
            case "WhatsApp" -> new WhatsappNotification();
            default -> throw new IllegalArgumentException("Invalid notification type: " + type);
        };
    }

    static void main() {
        Day14_factory factory=new Day14_factory();
        String type="WhatsApp";
        getNotification(factory, type).send("9842727739","Hello World");
    }
}