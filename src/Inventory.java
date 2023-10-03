import java.util.Scanner;

public class Inventory {
    public static void main(String[] args){
        // Show Intro
        System.out.println("Welcome to RPG inventory");
        String[] backpack = new String[8];
        Scanner console = new Scanner(System.in);
        String input;
        // have a menu that displays options: add, show all items, exit
        do{
            System.out.println("Main Menu");
            System.out.println("1. Add Item: ");
            System.out.println("2. Show All Items: ");
            System.out.println("3. Exit: ");
            System.out.println("Please Select [1-3]");
            input = console.nextLine();
            if ( input.equals("1")){
                addItem(console, backpack);
            }else if(input.equals("2")){
                displayBack(backpack);
            }else if(input.equals("3")){
                System.out.println("Goodbye.");
            }else{
                System.out.println("Invalid option");
            }


        }while(!input.equals("3"));

        //goodbye
        //use an array called a backpack
    }


    static void displayBack(String[] backpack){
        System.out.println("Items");
        for (int i = 0;  i < backpack.length; i++){
            System.out.printf("Slot #%s: %s%n", i+1, backpack[i] == null ? "[empty]" : backpack[i]);
        }

    }

    static void addItem(Scanner console, String[] backpack){
        System.out.println("Add an Item.");
        System.out.println("Slot #: ");
        int slot = Integer.parseInt(console.nextLine()) -1;
        if ( slot < 0 || slot >= backpack.length){

            return;
        }
        System.out.println("Item: ");
        String item = console.nextLine();
        backpack[slot] = item;


    }
}
