import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "josé");
        aluno.put("Idade", "18");
        aluno.put("Media", "9.0");
        aluno.put("Turma", "5a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());//vai retornar as chaves
        System.out.println(aluno.values());//vai retornar os valores

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "20");
        aluno2.put("Media", "9.5");
        aluno2.put("Turma", "5b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));

    }
}