public class day15 {
        interface transaction{
            void send(String to, String message);
        }
        class Credittransaction implements transaction{
            @Override
            public void send(String to, String message){
                System.out.println("Amount Credited 800: "+message+", to"+to);
            }

        }
        class Debittransaction implements transaction{
            @Override
            public void send(String to, String message){
                System.out.println("Amount Debited 8900: "+message+", to"+to);
            }
        }
        static transaction gettransaction(day15 factory, String type){
            return switch (type){
                case"Credit"-> factory.new Credittransaction();
                case"Debit"-> factory.new Debittransaction();
                default -> throw new IllegalArgumentException("Invalid account type:"+ type);
            };
        }
        static void main(){
            day15 factory = new day15();
            String type = "Credit";
            gettransaction(factory,type).send(" 78095653","credited");
        }
    }