package Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lloyd on 11/2/2015.
 */
public class ExampleHashMap {
    public static void main(String[] args){
        Map myHashMap = new HashMap();
        System.out.println("The current size of the hashmap is: " + myHashMap.size());
        myHashMap.put("Nathan Brown" , "19 years old");
        myHashMap.put("Greg Brown"   , "24 years old");
        myHashMap.put("Lloyd Brown"  , "26 years old");
        myHashMap.put("Julie Brown"  , "28 years old");
        myHashMap.put("Diana Brown"  , "30 years old");
        myHashMap.put("Keith Brown"  , "31 years old");
        myHashMap.put("Mark Brown"  , "60 years old");

        System.out.println("The current contents of the hashmap are: " + myHashMap);
        System.out.println("The current size of the hashmap is: " + myHashMap.size());

        System.out.println("Lloyd Brown's age: " + myHashMap.get("Lloyd Brown"));

        System.out.println("Does this hashmap contain the key Nathan Brown? " + myHashMap.containsKey("Nathan Brown"));
        System.out.println("Does this hashmap contain the value of 26? " + myHashMap.containsValue("26 years old"));

        System.out.println("The value of the key 'Greg Brown': " + myHashMap.get("Greg Brown"));
        System.out.println("Testing out the return of a keyset: " + myHashMap.keySet());

        // Apparently the put and replace methods do the same thing.
        System.out.println("The value of the key 'Keith Brown' before replacing it: " + myHashMap.get("Keith Brown"));
        myHashMap.put("Keith Brown", "104 years old");
        System.out.println("The value of the key 'Keith Brown' after replacing it: " + myHashMap.get("Keith Brown"));

        System.out.println("The value of the key 'Julie Brown' prior to replacing it: " + myHashMap.get("Julie Brown"));
        myHashMap.replace("Julie Brown", "28 years old", "64 years old");
        System.out.println("The value of the key 'Julie Brown' after replacing it: " + myHashMap.get("Julie Brown"));

        myHashMap.replace("Julie Brown", "28 years old", "64 years old");
        System.out.println("The value of the key 'Julie Brown' after replacing it: " + myHashMap.get("Julie Brown"));

        System.out.println("The contents of the hashmap prior to removing a key: " + myHashMap);
        System.out.println("Another view: " + myHashMap.keySet());
        myHashMap.remove("Mark Brown");
        System.out.println("The contents of the hashmap after removing a key: " + myHashMap);
        System.out.println("The keyset after removing a particular key: " + myHashMap.keySet());
        // How could I iterate through a keyset? I just want to see each key and its associated value, but in a different format.

        // See what happens when you try to retrieve a value from a partial key.
        try {
            System.out.println(myHashMap.get("Greg"));
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't use a partial key to find associated values.");
        }

        // See what happens when you try to retrieve a value from a hashmap as if it were an array.
        try {
            System.out.println(myHashMap.get(1));
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't find keys by their index. This is not an array.");
        }

        // Try to replace a value (using the put or replace methods) with a null value.
        try {
            myHashMap.put("Diana Brown", null);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't replace a value with null.");
        }

        // Try to replace a value (using the put or replace methods) with a negative value.
        try {
            myHashMap.put("Diana Brown", -17);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't replace a value with a negative integer.");
        }

        // Try to replace a value for a nonexistent key.
        try {
            myHashMap.put("Mom Brown", "Older Than A Dinosaur");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't replace a value for a non-existent key.");
        }


        // Try to change the value of a current key.
        try {
            myHashMap.put("Lloyd Brown", "99 years old");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You can't enter a duplicate key and value");
        }

        // Try to change a key.


//        for (int i = 0; i < myHashMap.size(); i++)

//        for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//
//        for (Map.Entry : myHashMap.entrySet())

    }
}
