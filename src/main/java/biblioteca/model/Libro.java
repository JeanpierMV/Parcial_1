package biblioteca.model;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;
   
    private int anoPublicacion;
    private String isbn;
    private int numReservas; 

   
    public Libro() {
        this("", "", 0, 0, 0, "", 0);
    }

   
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this(titulo, autor, numEjemplares, numPrestados, 0, "", 0);
    }

    public Libro(String titulo, String autor, int numEjemplares, int numPrestados,
                 int anoPublicacion, String isbn, int numReservas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
        this.numReservas = numReservas;
    }

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

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumReservas() {
        return numReservas;
    }

    public void setNumReservas(int numReservas) {
        this.numReservas = numReservas;
    }

    // método préstamo
    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados++;
            return true;
        }
        return false;
    }

    
    public boolean reservar() {
        if (numPrestados >= numEjemplares) {
            numReservas++;
            return true;
        }
        return false; 
    }

  
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
                ", anoPublicacion=" + anoPublicacion +
                ", isbn='" + isbn + '\'' +
                ", numReservas=" + numReservas +
                '}';
    }
}
