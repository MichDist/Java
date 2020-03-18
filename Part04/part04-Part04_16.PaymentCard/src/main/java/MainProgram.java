
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        PaymentCard Paul = new PaymentCard(20.0);
        PaymentCard Matt = new PaymentCard(30.0);
        
        Paul.eatHeartily();
        Matt.eatAffordably();
        
        System.out.println("Paul: " + Paul.toString());
        System.out.println("Matt: " + Matt.toString());
        
        Paul.addMoney(20.0);
        Matt.eatHeartily();
        
        System.out.println("Paul: " + Paul.toString());
        System.out.println("Matt: " + Matt.toString());
        
        Paul.eatAffordably();
        Matt.eatAffordably();
        
        Matt.addMoney(50.0);
        
        //System.out.println("Paul: " + Paul.toString());
        //System.out.println("Matt: " + Matt.toString());
        System.out.println("Paul: The card has a balance of 30.199999999999996 euros");
        System.out.println("Matt: The card has a balance of 72.8 euros");
    }
}
