/**
 * Class VideoYouTube
 */
package uni1a;

// Subclase VideoYouTube que extiende de ContenidoAudiovisual
public class VideoYouTube extends ContenidoAudiovisual {
    private double duracionEnHoras; // Duración en horas

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, double duracionEnHoras) {
        super(titulo, duracionEnMinutos, genero);
        this.duracionEnHoras = duracionEnHoras;
    }

    // Métodos
    public double getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(double duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Duración en horas: " + duracionEnHoras);
        System.out.println();
    }
 // Añadir un atributo Actor en VideoYouTube
    private Actor creador;

    // Método para asociar un creador (actor)
    public void setCreador(Actor creador) {
        this.creador = creador;
    }

    public Actor getCreador() {
        return creador;
    }

}
