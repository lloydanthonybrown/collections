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
        myHashMap.put("Lloyd Brown"  , "26 years old");
        myHashMap.put("Keith Brown"  , "26 years old");
        myHashMap.put("Diana Brown"  , "26 years old");
        myHashMap.put("Julie Brown"  , "26 years old");
        myHashMap.put("Nathan Brown" , "26 years old");
        myHashMap.put("Greg Brown"   , "26 years old");

        System.out.println("The current contents of the hashmap are: " + myHashMap);

//        for (int i = 0; i < myHashMap.size(); i++)

        for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        for (Map.Entry : myHashMap.entrySet())

        try{

        }
        catch (Exception e){

        }

    }
}
