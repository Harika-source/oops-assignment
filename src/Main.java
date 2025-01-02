
public class Main {
    public static void main(String[] args) {
        // Create an instance of GymMembership
        GymMembership basicMember = new GymMembership("Harika", "Monthly", 6);

        // Create an instance of PremiumMembership
        PremiumMembership premiumMember = new PremiumMembership("Vaishu", "Annual", 12, true, true);

        // Display details of the basic membership
        System.out.println("Basic Membership Details:");
        basicMember.displayDetails();

        // Display details of the premium membership
        System.out.println("Premium Membership Details:");
        premiumMember.displayDetails();


    }
}