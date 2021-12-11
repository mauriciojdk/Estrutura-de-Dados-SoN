import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<String>();

        tree.add("Mauricio");
        tree.add("Bruno");
        tree.add("Joao");

        System.out.println(tree);

        Iterator<String> iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(" ");
        System.out.println(tree.last());
        System.out.println(tree.first());
        System.out.println(" ");
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(" ");
        System.out.println(tree.isEmpty());

    }
}
