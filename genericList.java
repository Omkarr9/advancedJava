import java.util.*;

public class genericList <T> implements Iterable <T> { // by creating the class with <T> generic parameter, we can create an object of this class with any datatype(Integer, String etc) in the main function
// this class implements the Iterable because we want to iterate over the genericList and we can only do it by implementing the Iterable


    private T[] items;  // this is a list of type generic ie T[]
    private int size;

    public genericList(){
        size = 0;
        items = (T[]) new Object[100]; // creating an array of objects type which is then type casted to generic <T> because we cannot directly create a array of generic type like T[] tlist = new T[100];
    }

    public void add(T element){ // method which add any element of <T> type into the items array which is of type <T>
        items[size++] = element;
    }

    public T getItemAtIndex(int index){ // this method returns <T> value item at the index from the array items
        return items[index];
    }
    @Override
    public Iterator<T> iterator(){ // the iterator() method must always return an instance of Iterator<T>
        return new GenericListIterator(this);
    }
    // creating a class which implements Iterator inside the genericList class itself
    private class GenericListIterator implements Iterator<T>{  // Iterator must be implemented if the class is implementing Iterable
        private genericList<T> list;
        private int index = 0;
        public GenericListIterator(genericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext(){
            return index < list.size;
        }

        @Override
        public T next(){
            return list.items[index++];
        }
    }

    public static void main(String[] args) {
        genericList<Integer> l1 = new genericList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        Iterator<Integer> iteratorObj = l1.iterator();

        // we cannot iterate through the array(list) like this because this array or list is of generic type
        // for(int ele : l1){
        //     System.out.println(ele);
        // }

        while(iteratorObj.hasNext()){
            System.out.println(iteratorObj.next());
        }

        // now this will work after implementing the Iterable interface
        for(Integer ele : l1){
            System.out.println(ele);
        }   

    }
}

    
