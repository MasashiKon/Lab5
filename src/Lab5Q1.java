import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> intList = new ArrayList<>();
        Random randomNum = new Random();

        for (int i = 1; i <= 10; i++) {
            intList.add(randomNum.nextInt(51));
        }

        System.out.println(intList);

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input an integer");

        try {
            int inputInt = scan.nextInt();

            if (intList.contains(inputInt)) System.out.println(inputInt + " is in the list");
            else System.out.println(inputInt + " is not in the list");
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Invalid input");
        }

        scan.close();



    }
}
