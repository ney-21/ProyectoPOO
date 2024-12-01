package uni1a;

public class Main {
    public static void main(String[] args) {
        // Crear actores
        Actor actor1 = new Actor("Brad Pitt", "Estados Unidos");
        Actor actor2 = new Actor("Leonardo DiCaprio", "Estados Unidos");

        // Crear una película y agregar actores
        Pelicula pelicula = new Pelicula("Once Upon a Time in Hollywood", 161, "Drama", "Columbia Pictures");
        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.mostrarDetalles();  // Mostrar detalles de la película

        // Crear temporadas y agregar episodios
        Temporada temporada1 = new Temporada(1);
        temporada1.agregarEpisodio("Episodio 1: La llegada");
        temporada1.agregarEpisodio("Episodio 2: El encuentro");

        // Crear una serie y agregar temporadas
        SerieDeTV serie = new SerieDeTV("Stranger Things", 60, "Ciencia Ficción", 2);
        serie.agregarTemporada(temporada1);
        serie.mostrarDetalles();  // Mostrar detalles de la serie

        // Crear un investigador
        Investigador investigador = new Investigador("Dr. John Smith", "Biología Marina");

        // Crear un documental y asignar un investigador
        Documental documental = new Documental("El Océano Profundo", 90, "Educación", "El Mar y sus Misterios");
        documental.setInvestigador(investigador);
        documental.mostrarDetalles();  // Mostrar detalles del documental

        // Crear un Video de YouTube
        VideoYouTube video = new VideoYouTube("Cómo Programar en Java", 20, "Educación", 0.5);
        video.mostrarDetalles();  // Mostrar detalles del video de YouTube

        // Crear un Cortometraje
        Cortometraje cortometraje = new Cortometraje("El Último Viaje", 15, "Drama", 9.0);
        cortometraje.mostrarDetalles();  // Mostrar detalles del cortometraje
    }
}
