import java.util.*;

public class Product {
    private int money;
    private String id, name, user;

    public Product(String name_, int money_, String id_) {
        id = id_;
        name = name_;
        money = money_;
        user = "";
    }

    void Info() {
        System.out.printf("Name: %s\tMoney: %d\tID: %s\n", name, money, id);
    }

    void User() {
        System.out.printf("Users: %s\n", user);
    }

    int getPrice() {
        return this.money;
    }

    void setUser(String user_) {
        if (this.user.equals("")) {
            this.user = user_;
        } else {
            this.user = this.user + ", " + user_;
        }
    }
}

