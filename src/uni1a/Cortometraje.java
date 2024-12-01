/**
 * Class Cortometraje
 */
package uni1a;

// Subclase Cortometraje que extiende de ContenidoAudiovisual
public class Cortometraje extends ContenidoAudiovisual {
    private double calificacion; // Calificación del cortometraje

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, double calificacion) {
        super(titulo, duracionEnMinutos, genero);
        this.calificacion = calificacion;
    }

    // Métodos
    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Calificación: " + calificacion);
        System.out.println();
    }
 // Añadir un atributo Actor en Cortometraje
    private Actor actorPrincipal;

    // Método para asociar un actor principal
    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

}
