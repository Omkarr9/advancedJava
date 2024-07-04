import java.util.Objects;
import java.util.*;

public class student {
    String name;
    int rollno;

    public student(String name, int rollno){
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

    // the hashcode for two objects will be same if the rollno is same

    // this way we make sure that we do not store duplicate values with same rollno be stored in the Set

}
