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
        System.out.println("Testing out the last() for alphabeticalTreeSet: " + alphabeticalTreeSet.first());
        System.out.println("Testing out the last() for alphabeticalTreeSet: " + alphabeticalTreeSet.last());
        alphabeticalTreeSet.comparator();

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
        System.out.println("A subset of the numericalTreeSet: " + numericalTreeSet.subSet(73,90));
        // Interesting to find that the subsets are exclusive by default.
        System.out.println("A more inclusive subset of the numericalTreeSet: " + numericalTreeSet.subSet(73,true,90,true));
        System.out.println("A tailset of the numericalTreeSet: " + numericalTreeSet.tailSet(73));
        // This boolean is talking about the parameterized value (whether to include or exclude it).
        System.out.println("A tailset and boolean of the numericalTreeSet: " + numericalTreeSet.tailSet(73,false));

        System.out.println("**************************************");
        System.out.println("SECTION FOR stringsTreeSet");
        System.out.println();
        stringsTreeSet.add("Grapes");
        stringsTreeSet.add("cherries");
        stringsTreeSet.add("Apples");
        stringsTreeSet.add("bananas");
        stringsTreeSet.add("Watermelons");

        System.out.println(stringsTreeSet);
        System.out.println("Current size of the stringsTreeSet: " + stringsTreeSet.size());
        System.out.println("Returns a boolean for the stringsTreeSet being empty or not: " + stringsTreeSet.isEmpty());
        stringsTreeSet.remove("Grapes");
        System.out.println("After removing 'Grapes': " + stringsTreeSet);

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
        try {
            System.out.println("Try to add all the elements from the numericalTreeSet to the alphabetical one.");
            alphabeticalTreeSet.addAll(numericalTreeSet);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Can't add different data types into a single collection.");
        }

        // Try entering null values in a TreeSet.
        // Doesn't allow null values! I'm curious - why does it display my error messages all over the place every other
        // time that I run this program? Are they being garbage collected in the mean time?
        try {
            stringsTreeSet.add(null);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Can't add a null value to this collection.");
        }

        // Try entering negative values in a TreeSet.
        // Nothing happened. I guess it worked!
        try {
            numericalTreeSet.add(-14);
            System.out.println(numericalTreeSet);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Can't add negative values to this collection.");
        }

        // Try removing something that doesn't exist.
        // Nothing happens, so far as I can tell.
        try {
            stringsTreeSet.remove("grapes");
            System.out.println(stringsTreeSet);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Can't remove an element that doesn't exist.");
        }

    }
}
