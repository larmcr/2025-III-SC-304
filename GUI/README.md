# GUI

Esta carpeta contiene un archivo hecho en **Java** llamado `Interfaz.java`.

Dicho archivo se puede compilar de la siguiente forma:

```bash
$ javac Interfaz.java
```

Generando varios archivos `.class`, por lo que se podrá ejecutar invocando la máquina virtual de **Java**:

```bash
$ java Interfaz
```

Esto abrirá una ventana gráfica que indica que es una calculadora de polinomios. En ella se pueden introducir operandos y operadores por medio de los botones, pero se le eliminó totalmente la funcionalidad de calcular, es decir, solo muestra valores, no calcula.

Lo anterior con la idea de proveer un ejemplo de cómo se podría hacer una interfaz gráfica utilizando los paquetes estándar de **Java** (_AWT_ y _Swing_), así como obtener y utilizar los valores introducidos por el usuario al usar los botones.
