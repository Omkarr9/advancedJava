import java.util.*;

public class hashMap {
    public static void main(String args[]){
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("omkar", 56);  // "omkar" is key and 56 is its value
        numbers.put("anurag", 57); // "anurag" is key and 57 is its value
        numbers.put("sudeep", 58); // "sudeep" is key and 58 is its value
        numbers.put("vishal", 59);
        numbers.put("sagar", 60);   

        System.out.println(numbers.get("omkar")); // get the value based on its key and if the given key is not present then it will return null value

        // all the keys are unique but values can be same

        numbers.put("omkar", 100); // this is override the previous value of "omkar" with the new value ie 100

        // to avoid overriding the value if have to write the put method inside a if condition

        if(!numbers.containsKey("omkar")){ // if the map does not contain "omkar" key then it will add this element into the map
            numbers.put("omkar", 99);
        }

        System.out.println(numbers.isEmpty()); // returns true or false if the map is empty
        // another method alternative of if condition

        numbers.putIfAbsent("omkar", 69); // if the map does not contain "omkar" key then it will add this element key-value pair into the map

        System.out.println(numbers);  // notice that elements are not printed in sorted order (according to key characters)

        numbers.remove("sagar");  // removes the element based upon the key

        System.out.println(numbers.containsValue(56));  // return true or false if the value is present inside the map

        // how to iterate through a map? using entry class

        for(Map.Entry<String, Integer> e: numbers.entrySet()){ // to iterate over both keys and values simulataneously, we can use the entrySet()
            System.out.println(e);  // prints both key and value pair
            System.out.println(e.getKey()); // prints only the key
            System.out.println(e.getValue());  // prints only the value
        }

        //  we can use keySet() to iterate only over the keys
        for(String keys : numbers.keySet()){
            System.out.println(keys);
        }

        // we can use values() to iterate only over the values
        for(Integer values : numbers.values()){
            System.out.println(values);
        }

        // to iterate over both key and values simultaneously we can use entrySet as discussed above

        // time complexity of HashMap is O(1)
        

    }
    
}
