import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Deque<String> stackForward = new ArrayDeque<String>();
        Deque<String> stackBack = new ArrayDeque<String>();
        Deque<String> historyWebsite = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        String browserName = "";
        int choice = 0;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add New Browser");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. History");
            System.out.println("0. Quit");
            if (!browserName.isEmpty()) {
                System.out.println("Ban dang o tab: " + browserName);
            }
            System.out.println("Nhap lua chon cua ban (1-4): ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Browser Name:");
                    boolean valid = false;
                    if(!browserName.isEmpty()) {
                        for (String i: stackBack){
                            if (i.equals(browserName)){
                                valid = true;
                            }
                        }
                        if (!valid) {
                            stackBack.push(browserName);
                            stackForward.clear();
                        }else {
                            stackBack.push(browserName);
                        }
                    }
                    browserName = in.next();
                    historyWebsite.offer("Forward " + browserName);
                    break;
                case 2:
                    if (stackBack.isEmpty()) {
                        System.out.println("Do not back now!");
                        break;
                    }else{
                        stackForward.push(browserName);
                        browserName = stackBack.pop();
                        historyWebsite.offer("Back " + browserName);
                        break;
                    }
                case 3:
                    if (stackForward.isEmpty()) {
                        System.out.println("Do not forward now!");
                        break;
                    }else {
                        stackBack.push(browserName);
                        browserName = stackForward.pop();
                        historyWebsite.offer("Forward " + browserName);
                        break;
                    }
                case 4:
                    for (String s : historyWebsite) {
                        System.out.print(s + " --> ");
                    }
                    System.out.println();
                    break;
            }
        } while (choice != 0);
    }
}
