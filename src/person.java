import java.util.Comparator;

public class person implements Comparator<person>, Comparable<person> {

    private String nome;
    private Integer idade;

    person(){
    }

    person(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int compare(person o1, person o2) {
        return o1.idade - o2.idade;
    }

    @Override
    public int compareTo(person o) {
        return this.nome.compareTo(o.nome);
    }
}
