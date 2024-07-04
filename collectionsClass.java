import java.util.*;

public class collectionsClass {
    public static void main(String args[]){
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(1);
        arrList.add(4);
        arrList.add(3);
        arrList.add(10);
        arrList.add(5);
        arrList.add(7);
        arrList.add(6);
        arrList.add(9);
        arrList.add(8);
        arrList.add(9);

        // Collections class can be used with any java collection like arrayList, HashMap, linkedList, TreeMap, queue, stack

        // note that Collections class does not work with normal Arrays or Lists

        System.out.println(arrList);

        System.out.println(Collections.min(arrList)); // returns the min element in the arrayList
        System.out.println(Collections.max(arrList)); // returns the max element in the arrayList

        System.out.println(Collections.binarySearch(arrList, 5)); // returns the index value using binary search

        System.out.println(Collections.frequency(arrList, 9)); // returns how many times the element is appearing in the arrayList

        Collections.sort(arrList); // sorts the given arrayList

        System.out.println(arrList);

        Collections.sort(arrList, Comparator.reverseOrder()); // using Comparator class we can manage the order the elements...we can also make our custom sorting rules..go to the last part of the code for its implementation

        // how to sort custom classes like the student class that we created earlier

        // what if we had to sort the elements based on their rollno or names?

        List<student2> stulist = new ArrayList<student2>();

        stulist.add(new student2 ("omkar", 56));
        stulist.add(new student2 ("anurag", 43));
        stulist.add(new student2 ("sudeep",86));
        stulist.add(new student2 ("vishal", 23));
        stulist.add(new student2 ("kartik", 32));

        student2 s1 = new student2("name1", 3);
        student2 s2 =new student2("name2", 1);

        // how can we sort these elements?

        // we have to implement compareTo  method inside the custom class student2 
        // after implementing the compareTo method inside the student2 class we can sort this arrayList

        Collections.sort(stulist); // now this sort method uses compareTo method that we have implemented in the student2 class
        System.out.println(stulist);

        System.out.println(s1.compareTo(s2)); // this will return 2 as 3-1 is 2 as discussed in the student2 class

        Collections.sort(stulist,new Comparator<student2>() { // sorting the stulist according to their names using Comparator interface
            @Override
            public int compare(student2 obj1, student2 obj2){
                return obj1.name.compareTo(obj2.name);
            }
            
        });

        System.out.println(stulist);

        Collections.sort(stulist,new Comparator<student2>() { // sorting the stulist according to their rollno using Comparator interface
            @Override
            public int compare(student2 obj1, student2 obj2){
                return Integer.compare(obj1.rollno, obj2.rollno);
            }  
        });

        // The reason why compareTo works fine for String is that String is an object in Java and implements the Comparable interface. 
        // This interface defines the compareTo method for comparing objects of the same type. 
        // Primitive types like int, however, do not have methods because they are not objects; they are basic data types.


    }
}
