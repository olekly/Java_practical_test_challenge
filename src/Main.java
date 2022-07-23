import java.util.*;

public class Main {



    public static void main(String[] args) {
        Service serv = new Service();
        System.out.println("""
                Hello. You are in the main menu.
                - Display list of all users
                - Display list of all products
                - To buy product
                - Display list of user products by user id
                - Display list of users that bought product by product id
                - Close the program
                Please select an action""");
        boolean cont = true;
        String request;
        Scanner scanner = new Scanner(System.in);
        while (cont) {
            request = scanner.nextLine();
            switch (request.trim().toLowerCase()) {
                case "display list of all users" -> serv.getUserInfo();
                case "display list of all products" -> serv.getProductInfo();
                case "to buy product" -> serv.BuyProduct();
                case "display list of user products by user id" -> serv.BuyUserInfo();
                case "display list of users that bought product by product id" -> serv.BuyProductInfo();
                case "close the program" -> cont = false;
                default -> System.out.println("Invalid request");
            }
        }
        scanner.close();
        System.out.println("Goodbye");
    }
}