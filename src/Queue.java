
import java.util.PriorityQueue;
public class Queue {
    public static void main(String [] args){
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.add("B");
        pQueue.offer("C");
        pQueue.add("F");
        pQueue.offer("A");
        pQueue.add("L");
        pQueue.offer("D");
        pQueue.add("E");
        pQueue.offer("J");

        System.out.println("Head : "+pQueue.peek());
        System.out.println("Head : "+pQueue.element());

        while(!pQueue.isEmpty()){
            System.out.println(pQueue.poll()+" ");
        }
        System.out.println("\n");

        pQueue.add("B");
        pQueue.offer("C");
        pQueue.add("F");
        pQueue.offer("A");
        pQueue.add("L");
        pQueue.offer("D");
        pQueue.add("E");
        pQueue.offer("J");

        while (!pQueue.isEmpty()){
            System.out.println(pQueue);
            System.out.println("Removed ::"+pQueue.remove());
            System.out.println(pQueue);
            System.out.println();
        }
    }
}
