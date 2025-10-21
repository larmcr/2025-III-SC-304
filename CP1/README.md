# Caso Práctico 1

| Curso                   | Estructuras de Datos                  |
| :---------------------- | :------------------------------------ |
| Código                  | SC-304                                |
| Profesor                | Luis Andrés Rojas Matey               |
| Valor                   | 15 %                                  |
| Fecha y hora de entrega | Lunes 27 de octubre antes de las 6 pm |

<br />

- [Indicaciones generales](#indicaciones-generales)
- [Indicaciones específicas](#indicaciones-específicas)
  - [Recursividad](#recursividad)
    - [_Improvement_](#improvement)
    - [_Update_](#update)
  - [Pilas](#pilas)
    - [_Improvement_](#improvement-1)
    - [_Update_](#update-1)
  - [Colas](#colas)
    - [_Improvement_](#improvement-2)
    - [_Update_](#update-2)
- [Rúbrica de evaluación](#rúbrica-de-evaluación)
- [Entregables](#entregables)

<br />

## Indicaciones generales

Este **_Caso Práctico_** consta de tres proyectos: **Recursividad**, **Pilas** y **Colas**. Estos no tienen relación entre sí, es decir, son independientes.

Lo primero que debe hacer es copiar esta carpeta (`CP1`), con todo su contenido (incluyendo este archivo `README.md`), a su propio repositorio para que lo trabaje desde allí.

Dos de los proyectos (**Pilas** y **Colas**) tienen, cada uno, una _Interface_. En estas _Interfaces_ no está permitido hacer ningún cambio que afecte sus "firmas", es decir, sus definiciones y métodos. Lo único que sí es posible agregarles es el _Package_ al cual pertenecen (esto en caso de que, por ejemplo, se requiera apegar a alguna estructura definida por un editor o IDE).

Cada proyecto tiene una _Class_, la cual contiene su propio método `main`. Este método no puede ser modificado bajo ninguna circunstancia. Tampoco se debe imprimir nada en la Consola manualmente, es decir, no se debe agregar ningún `System.out.print...`, ya que lo necesario para mostrar en Consola ya está contenido en los respectivos métodos `main`. Adicionalmente, no es permitido utilizar los bloques de _Try/Catch/Finally_ (`try {...} catch {...} finally {...}`) para "atrapar" posibles excepciones.

En cada proyecto se debe trabajar cada una de las siguientes tres secciones:

- **_Errors_**: arreglar los errores de compilación.
- **_Improvement_**: mejorar algún componente o lógica de ejecución.
- **_Update_**: incluir un nuevo componente o lógica de ejecución.

Los **_Errors_** sin arreglar no permiten la ejecución del programa, por lo que esto es lo primero que se debe resolver.

En cada proyecto se le debe indicar al compilador que compile el _Class_. Por ejemplo, para la _Class_ `Numbers` del proyecto **Recursividad**, se debe compilar de la siguiente forma:

```bash
$ javac Numbers.java
```

<br />

## Indicaciones específicas

A continuación, las especificaciones funcionales y técnicas para cada uno de los tres proyectos.

<br />

### Recursividad

El objetivo de este programa es la impresión de los denominados [Números Metálicos](https://es.wikipedia.org/wiki/N%C3%BAmero_met%C3%A1lico), utilizando tres estrategias: una fórmula directa, un algoritmo recursivo y otro iterativo.

Este proyecto contiene una única _Class_ llamada `Numbers`. Los únicos cambios de código (aparte de aquellos indicados por los errores de compilación) deben hacerse en los métodos privados (`private`), ya que los públicos (`public`) están correctos y funcionales. No está permitido cambiar el tipo de dato flotante utilizado (`double`) ni tampoco su redondeo (que utiliza 10 dígitos decimales).

El método `formula` contiene la implementación de la ecuación directa para el cálculo de cada número metálico: `formula(z) = (z + √(4 + z²)) / 2`. Por ejemplo:

- `formula(0) = (0 + √(4 + 0²)) / 2 ≈ 1.0`
- `formula(1) = (1 + √(4 + 1²)) / 2 ≈ 1.6180339887`
- ...
- `formula(9) = (9 + √(4 + 9²)) / 2 ≈ 9.1097722286`

El resultado final del proyecto (con todos los cambios de manera satisfactoria), al ejecutarse, debería desplegar lo siguiente:

```
$ java Numbers

[0] Platinum
 ↳ formula(0)   ≈ 1.0
 ↳ recursive(0) ≈ 1.0
 ↳ iterative(0) ≈ 1.0

[1] Golden
 ↳ formula(1)   ≈ 1.6180339887
 ↳ recursive(1) ≈ 1.6180339887
 ↳ iterative(1) ≈ 1.6180339887

[2] Silver
 ↳ formula(2)   ≈ 2.4142135624
 ↳ recursive(2) ≈ 2.4142135624
 ↳ iterative(2) ≈ 2.4142135624

[3] Bronze
 ↳ formula(3)   ≈ 3.3027756377
 ↳ recursive(3) ≈ 3.3027756377
 ↳ iterative(3) ≈ 3.3027756377

[4] Copper
 ↳ formula(4)   ≈ 4.2360679775
 ↳ recursive(4) ≈ 4.2360679775
 ↳ iterative(4) ≈ 4.2360679775

[5] Nickel
 ↳ formula(5)   ≈ 5.1925824036
 ↳ recursive(5) ≈ 5.1925824036
 ↳ iterative(5) ≈ 5.1925824036

[6] Aluminum
 ↳ formula(6)   ≈ 6.1622776602
 ↳ recursive(6) ≈ 6.1622776602
 ↳ iterative(6) ≈ 6.1622776602

[7] Iron
 ↳ formula(7)   ≈ 7.1400549446
 ↳ recursive(7) ≈ 7.1400549446
 ↳ iterative(7) ≈ 7.1400549446

[8] Tin
 ↳ formula(8)   ≈ 8.1231056256
 ↳ recursive(8) ≈ 8.1231056256
 ↳ iterative(8) ≈ 8.1231056256

[9] Lead
 ↳ formula(9)   ≈ 9.1097722286
 ↳ recursive(9) ≈ 9.1097722286
 ↳ iterative(9) ≈ 9.1097722286
```

<br />

#### _Improvement_

Actualice el método `recursive` para que calcule correctamente el `n`-ésimo valor de cada sucesión. La definición de la función recursiva (nombrada de ahora en adelante como `f`) del `n`-ésimo valor utilizando un factor `z` (que, para efectos prácticos, es el índice del arreglo de los metales), se define como:

- `f(z, n) =`
  - `1` si `n = 0`
  - `1` si `n = 1`
  - `z • f(z, n - 1) + f(z, n - 2)` si `n > 2`

Es decir:

```
f(z, 0) = 1
f(z, 1) = 1
f(z, n) = z • f(z, n - 1) + f(z, n - 2)
```

Por ejemplo, `f(2, 5) = 41`, ya que:

```
f(2, 0) = 1
f(2, 1) = 1
f(2, 2) = 2 • f(2, 1) + f(2, 0) = 2 • 1 + 1 = 2 + 1 = 3
f(2, 3) = 2 • f(2, 2) + f(2, 1) = 2 • 3 + 1 = 6 + 1 = 7
f(2, 4) = 2 • f(2, 3) + f(2, 2) = 2 • 7 + 3 = 14 + 3 = 17
f(2, 5) = 2 • f(2, 4) + f(2, 3) = 2 • 17 + 7 = 34 + 7 = 41
```

Una vez arreglado este método (`recursive`), ya se debería observar en la Consola (cuando se ejecute el programa), los valores de cada número metálico. Esto gracias a que utiliza la técnica de dividir el resultado del `n`-ésimo con su número anterior: `f(z, n) / f(z, n - 1)`. Es importante mencionar que se definió `25` como `n` para este programa de manera global, ya que se comprobó que no desborda la pila de ejecución, por lo que la razón (división) estará siempre dada por: `f(z, 25) / f(z, 24)`.

<br />

#### _Update_

Implemente el mismo algoritmo de modo iterativo, es decir, utilizando bucles (`do`, `for`, `while`). Para esto se debe actualizar el método `iterative`.

<br />

### Pilas

Este programa utiliza una implementación de la estructura de pila con capacidad `n`, generando `n + 1` números aleatorios flotantes para llenarla (comprobando así el manejo del _Overflow_) y a la vez tratando de vaciarla `n + 1` veces (para verificar el _Underflow_).

En este caso, los atributos de tipo privado (`private`) no deben ser manipulados (no los debe modificar). Tampoco debe modificar el constructor.

Para la ejecución del programa (con todos los cambios correctamente hechos), se le debe proveer por argumento un número natural mayor o igual que cero (este número siempre será proveído y estará correcto, por lo que no se le debe hacer ninguna validación). Así, por ejemplo, si `n = 3`, entonces se tendría que mostrar algo similar a esto (recuerde que los números flotantes generados son aleatorios):

```
$ java TheStack 3

Pushing {capacity + 1}
 ↳ push(0.7893276920086053) → true
 ↳ push(0.682761232075231) → true
 ↳ push(0.7678869751857267) → true
 ↳ push(0.004284304800150518) → false

Pushed {full}
 ↳ print() → [0.7893276920086053, 0.682761232075231, 0.7678869751857267]
   ↳ peek() → 0.7678869751857267
   ↳ size() → 3
   ↳ empty() → false

Popping {capacity + 1}
 ↳ pop() → 0.7678869751857267
 ↳ pop() → 0.682761232075231
 ↳ pop() → 0.7893276920086053
 ↳ pop() → null

Popped {empty}
 ↳ print() → []
   ↳ peek() → null
   ↳ size() → 0
   ↳ empty() → true
```

<br />

#### _Improvement_

Arregle el método `push` para corregir la ejecución del programa. Note que para esta implementación de `push`, este debe retornar un valor _Boolean_:

- `true` si el ítem se pudo insertar.
- `false` si el ítem no se pudo insertar debido a un "desbordamiento" de la pila.

<br />

#### _Update_

Modifique los métodos `pop` y `peek` para que retornen `null` en caso que la pila esté vacía.

<br />

### Colas

Este programa genera `n` cantidad de [nucleótidos](https://es.wikipedia.org/wiki/Nucle%C3%B3tido) de ADN aleatoriamente (representados por su primera letra), los inserta en una cola y luego vacía la cola para generar un arreglo de codones. Un codón es una tripleta de nucleótidos que, en un ámbito biológico, generaría alguno de los aminoácidos.

Al igual que con el proyecto de **Pilas**, ni los atributos privados (`private`) ni el contructor pueden ser modificados. Como se puede observar, para la implementación de la cola, se está haciendo uso de la _Interface_ [Deque](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Deque.html) y una de sus implementaciones estándar llamada [ArrayDeque](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayDeque.html).

Para esta ocasión, la cola no tendrá límite de capacidad. Además la cola se muestra de izquierda a derecha, es decir, el primer elemento se verá más a la izquierda y el último (donde se agregan los nuevos) más a la derecha.

Una vez que el programa esté debidamente modificado, entonces se debe ejecutar con un argumento `n` que será un número natural mayor o igual que cero y múltiplo de tres. Este número `n` siempre será proveído de forma correcta, por lo que no se debe hacer validaciones sobre él. Así, por ejemplo, si se ejecuta el programa con `n = 15`, entonces se debería mostrar also similar a esto (note que las letras que representan los nucleótidos son agregadas de manera aleatoria).

```
$ java TheQueue 15

Filled {full}
 ↳ print() → [C, T, C, T, G, C, A, C, G, G, T, T, G, A, A]
   ↳ getFront() → C
   ↳ getSize() → 15
   ↳ isEmpty() → false

getCodons() → [CTC, TGC, ACG, GTT, GAA]

End {empty}
 ↳ print() → []
   ↳ getFront() → null
   ↳ getSize() → 0
   ↳ isEmpty() → true
```

<br />

#### _Improvement_

Actualice los métodos `dequeue` y `getFront` para obtener el primer elemento de la cola, donde `dequeue` lo retorna y lo quita de la cola, y `getFront` solo lo retorna sin quitarlo. En caso de que la cola esté vacía, se debe retornar un `null`. Para estos casos, no se puede usar ningún condicional (`if ... else ...` o `... ? ... : ...`), por lo que debe investigar lo suministrado por el componente [ArrayDeque](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayDeque.html).

<br />

#### _Update_

Implemente el método `getCodons` para que retorne las ternas de nucleótidos. Para esto, debe ir vaciando la cola (uno a uno cada elemento) y, al formarse una terna, agregarla como un solo ítem en un arreglo de _String_ de tamaño fijo. Este arreglo de _String_ debe tener un tamaño de exactamente un tercio del valor de `n` (es decir, `n / 3`).

Como se puede notar, la cola quedará vacía una vez este método se invoque.

<br />

## Rúbrica de evaluación

|                   | **Recursividad** | **Pilas** | **Colas** |
| ----------------: | :--------------: | :-------: | :-------: |
|      **_Errors_** |        1         |     1     |     1     |
| **_Improvement_** |        2         |     2     |     2     |
|      **_Update_** |        2         |     2     |     2     |
|       **Totales** |      **5**       |   **5**   |   **5**   |

<br />

## Entregables

En la raíz de su repositorio, en el _Branch_ `main`, debe estar esta carpeta (`CP1`) y todo su contenido (incluyendo este archivo `README.md`), con todos los cambios en el código según las especificaciones. Sin embargo, no debe contener los archivos compilados, es decir, excluir los archivos `.class`.

El código fuente debe incluir, en forma de comentarios, de dónde obtuvo la respuesta/implementación, ya sea con el vínculo (_Link_) de una página o el nombre del chatbot. Ejemplos:

```js
// https://en.wikipedia.org/wiki/Metallic_mean
...
// Gemini
...
```
