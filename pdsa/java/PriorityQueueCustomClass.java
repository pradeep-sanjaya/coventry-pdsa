/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 21
PriorityQueue with a custom class
Implement Comparable interface, compareTo method
*/

package pdsa;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustomClass {

    static class Person implements Comparable<Person> {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id   = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "{id: " + id + ", name: " + name + "}";
        }

        @Override
        public int compareTo(Person person) {
            return (id == person.id) ? 0 : (id > person.id) ? 1 : -1;
        }
    }

    public static Queue<Person> queue = new PriorityQueue<>();

    public static void main(String[] args) {

        queue.add(new Person(10, "name1"));
        queue.add(new Person(20, "name2"));
        queue.add(new Person(30, "name3"));
        queue.add(new Person(40, "name4"));
        queue.add(new Person(50, "name5"));

        System.out.println("head element: " + queue.element());
        System.out.println("head peek: " + queue.peek());

        print();

        Person e1 = queue.remove();
        System.out.println("removed - queue: " + e1);

        Person e2 = queue.poll();
        System.out.println("removed - poll: " + e2);

        print();
    }

    public static void print() {
        System.out.println("\nIterating the queue");

        Iterator iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n");
    }
}
