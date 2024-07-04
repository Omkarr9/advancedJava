//  generics means parameterized types. 
// using generics, it is possible to create classes that work with different data types.
// an entity such as class, interface or method that operates on a parameterized type is a generic entity

// generics basically allows a class to support multiple datatypes 

class Dog {

    String id;

    Dog(String id) {
        this.id = id;
    }
}

// lets create a generic class

class Dog2<T1> { // generic class with T1 is generic value

    T1 id; // generic data

    public Dog2(T1 id) {
        this.id = id;
    }

}

class Dog3<T1, T2> { // generic class having two generics

    T1 id1;
    T2 id2;

    public Dog3(T1 id1, T2 id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    // we can also have generic methods and its return type will be desired generic
    // data

    public T1 getid1() { // generic method with generic return type
        return id1;
    }

    public T2 getid2() {
        return id2;
    }

}





public class generics {
    public static void main(String[] args) {

        Dog d1 = new Dog("id1"); // this only accept String types values, but what if we want to pass any kind of
                                 // data type value?

        Dog2<Integer> d21 = new Dog2<>(12); // first, inserting integer value
        Dog2<String> d22 = new Dog2<>("doggy name"); // then inserting String value, this was not possible in normal
                                                     // class

        Dog3<Integer, String> d31 = new Dog3<>(31, "tommy"); // contains both datatypes because this class has two
                                                             // generics
        Dog3<String, Integer> d32 = new Dog3<>("rocky", 32); // contains both datatypes because this class has two
                                                             // generics

        System.out.println(d31.getid1()); // using generic methods
        System.out.println(d31.getid2()); // using generic methods

        System.out.println(d32.getid1()); // using generic methods
        System.out.println(d32.getid2()); // using generic methods

        // calling a generic method which is not inside an generic class
        printData("I am a generic method without using generic class"); // i am a string value
        printData(10); // i am an integer value
        
        // running non static generic method
        generics obj = new generics();
        obj.outputData("I am data");
        obj.outputData(12);

    }

    // we can also have generic methods without using generic class
    public static <T3> void printData(T3 data){  //  since this is a static method... we do not need to create a object of this method to run the method
        System.out.println(data);
    }

    public <T4> void outputData(T4 data){  // we need to create class object for this method to run since this is a non static method
        System.out.println("I am a public generic method");
        System.out.println(data);
        // replcae void with T4 if you want to return the value
    }
}
