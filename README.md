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

## Compilación y ejecución

Es un proyecto Maven. Para compilar y ejecutar:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="biblioteca.app.BibliotecaApp"
```

Al ejecutar se solicitarán datos para `libro2` por consola y se mostrarán pruebas de préstamo y devolución.

## Notas

- Se aplican abstracción, encapsulamiento e herencia según se pide.
- Clases: `Libro`, `LibroTexto`, `LibroTextoUNIAC`, `Novela`.


