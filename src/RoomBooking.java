/** Starting our document, we need to do the following:
 * import a scanner
 * plan out our variables like our room types, checking if rooms are booked, and telling who booked what room(s)
 * we need to find a way to show a menu on program startup that gets user choice/input,
 * and respectively does a task per user input choice
  */

/**
 * step one - import scanner
 */
import java.util.Scanner;


public class RoomBooking {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /**
     * step two - declare our room types and variables
     */

    String occupancychoice;
    String occupancytype1 = "Single";
    String occupancytype2 = "Double";
    String occupancytype3 = "Triple";

    String bedconfigchoice;
    String bedconfig_full = "Full";
    String bedconfig_queen = "Queen";
    String bedconfig_king = "King";

    String layoutchoice;
    String layout_standard = "Standard";
    String layout_deluxe = "Deluxe";
    String layout_suite = "Suite";

    String specialfeatureschoice1;
    String specialfeatureschoice2;
    String specialfeatureschoice3;
    String specialfeatureschoice4;
    String specialfeatures_accessible = "Handicap Accessible";
    String specialfeatures_petfriendly = "Pet Friendly";
    String specialfeatures_nonsmoking = "Non-Smoking";
    String specialfeatures_excecutive = "Executive Upgrade";

    /**
     * step three - show our menus and get input
     */
    String linebreak = System.lineSeparator();
    System.out.println("Simple Room Booking Service: " + linebreak + linebreak);
    System.out.println("Please enter the number corresponding to each menu option" + linebreak + linebreak);

    System.out.println("1. Book a Room");
    System.out.println("2. Exit Program");

    System.out.println("Choice : ");
    int choice_start = scanner.nextInt();

    if (choice_start == 1) {
        System.out.println("Welcome to your Room Booking Service" + linebreak +
                "Please select your occupancy type: " + linebreak);

        System.out.println("1. Single");
        System.out.println("2. Double");
        System.out.println("1. Triple (or more)");
        System.out.println("4. EXIT Program");

        System.out.println("Choice: ");
        int choice_occupancy = scanner.nextInt();

        if (choice_occupancy == 1) {
            occupancychoice = "Single";

            //next menu (bed config) here
            System.out.println(linebreak + "Please select your preferred bed size: " + linebreak);

            System.out.println("1. Full");
            System.out.println("2. Queen");
            System.out.println("3. King");
            System.out.println("4. EXIT Program");

            System.out.println("Choice: ");
            int choice_bedconfig = scanner.nextInt();
        }
        else if (choice_occupancy == 2) {
            occupancychoice = "Double";

            //next menu here

        }
        else if (choice_occupancy == 3) {
            occupancychoice = "Triple";

            //next menu here

        }
        else if (choice_occupancy == 4) {
            System.exit(0);
        }
        else {
            System.out.println(linebreak + "Please input choices numbered 1 through 4 or manually exit the program: ");
        }


    }


}

}
