package biblioteca.model;

public class Novela extends Libro {
    public enum Tipo {
        Historica, Romantica, Policiaca, Realista, Ciencia_Ficcion, Aventuras
    }

    private Tipo tipo;

    public Novela() {
        super();
        this.tipo = null;
    }

    public Novela(String titulo, String autor, int numEjemplares, int numPrestados, Tipo tipo) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numEjemplares=" + getNumEjemplares() +
                ", numPrestados=" + getNumPrestados() +
                ", tipo=" + tipo +
                '}';
    }
}