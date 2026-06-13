public class Day7poly{
    static class Payment{
        int Amount;
        void transfer(){
            System.out.println("Amount is transfered");
        }
    }
    static class UPIPayment extends Payment{
        @Override
        void transfer(){
            System.out.println("UPIpayment is transfered");
        }
    }
    static class CardPayment extends Payment{
        @Override
        void transfer(){
            System.out.println("Cardpayment is transfered");
        }
}
    static class NBPayment extends Payment{
        @Override
        void transfer(){
            System.out.println("NBpayment is transfered");
        }
}
public static void main(String[] args) {
    System.out.println("**********************");
    UPIPayment UPI=new UPIPayment();
    UPI.transfer();
    System.out.println("**********************");
    CardPayment Card=new CardPayment();
    Card.transfer();
    System.out.println("**********************");
    NBPayment NB=new NBPayment();
    NB.transfer();
    System.out.println("----------------------");
    Payment Pay=new Payment();
    Pay.transfer();
}
}
