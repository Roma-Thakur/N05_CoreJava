package com.tnsif.dayseventeen;

import java.util.List;
import java.util.Scanner;

public class UserInterfaceDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("1.Add\n2.Display\n3.Exit");
            System.out.println("Enter your choice to perform operation");

            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the item");
                    String prod = s.next();
                    products.addProductToList(prod);
                    break;
                case 2:
                    List<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("Please Enter the item first...Your List is Empty");
                    } else {
                        products.sortProductList();
                        System.out.println(productList);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice...");
            }
        }
    }
}