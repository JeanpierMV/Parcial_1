Sistema de Gestión de Biblioteca
en este trabajo implemente los requisitos del ejercico de programacion solicitado par lo del manejo de los libros.

 Diagrama UML de clases

```
             +--------------+
             |    Libro     |
             +--------------+
             | - titulo     |
             | - autor      |
             | - numEjempl. |
             | - numPrest.  |
             +--------------+
             | +prestamo()  |
             | +devolucion()|
             | +toString()  |
             +--------------+
                    ^
        +-----------+------------+
        |                        |
+---------------+         +--------------+
|  LibroTexto   |         |    Novela    |
+---------------+         +--------------+
| - curso       |         | - tipo       |
+---------------+         +--------------+
| +toString()   |         | +toString()  |
+---------------+         +--------------+
        |
        |
+-------------------+
| LibroTextoUNIAC   |
+-------------------+
| - facultad        |
+-------------------+
| +toString()       |
+-------------------+
```
 Compilación y ejecución

Es un proyecto Maven. Para compilar y ejecutar:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="biblioteca.app.BibliotecaApp"
```

Al ejecutar se solicitarán datos para `libro2` por consola y se mostrarán pruebas de préstamo y devolución.

 Notas

- Se aplican abstracción, encapsulamiento e herencia según se pide.
- Clases: `Libro`, `LibroTexto`, `LibroTextoUNIAC`, `Novela`.

se agrega atributos exzrta como anoPublicacion y numero Reservas y isbn
   Situaciones que impiden herencia
En Java algunas condiciones hacen imposible derivar una clase:

1. *Clase `final`* – si marcamos `public final class Libro { ... }`, nadie podría extenderla. En nuestro código no se usa `final`, pero sería un impedimento directo.
2. *Constructores privados* – una clase con todos sus constructores privados (p.ej. `private Libro() {}`) no puede ser subclassed fuera de su misma clase, porque la subclase no podría invocar `super()`.

