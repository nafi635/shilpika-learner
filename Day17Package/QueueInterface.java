package Day17Package;

import java.util.PriorityQueue;

public class QueueInterface {
    public static void main(String[] args) {
        PriorityQueue<Integer> IntegersQueue = new PriorityQueue<>();
        IntegersQueue.add(5);
        IntegersQueue.add(2);
        IntegersQueue.add(3);
        IntegersQueue.add(1);
        IntegersQueue.add(6);
        IntegersQueue.add(7);
        IntegersQueue.add(8);
        System.out.println(IntegersQueue);
        System.out.println("Peek element is " + IntegersQueue.peek());
        System.out.println("Poll element is " + IntegersQueue.poll());
        IntegersQueue.offer (10);
        System.out.println("After offering element 10 to IntegersQueue " + IntegersQueue);
        System.out.println("IntegersQueue is converted into Array " + IntegersQueue.toString());
    }
}
