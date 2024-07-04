// a wrapper class in java is a class whose object wraps or contains primitive data types (int, char, long, float, double, boolean) etc

// when we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types

// some of the wrapper classes are Character, Byte, Integer, Long, Double, Boolean (these usually start with capital letter unlike primitive data types which start with small letters)


// autoboxing and unboxing

// autoboxing - the automatic converstion of primitive types to the object of their corresponding wrapper classes is known as autoboxing
// for example - converstion of int to Intger, long to Long, double to Double etc

// unboxing - it is just the reverse process of autoboxing. automatically converting an object of a wrapper class to its corresponding primitive type is know an unboxing.
// for example - conversion of Integer to int, Long to long, Double to double etc

public class wrapperClasses{
    public static void main(String args[]){
        Integer obj1 = Integer.valueOf(12); // method one (autoboxing)

        Integer obj2 = 12; // method 2 (autoboxing)

        Integer obj22 = Integer.valueOf("13"); // this value will be automatically converted from String to an int
        Integer obj222 = Integer.valueOf("omkar"); // this will throw an error since omkar is not really and integer, the String should contain a integer
        // String str = obj22; // this will not work because the value is in the form int
        int ii = obj22;
        System.out.println(ii);
        System.out.println(ii*4); // this will multiple ii values with 4

        int i = obj1; // unboxing (assigning wrapper class value to a primitive data type)

        Double obj3 = Double.valueOf(1.345); // autoboxing

        double j = obj3; // unboxing

        // ArrayList<int> arrlist = new ArrayList<>(); // this is not possible because be cannot pass primitive datatypes

    }
}