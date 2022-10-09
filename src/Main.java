import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static LocalDate[] demoDate = {LocalDate.now()};
    static Venue[] venues = {new Venue("Maxim", "131 Le Loi St", "Premium palace", "https://vtr.lik/maxim", demoDate),new Venue("Thien Nhien", "17 Bourke St", "Premium palace", "https://vtr.lik/maxim", demoDate),new Venue("Gold Leaf", "23 Sunshine Ave", "Premium palace", "https://vtr.lik/maxim", demoDate),new Venue("Hadilao", "121 La Trobe St", "Premium palace", "https://vtr.lik/maxim", demoDate)};
    static Scanner keyboard = new Scanner(System.in);
    static int choice;
    static PackageType[] packages = {new PackageType("Small", 15, 1500), new PackageType("Medium", 50, 5000), new PackageType("Large", 150, 15000)};
    User curUser = null;

    // Helper method to print message
    public static void prtln(String text) {
        System.out.println(text);
    }

    public static void drawMenu() {
        prtln("Welcome to Perfect Events Agency");
        prtln("How can we help you today?");
        prtln("1. Make a Booking");
        prtln("2. Login / Registration");
        choice = keyboard.nextInt();
        if (choice == 1) {
            prtln("We have 3 typical packages:");
            for (PackageType pkg :
                    packages) {
                prtln(pkg.getName());
                prtln("- Max no. of Guest: " + pkg.getGuestCapacity());
                prtln("- Estimate cost: " + pkg.getCost());
            }
            prtln("Which package would you like?");
            int pkgChoice = keyboard.nextInt();
            prtln(Integer.toString(pkgChoice));
            prtln("Which venue would you like?");
            for (Venue venue :
                    venues) {
                prtln(venue.getName());
                prtln(venue.getAddress());
                prtln(venue.getDescription());
            }



        } else if (choice == 2) {

        } else {
            System.out.println("Incorrect command, please check your input.");
        }
    }

    public static void main(String[] args) {
        drawMenu();
    }
}