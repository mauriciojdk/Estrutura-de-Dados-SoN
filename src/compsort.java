import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compsort {
    public static void main(String[] args) {
        List<person> arr = new ArrayList<person>();

        arr.add(new person("Mauricio", 18));
        arr.add(new person("Bruno", 21));
        arr.add(new person("Joao", 19));
        arr.add(new person("Junior", 33));
        arr.add(new person("Erick", 24));

        for (person p : arr){
            System.out.println(p.getNome() + " " + p.getIdade());
        }

        System.out.println(" ");

        Collections.sort((List) arr);

        for (person p : arr){
            System.out.println(p.getNome() + " " + p.getIdade());
        }
    }
}
