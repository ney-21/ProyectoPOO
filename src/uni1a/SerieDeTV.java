/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int numeroDeTemporadas; // Número total de temporadas
    private List<Temporada> temporadas; // Nueva relación con Temporada

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroDeTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.temporadas = new ArrayList<>(); // Inicialización de la lista
    }

    // Métodos para manejar el número de temporadas
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    // Métodos para manejar la lista de temporadas
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de Temporadas: " + numeroDeTemporadas);
        System.out.println("Temporadas:");
        for (Temporada temporada : temporadas) {
            System.out.println(" - Temporada " + temporada.getNumero() + ": " + temporada.getEpisodios().size() + " episodios");
        }
        System.out.println();
    }
}
