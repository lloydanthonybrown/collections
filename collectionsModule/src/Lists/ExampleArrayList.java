package Lists;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Lloyd on 11/2/2015.
 */
public class ExampleArrayList {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int anInteger;
        int count = 0;
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>();
        ListIterator myListIterator = new ListIterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Object o) {

            }

            @Override
            public void add(Object o) {

            }
        };

        // Play with an integer ArrayList
        System.out.println("The current size of the array: " + myIntegerArrayList.size());
        System.out.println("Enter 5 integers.");
        for (int i=0; i<5; i++){
            System.out.println("Integer " + (count + 1) + ":");
            anInteger = userInput.nextInt();
            // Add the user input to the ArrayList
            myIntegerArrayList.add(anInteger);
            System.out.println("The size of the array after adding this integer: " + myIntegerArrayList.size());
            count ++;

        }

        System.out.println("The ArrayList contains this: " + myIntegerArrayList);
        System.out.println("The ending size of the array: " + myIntegerArrayList.size());

        // Play with a string ArrayList
        System.out.println("The value of the first element before changing it manually: " + myIntegerArrayList.get(0));
        myIntegerArrayList.set(0,42);
        System.out.println("The value of the first element after changing it manually: " + myIntegerArrayList.get(0));

        // Play with a list iterator
        for (int i=0; myListIterator.hasNext(); i++){
            System.out.println("The value for this index is: " + myIntegerArrayList.get(i));
        }

        // Play with removing a specific element
        System.out.println("The size of the array before removing the third element: " + myIntegerArrayList.size());
//        for(int i=0; i<myIntegerArrayList.size(); i++){
//            System.out.println(myIntegerArrayList(i));
//        }
        for (Integer item : myIntegerArrayList){
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.println("The value of the third element is: " + myIntegerArrayList.get(2));
        myIntegerArrayList.remove(2);
        System.out.println("The value of the third element is: " + myIntegerArrayList.get(2));
        System.out.println("The size of the array after removing the third element: " + myIntegerArrayList.size());
    }
}
