package Sets;

import java.util.TreeSet;

/**
 * Created by Lloyd on 11/2/2015.
 */
public class ExampleTreeSet {
    public static void main(String[] args){
        TreeSet alphabeticalTreeSet = new TreeSet();
        TreeSet numericalTreeSet = new TreeSet();
        TreeSet stringsTreeSet = new TreeSet();

        System.out.println("**************************************");
        System.out.println("SECTION FOR alphabeticalTreeSet");
        System.out.println();
        alphabeticalTreeSet.add("A");
        alphabeticalTreeSet.add("X");
        alphabeticalTreeSet.add("d");
        alphabeticalTreeSet.add("P");
        alphabeticalTreeSet.add("q");
        alphabeticalTreeSet.add("s");
        alphabeticalTreeSet.add("M");
        System.out.println(alphabeticalTreeSet);
        System.out.println("Current size of the alphabeticalTreeSet: " + alphabeticalTreeSet.size());
        System.out.println("Returns a boolean for the alphabeticalTreeSet being empty or not: " + alphabeticalTreeSet.isEmpty());
        System.out.println("Testing out the last() for alphabeticalTreeSet: " + alphabeticalTreeSet.last());
        // use the addAll() with a different collection as a parameter.
        alphabeticalTreeSet.addAll(numericalTreeSet);

        System.out.println("**************************************");
        System.out.println("SECTION FOR numericalTreeSet");
        System.out.println();
        numericalTreeSet.add(9);
        numericalTreeSet.add(4);
        numericalTreeSet.add(66);
        numericalTreeSet.add(73);
        numericalTreeSet.add(14);
        numericalTreeSet.add(141);
        numericalTreeSet.add(48);
        numericalTreeSet.add(90);
        numericalTreeSet.add(85);
        System.out.println(numericalTreeSet);
        System.out.println("Current size of the numericalTreeSet: " + numericalTreeSet.size());
        System.out.println("Returns a boolean for the numericalTreeSet being empty or not: " + numericalTreeSet.isEmpty());

        System.out.println("**************************************");
        System.out.println("SECTION FOR stringsTreeSet");
        System.out.println();
        System.out.println(stringsTreeSet);
        System.out.println("Current size of the stringsTreeSet: " + stringsTreeSet.size());
        System.out.println("Returns a boolean for the stringsTreeSet being empty or not: " + stringsTreeSet.isEmpty());

        System.out.println("**************************************");
        System.out.println("SECTION FOR nasty paths");
        System.out.println();
        // Try to add an element that already exists in the treeset. See what happens. Was it duplicated, replaced,
        // or something else?
        // Honestly, I have no idea if it replaced the element (completing the requested action) or just ignored it.
        try {
            System.out.println("Going to try to add 'A' to the alphabeticalTreeSet. ");
            System.out.println("What the alphabeticalTreeSet currently looks like: " + alphabeticalTreeSet);
            alphabeticalTreeSet.add("A");
            System.out.println("What the alphabeticalTreeSet looks like after: " + alphabeticalTreeSet);

        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Couldn't add that element.");
        }

        // Try to add different data types in the same TreeSet, like floats, doubles, integers and strings.
        // Try entering negative or null values in a TreeSet.


    }
}
