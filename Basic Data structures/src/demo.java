import java.util.Stack;
import java.util.Scanner;

public class demo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Stack<String> games = new Stack<>();

        int choice = 0;
        do{
            System.out.println("1. Add items");
            System.out.println("2. Remove items");
            System.out.println("3. Display Items");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Enter the number of items you want to add: ");
                int num = scanner.nextInt();
                scanner.nextLine();

                for(int i = 1; i <= num; i++){
                    System.out.print("Enter the item: ");
                    String game = scanner.nextLine();
                    games.push(game);
                }
            }

            else if(choice == 2){
                System.out.print("Enter the item you want to remove: ");
                String game = scanner.nextLine();
                games.remove(game);

            }
        }while (choice != 3);


        scanner.close();
    }
}
