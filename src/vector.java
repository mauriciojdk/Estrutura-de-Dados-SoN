import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        int [] arr = new int[10];



        Vector v = new Vector<>(2, 1);
        System.out.println(v.capacity());
        v.addElement(1);
        v.addElement("a");

        System.out.println(v.size());
        v.addElement("a");
        System.out.println(v.capacity());


       /* while (v.iterator().hasNext()){
            System.out.println(v.iterator().next());
        }*/

    }

}