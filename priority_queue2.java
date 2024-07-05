import java.util.*;

public class priority_queue2{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(99);
        pq.offer(3);
        pq.offer(-1); // smallest element in the pq will always be present at the first index of the pq (index = 0)
        System.out.println(pq);

        List<Integer> top3 = new ArrayList<>();
        // adding top 3 elements in to the list
        int index = 0;
        while(!pq.isEmpty()){ // loop to store the top 3 elements from the pq
            if(index == 3){  
                break;
            }
            top3.add(pq.poll());  // always the smallest element will be polled and after poll the heap rearranges the pq so that next smallest element in pq is at index postion 0 (index = 0)
            index++;
        }
        System.out.println(top3);  // this list will contain first 3 smallest values that were present in the pq
        System.out.println(pq); // now pq contains the remaining elements after polling the first 3 smallest elements

        List<studentMarks> ls = new ArrayList<>();
        ls.add(new studentMarks(45, 90));
        ls.add(new studentMarks(46, 67));
        ls.add(new studentMarks(99, 97));
        ls.add(new studentMarks(56, 92));
        ls.add(new studentMarks(65, 87));
        ls.add(new studentMarks(78, 91));

        // creating a priority queue of studentMarks class type
        PriorityQueue<studentMarks> pq2 = new PriorityQueue<>(ls); // adding all the elements in the ls to pq2

        List<studentMarks> studentMarksList = new ArrayList<>();
        // storing the top 3 student marks in studentMarksList 
        // this works because we have implemented studentMarks class with Comaparable Interface
        index = 0;
        while(!pq2.isEmpty()){
            if(index == 3){
                break;
            }
            studentMarksList.add(pq2.poll()); // taking the top 3 maths marks (highest)
            index++;
        }

        System.out.println(studentMarksList); // we get top 3 highest maths marks


        // we can also use Comparator to change the natural ordering the of the Wrapper classes which is ascending order
        // it is not recommended to override the compareTo() method of the wrapper classes because they are already implemented in their classes (Integer) which is used to sort in ascending order

        // we can implement the Comparator directly into the collections such as PriorityQueue, Lists, ArrayLists etc

        PriorityQueue<Integer> pq3 = new PriorityQueue<>(new myCustomComparator());  // this priority queue or any collection takes an comparator as parameter in their constructor so we can pass our own designed custom comparator inside this
        
        pq3.offer(3);
        pq3.offer(5);
        pq3.offer(1);
        pq3.offer(7);
        pq3.offer(9);
        pq3.offer(4);
        pq3.offer(8);

        System.out.println(pq3); // notice that now the pq3 stores the biggest element at the starting index instead of storing smallest element (which was the case while using natural ordering)
        // biggest element is stored at startinf index because we have used out custom designed Compator
        
        List<Integer> ls2 = new ArrayList<>();
        index = 0;
        while(!pq3.isEmpty()){
            if(index == 3){
                break;
            }
            ls2.add(pq3.poll()); // notice that now the first 3 biggest elements are polled because we have used the comparator
            index++;
        }
        System.out.println(ls2);

        // or we can directly implement the compare() function inisde the priorityQueue when declaring it using lambda

        PriorityQueue<Integer> pq4 = new PriorityQueue<>(( i1, i2) -> i2-i1);  // here we are direclty implementing the logic for compare() method which is (Integer i, Integer i2) -- i2-i1 for descending order
        // this is done using the lambda expression instead having to create a new separate custom comparator

        // we can also use the comparator for custom class datatypes too

        List<studentMarks> ls3 = new ArrayList<>();

        ls3.add(new studentMarks(36, 67));
        ls3.add(new studentMarks(55, 45));
        ls3.add(new studentMarks(45,67));
        ls3.add(new studentMarks(90, 76));

        PriorityQueue<studentMarks> psq1 = new PriorityQueue<>();

        for(studentMarks ele : ls3){
            psq1.add(ele);
        }

        System.out.println("Before using the comparator");
        System.out.println("smallest maths marks will be at index 0");
        System.out.println(psq1);

        // sorting the psq2 based on maths marks (descending order) using lambda expression method (not creating a extra custom comparator class)
        PriorityQueue<studentMarks> psq2 = new PriorityQueue<>((s1, s2) ->{
            return s2.getMaths()-s1.getMaths();
        });
        for(studentMarks ele: ls3){
            psq2.add(ele);
        }
        System.out.println("After sorting based on maths marks (descending)");
        System.out.println(psq2);








    }


}
