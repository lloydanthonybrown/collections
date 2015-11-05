package Lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lloyd on 11/2/2015.
 */
public class ExampleArrayList {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int aNumber;
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        for (int i=0; i<5; i++){
            System.out.println("Please enter an integer.");
            aNumber = userInput.nextInt();
            // Add the user input to the ArrayList
            myArrayList.add(aNumber);

        }
        System.out.println("The ArrayList contains this: " + myArrayList);
    }

    public ExampleArrayList{

    }
}
