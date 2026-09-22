package chapter09;

public class Customer implements Comparable<Customer> {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Customer customer) {
        return age - customer.age;
    }

    @Override
    public String toString() {
        return "name:" + name + ", age:" + age;
    }
}
