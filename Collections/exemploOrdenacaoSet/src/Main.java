import org.w3c.dom.ls.LSOutput;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Imprimir ordem aleatória");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Ozark", "Drama", 45));
            add(new Serie("Baki", "Anime", 25));
            add(new Serie("O atirador", "Ação", 45));
        }};

        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Imprimir ordem inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Ozark", "Drama", 45));
            add(new Serie("Baki", "Anime", 25));
            add(new Serie("O atirador", "Ação", 45));
        }};

        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Imprimir na ordem natural (tempo episódio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        System.out.println(minhasSeries2);

        System.out.println("Ordem Nome Genero TempoEpisodio)");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

        for (Serie serie:minhasSeries3) {
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


    }


}

