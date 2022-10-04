/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MainClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("<MENU>");
        int commandCode;
        Scanner searchs = new Scanner(System.in);
        while (true) {
            System.out.println("1: Educational, RestaurantAndFastfood, ArtAndTheater, 2: Exit");
            commandCode = searchs.nextInt();
            if (commandCode == 2) {
                System.out.println("Exit");
                System.exit(0);
            }

            System.out.println("Enter your selection : ");
            String literal;
            do {
                literal = searchs.nextLine();
            } while (literal.length() == 0);
            literal = literal.toLowerCase();

            // try{
            search fileSearch = new search();
            search filese = new search();
            // String fsearch = searchs.nextLine();

            fileSearch.parseFile("ap.txt", literal);
            System.out.println("Which item do you want?");
            Searchs fileSearchs = new Searchs();
            Searchs filesea = new Searchs();
            String fsearchs = searchs.nextLine();

            fileSearch.parseFile("ap2.txt", fsearchs);

            System.out.printf("Do you want %s Yes/No?", fsearchs);
            String b = searchs.nextLine();
            if (b.equalsIgnoreCase("No")) {
                System.out.println("Which item do you want?");
                String ll = searchs.nextLine();
                //  Searchs fileSearchs = new Searchs();

                fileSearchs.parseFile("ap2.txt", ll);
            } else {
                System.out.println("Please enter your email");
            }
            break;
        }
        try {
            String m = searchs.nextLine();
            if (m.contains("@") && m.endsWith(".com")) {
                System.out.println("correct address \n");

            } else {
                System.out.println(" your address is not correct please try again");
            }

        } catch (Exception e) {
            System.out.println("invalid");
        }
        System.out.println("please enter your password");
        String p = searchs.nextLine();
        System.out.println("please complete your information");
        System.out.println("FirstName : ");
        String fn = searchs.nextLine();
        // fn = searchs.nextLine();
        System.out.println("LastName : ");
        String ln = searchs.nextLine();
        System.out.println("city : ");
        String c = searchs.nextLine();
        System.out.println("phoneNumber : ");
        String pn = searchs.nextLine();
        while (true) {
            if (pn.startsWith("09") && pn.length() == 11) {
                System.out.println("your information completed");
            } else {
                System.out.println("your phoneNumber is not correct , try again");

                String pon = searchs.nextLine();

                if (pon.startsWith("09") && pon.length() == 11) {
                    System.out.println("your information completed");
                }
            }
            break;
        }
        // break;
        // }
        System.out.println("Do you want to show your shopping cart?");

        String sc = searchs.nextLine();
        if (sc.equalsIgnoreCase("Yes")) {

            Searchs fileSearchs = new Searchs();
            //Searchs filesea = new Searchs();
            String fsearchs = searchs.nextLine();
            fileSearchs.parseFile("ap2.txt", fsearchs);
            String[] n = fsearchs.split("$");
            System.out.println(n[0]);

            System.out.println("Please enter your ID card");
            while (true) {
                try {
                    String id = searchs.nextLine();
                    if (id.length() == 16) {
                        int value = Integer.parseInt(id);
                        System.out.println("done");
                    }
                } catch (java.lang.NumberFormatException ne) {
                    //System.out.println("please enter number");
                }
                break;
            }
            System.out.println("Thanks for your shopping");

        } else {
            System.out.println("What do you want?");
            System.out.println("press 1 to exit , otherwise press 2 to search please");
            int commandCodes = 0;
            while (true) {
                commandCodes = searchs.nextInt();
                if (commandCodes == 1) {
                    System.out.println("Exit");
                    break;
                }
                if (commandCodes == 2) {
                    search fileSearch = new search();
                    search filese = new search();
                    System.out.println("please search");
                    String fsearch = searchs.nextLine();
                    fileSearch.parseFile("ap.txt", fsearch);
                }
            }
        }

    }
}
