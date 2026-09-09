package DictionarySystem;

import Source.DictionarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionarySystem dictionarySystem = new DictionarySystem();
        int choice;
        String key, value;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add \n" +
                    "2. Remove \n" +
                    "3. Search \n" +
                    "4. Print All Key \n" +
                    "5. Count \n" +
                    "6. Reset \n" +
                    "7. Print Full Dictionary \n" +
                    "0. Quit \n");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter key: ");
                    key = input.nextLine();
                    System.out.println("Enter value: ");
                    value = input.nextLine();
                    dictionarySystem.put(key, value);
                    System.out.println("Key added successfully!");
                    break;
                case 2:
                    System.out.println("Enter key to remove: ");
                    key = input.nextLine();
                    dictionarySystem.remove(key);
                    System.out.println("Key removed successfully!");
                    break;
                case 3:
                    System.out.println("Enter key to search: ");
                    key = input.nextLine();
                    dictionarySystem.search(key);
                    break;
                case 4:
                    dictionarySystem.printAllKey();
                    break;
                case 5:
                    System.out.println("Number of dictionary is: " + dictionarySystem.count());
                    break;
                case 6:
                    dictionarySystem.deleteAll();
                    System.out.println("Delete all dictionary successfully!");
                    break;
                case 7:
                    dictionarySystem.printFull();
                    break;
            }
        } while (choice != 0);
    }
}
