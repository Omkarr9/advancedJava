// priority_queue2.java file uses this class (code)
// this class also uses Comparable Interface which is always done at the class level

import java.util.PriorityQueue;

public class studentMarks implements Comparable<studentMarks>{
    private int maths;
    private int physics;

    public int getMaths(){ // getter for maths
        return maths;
    }

    public int getPhysics(){ // getter for physicss
        return physics;
    }

    public studentMarks(int maths, int physics){ // constructor for maths and physics values
        this.maths = maths;
        this.physics = physics;
    }

    public String toString(){
        return "Marks in Maths: " +maths +"\nMarks in Physics: " + physics ;
    }

    @Override
    public int compareTo(studentMarks o) {  // Object is the current object and o is the object that passed as a parameter
        // return o.maths - this.maths; // sorting the maths marks in descending order so (o.maths - this.maths) 
        return this.maths - o.maths;
        // if we wanted to sort ascending order then we have return, this.maths - o.maths

        // if return value is +ve then object element which is used first for subtracting will considered (in this case it is o.maths) since it will be bigger than this.maths
        // if the return value is -ve then object element which is used as substracter will be considered (in this case it is this.maths) since it will bigger than o.maths



        
    }
}
