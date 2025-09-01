package CreationalPatterns.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        StockOrder order1 = new StockOrder(4, "AAPL", names);
        StockOrder order2 = order1.clone();
        StockOrder order3 = order1.clone();

        order1.getNames().add("Bob");

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

    }
}
