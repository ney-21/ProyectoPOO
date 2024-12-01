package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private List<String> episodios;

    // Constructor
    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    // Métodos
    public void agregarEpisodio(String episodio) {
        episodios.add(episodio);
    }

    public List<String> getEpisodios() {
        return episodios;
    }

    public int getNumero() {
        return numero;
    }
}
