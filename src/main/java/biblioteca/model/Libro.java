package biblioteca.model;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    // constructor por defecto
    public Libro() {
        this("", "", 0, 0);
    }

    // constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    // getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }

    // método préstamo
    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados++;
            return true;
        }
        return false;
    }

    // método devolución
    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numEjemplares=" + numEjemplares +
                ", numPrestados=" + numPrestados +
                '}';
    }
}