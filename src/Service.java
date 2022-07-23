import java.util.Scanner;

public class Service {
    User a = new User("Tom", "Kury", 2000, "001");
    User b = new User("Max", "Dou", 1000, "002");
    User c = new User("Hans", "Mers", 3000, "003");
    Product comp = new Product("Computer", 2000, "1001");
    Product book = new Product("Book", 2, "1002");
    Product guit = new Product("Guitar", 200, "1003");
    void BuyProduct() {
        System.out.println("User ID of the buyer:");
        Scanner scanner1 = new Scanner(System.in);
        String UserID = scanner1.nextLine();
        System.out.println("Product ID:");
        String ProductID = scanner1.nextLine();
        int userMoney, price;
        String name, userName;
        switch (UserID.trim()) {
            case "001" -> {
                userMoney = a.getMoney();
                userName = "Tom";
            }
            case "002" -> {
                userMoney = b.getMoney();
                userName = "Max";
            }
            case "003" -> {
                userMoney = c.getMoney();
                userName = "Hans";
            }
            default -> {
                System.out.println("Invalid request");
                return;
            }
        }
        switch (ProductID.trim()) {
            case "1001" -> {
                price = comp.getPrice();
                name = "Computer";
            }
            case "1002" -> {
                price = book.getPrice();
                name = "Book";
            }
            case "1003" -> {
                price = guit.getPrice();
                name = "Guitar";
            }
            default -> {
                System.out.println("Invalid request");
                return;
            }
        }
        if (price > userMoney) {
            System.out.println("Not enough money");
            return;
        }else {
            userMoney = userMoney - price;
            switch (UserID) {
                case "001" -> {
                    a.setMoney(userMoney);
                    a.setProduct(name);
                }
                case "002" -> {
                    b.setMoney(userMoney);
                    b.setProduct(name);
                }
                case "003" -> {
                    c.setMoney(userMoney);
                    c.setProduct(name);
                }
            }
            switch (ProductID) {
                case "1001" -> comp.setUser(userName);
                case "1002" -> book.setUser(userName);
                case "1003" -> guit.setUser(userName);
            }
            System.out.println("Successful purchase");
        }
    }


    void BuyUserInfo() {
        System.out.print("User ID: ");
        Scanner scanner1 = new Scanner(System.in);
        String requestUserID = scanner1.nextLine();
        switch (requestUserID.trim()) {
            case "001" -> a.Buy();
            case "002" -> b.Buy();
            case "003" -> c.Buy();
            default -> System.out.println("Invalid request");
        }
    }

    void BuyProductInfo() {
        System.out.print("Product ID: ");
        Scanner scanner1 = new Scanner(System.in);
        String requestProductID = scanner1.nextLine();
        switch (requestProductID.trim()) {
            case "1001" -> comp.User();
            case "1002" -> book.User();
            case "1003" -> guit.User();
            default -> System.out.println("Invalid request");
        }
    }

    void getUserInfo() {
        a.Info();
        b.Info();
        c.Info();
    }

    void getProductInfo() {
        comp.Info();
        book.Info();
        guit.Info();
    }
}
