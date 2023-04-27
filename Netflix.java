public class Main {
    // Clase Pelicula
public class Pelicula {
    private String titulo;
    private String genero;
    private String creador;
    private int anio;
    private int duracion;
    private boolean visto;

    // Constructor default
    public Pelicula() {
        this.titulo = "";
        this.genero = "";
        this.creador = "";
        this.anio = 0;
        this.duracion = 0;
        this.visto = false;
    }

    // Constructor con titulo y creador
    public Pelicula(String titulo, String creador) {
        this.titulo = titulo;
        this.genero = "";
        this.creador = creador;
        this.anio = 0;
        this.duracion = 0;
        this.visto = false;
    }

    // Constructor con todos los atributos excepto visto
    public Pelicula(String titulo, String genero, String creador, int anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.anio = anio;
        this.duracion = duracion;
        this.visto = false;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getAnio() {
        return anio;
    }

    public int getDuracion() {
        return duracion;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Sobreescribir toString
    @Override
    public String toString() {
        return "Pelicula {" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }
}

// Clase Serie
public class Serie {
    private String titulo;
    private int numTemporadas;
    private boolean visto;
    private String genero;
    private String creador;
    private int duracion;

    // Constructor default
    public Serie() {
        this.titulo = "";
        this.numTemporadas = 1;
        this.visto = false;
        this.genero = "";
        this.creador = "";
        this.duracion = 0;
    }

    // Constructor con titulo y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numTemporadas = 1;
        this.visto = false;
        this.genero = "";
        this.creador = creador;
        this.duracion = 0;
    }

    // Constructor con todos los atributos excepto visto
    public Serie(String titulo, int numTemporadas, String genero, String creador, int duracion) {
        this.titulo = titulo;

}
