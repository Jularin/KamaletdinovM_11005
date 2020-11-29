package home7;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Order> orders = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        while(true){
            System.out.println("Enter 1 to get all orders.\nEnter 2 to add new Order.\nEnter 3 to exit program");
            int action = sc.nextInt();
            if (action == 1){
                if (orders.size() > 0){
                    for (Order order : orders) {
                        System.out.printf("Name of customer %s\n", order.getCustomer().getName());
                    }
                }
                else{
                    System.out.println("We haven't any orders");
                }
            }
            else if (action == 2){
                addOrder();
            }
            else if ( action == 3){
                System.out.println();
                break;
            }
        }
    }
    public static void addOrder(){
        System.out.println("Enter info about customer: \nName\nAge\nSex");
        String customerName = sc.nextLine();
        int age = sc.nextInt();
        String sex = sc.next();

        System.out.println("Enter info about Product: \nName\nPrice\nManufacturer name");
        String productName = sc.next();
        double price = sc.nextDouble();
        String manufacturer = sc.next();

        orders.add(new Order(new Customer(customerName, age, sex), new Product(productName, price, manufacturer)));
        System.out.println("Order created and added in orders");
    }
}







