package chapter09;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerCompareSample {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 25);
        Customer eve = new Customer("Eve", 35);
        Customer alice = new Customer("Alice", 30);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(alice);
        customers.add(bob);
        customers.add(eve);

        // 並べ替え
        Collections.sort(customers);

        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}
