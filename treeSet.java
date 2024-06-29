// treeSet is similar to linkedHashset but all the elements are sorted automatically

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class treeSet {
    public static void main(String args[]){
        TreeSet tset = new TreeSet<>();

        TreeSet t2set = new TreeSet<>(Collections.reverseOrder());  // makes elements get stored in reverse order (descending order)

        tset.add(99);
        tset.add(78);
        tset.add(95);
        tset.add(66);
        tset.add(4);

        t2set.add(99);
        t2set.add(78);
        t2set.add(95);
        t2set.add(66);
        t2set.add(4);

        System.out.println(tset); // notice the elements are sorted automatically

        System.out.println(t2set); // reverse ordered because used Collection.reverseOrder()

        // what if we had primitive data value to be stored inside the set? like student name and roll number...how do you differentiate it?

        // rollno of two students cannot be same

        // lets see this using student class that we have created

        Set<student> studentSet = new HashSet<>();

        studentSet.add(new student("omkar", 56));
        studentSet.add(new student("anurag", 57));
        studentSet.add(new student("sudeep", 58));
        studentSet.add(new student("omkar", 56));  // this is an duplicate value which is stored in set even though it it same as first value element;

        System.out.println(studentSet); // notice it is printing "omkar" 56 two times even though they are same values

        // how do we check and make sure that no same values are added to the set?
        // we have to create a .equals() method inside the student class to differentiate two values (in this case it is the rollno)

        System.out.println(studentSet); // after updating the equals() method inside the student class we are able to differentiate the rollno

        student s1 = new student("rajesh", 99);
        student s2 = new student("ramesh", 99); // name is different but the rollno is same

        System.out.println(s1.equals(s2)); // notice that this will return true because both objects have same rollno and in the equals() method inside the student class we define the equals() method to return true if the rollno is same




        




    }
}