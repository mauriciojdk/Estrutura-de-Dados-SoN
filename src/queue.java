import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        queue.add("a");
        queue.add("b");
        queue.add("c");

        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue.element());
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());

    }


}
