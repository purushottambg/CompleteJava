package collection.list;

import java.util.Scanner;
import java.util.Stack;

public  class StackExample {
    public static void main(String[] args) {
        Stack<String> fruitBasket = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        fruitBasket.push("Banana");
        fruitBasket.push("Kivi");
        fruitBasket.push("Orange");
        fruitBasket.push("Sitaphal");
        do{
            System.out.print("\nWhat can we help you with\n");
            System.out.print("1: Add fruits           2:Check Fruits in basket");
            System.out.print("\n3: is Basket Full     4:Is basket Empty");
            System.out.print("\n5: All the fruits in basket:");
            Integer choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter fruit name: ");
                    String fruit = scanner.next();
                    fruitBasket.push(fruit);
                break;
                case 2:
                    System.out.print("Enter the fruit name to check: ");
                    String fruit1 = scanner.next();
                    if(fruitBasket.contains(fruit1))
                    System.out.println("We already have that fruit in basket");
                else
                    System.out.println("We don't have that fruit in the basket");
                break;
                case 3:  System.out.println("current capacity is: "+fruitBasket.capacity());
                    break;
                case 4: if(fruitBasket.isEmpty())
                    System.out.println("Bucket is empty");
                else
                    System.out.println("Bucket has some fruits");
                    break;
                case 5:
                    System.out.println(fruitBasket);
                    break;
                default:
                    System.out.println(" Please enter one of the valid choice!!");
            }
        }while (true);
    }
}