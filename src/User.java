import java.util.*;

public class User {
    private int money;
    private String name, surname, id, buy;

    public User(String name_, String surname_, int money_, String id_) {
        id = id_;
        name = name_;
        surname = surname_;
        money = money_;
        buy = "";
    }

    void Info() {
        System.out.printf("Name: %s \tSurname: %s\tMoney: %d\n ID: %s\n", name, surname, money, id);
    }

    void Buy() {
        System.out.printf("Products: %s\n", buy);
    }

    int getMoney() {
        return this.money;
    }

    void setMoney(int money_) {
        this.money = money_;
    }
    void setProduct(String name_) {
        if (this.buy.equals("")) {
            this.buy = name_;
        } else {
            this.buy = this.buy + ", " + name_;
        }
    }
}


