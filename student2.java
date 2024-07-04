import java.util.Objects;
import java.util.*;

public class student2 implements Comparable<student2> { // implements Comparable class to perform some sorting operations
    String name;
    int rollno;

    public student2(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    @Override
    public String toString(){
        return "Name of student is: "+ name + " and USN is : "+ rollno;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        // Cast the object to the student class
        student std = (student) obj;
        return rollno == std.rollno;
    }

    @Override
    public int hashCode(){
        return Objects.hash(rollno); // different hashcode will be generated if the rollno is different or else same hashcode will be generated for both the objects hence that objects will not be added inside the Hashset
    }

    @Override
    public int compareTo(student2 o){ // this method is present inside the Comparable class
        return rollno - o.rollno; // return +ve integer if the student2.rollno is grater than object.rollno and -ve if it less than object.rollno and 0 if both are equal
    }

    // the hashcode for two objects will be same if the rollno is same
    // this way we make sure that we do not store duplicate values with same rollno be stored in the Set

    // to sort the elements according the names, we can do the following
    // @Override
    // public int compareTo(student2 o){ // this method is present inside the Comparable class
    //     return name.compareTo(o.name); // String class already implements the compareTo method se we can directly use to compare names (which are String)
    // }  i have commented this part because we cannot use 2 compareTo method in the same class..we can either sort rollno or names

}
