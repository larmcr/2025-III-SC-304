# Práctica Programada 2

| Curso                   | Estructuras de Datos                  |
| :---------------------- | :------------------------------------ |
| Código                  | SC-304                                |
| Profesor                | Luis Andrés Rojas Matey               |
| Valor                   | 5 %                                   |
| Fecha y hora de entrega | Lunes 13 de octubre antes de las 6 pm |

<br />

- [Introducción](#introducción)
- [Objetivo](#objetivo)
- [Especificaciones funcionales](#especificaciones-funcionales)
- [Especificaciones técnicas](#especificaciones-técnicas)
- [Entregables](#entregables)
- [Evaluación](#evaluación)

<br />

## Introducción

La pila (_Stack_) es una estructura de datos que se utiliza en muchas aplicaciones computacionales. Por ejemplo, en programas que utilizan excepciones (_Exceptions_), donde sus elementos se mantienen en una pila.

<br />

## Objetivo

Familiarizarse con la estructura de pila (_Stack_) en el lenguaje de programación **Java**, creando un programa capaz de invertir el contenido de un archivo de texto utilizando dicha estructura.

<br />

## Especificaciones funcionales

Se debe crear un programa llamado `Revert` que, al ejecutarse, lea un archivo de texto, invierta su contenido y escriba dicha versión invertida en otro archivo de texto.

Para lograr lo anterior, se debe ingresar el contenido del archivo en una pila, caracter por caracter. Luego, se debe vaciar la pila (en el orden inverso en que se agregaron los caracteres, tal como debería funcionar esta estructura de datos), con el objetivo de crear el contenido del archivo de salida.

Por ejemplo, suponga que el archivo de entrada a leer contiene lo siguiente:

```txt
.txet emos
si sihT
```

Al crearse la pila, esta contendrá cada uno de sus caracteres en el orden correspondiente:

```java
['.', 't', 'x', 'e', 't', ' ', 'e', 'm', 'o', 's', '\n', 's', 'i', ' ', 's', 'i', 'h', 'T']
```

Al vaciar dicha pila (en orden inverso a como se ingresaron los caracteres) y escrbir dicho texto generado a un archivo se salida, quedaría así su contenido:

```txt
This is
some text.
```

<br />

## Especificaciones técnicas

La versión para desarrollar la práctica debe ser [**_Java SE 21 & JDK 21_**](https://docs.oracle.com/en/java/javase/21/docs/api/index.html) (_Standard Edition & Java Development Kit version 21)_, la cual es [LTS](<https://en.wikipedia.org/wiki/Java_version_history#Java_SE_21_(LTS)>) (_Long-Term Support_). Se recomienda utilizar la implementación de [OpenJDK](https://jdk.java.net/java-se-ri/21) o de [Oracle](https://www.oracle.com/java/technologies/downloads/#java21).

La pila puede ser propia, o bien, utilizar la proveída por **Java** ([_Stack_](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Stack.html)). En cualquier caso, se debe hacer uso de los métodos `push` y `pop` para el llenado y vaciado de la pila, respectivamente. Así mismo, el elemento que permitirá dicha pila (es decir, el tipo de dato de cada ítem) será de tipo [_Character_](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Character.html), por lo que se debe tomar en cuenta que no se podrán usar elementos de otro tipo (como _String_) en dicha pila.

El archivo a leer se llamará `input.txt` y el archivo a escribir (el cual se debe crear en caso que no exista, o bien, sobreescribir en caso que sí exista) se llamará `output.txt`. Para poder leer y escribir archivos, se deben utilizar paquetes estándar de **Java**, tal como [`java.io`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/package-summary.html) o [`java.nio`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/package-summary.html).

Así mismo, no es necesario verificar si el archivo a leer (`input.txt`) exista o contenga datos; es decir, siempre será proveído dicho archivo de forma correcta (nombre correcto y con contenido). Se incluirá a modo de ejemplo y como parte de este enunciado, un archivo de entrada (`input.txt`) con su correspondiente archivo de salida (`output.txt`).

<br />

## Entregables

Esta es una práctica individual, por lo que en su respectivo repositorio de **Git**, específicamente en el _Branch_ principal (`main`), debe hallarse una carpeta llamada `PP2`, la cual contenga:

- Todo el código fuente. Sin embargo, no debe contener los archivos compilados, es decir, excluir cualquier archivo `.class`. Tampoco debe contener ninguno de los archivos de texto que se usarán para la lectura/escritura. Es decir, excluir los archivos `input.txt` y `output.txt`.

  - Puede copiar el archivo [`.gitignore`](https://github.com/larmcr/2025-III-SC-304/blob/main/.gitignore) del [repositorio del profesor](https://github.com/larmcr/2025-III-SC-304) en la raíz de su repositorio para excluir los archivos `.class`.

- Un archivo de documentación llamado `README.md`, hecho en [Markdown](https://www.markdownguide.org) con su respectiva sintaxis, donde se indique lo siguiente:

  - Su nombre y carné.

  - El IDE o editor utilizado.

  - Páginas web donde halló posibles soluciones a problemas encontrados o _Snippets_ de código.

  - _Prompts_ (consultas y respuestas) de los chatbots de IA (`Copilot`, `Gemini`, `ChatGPT`, etc.) que haya utilizado.

    - Este puede ser el vínculo compartido de dicho(s) chatbot(s).

  - La respuesta a las siguientes preguntas:

    - ¿Cree que exista otra forma de efectuar la inversión del contenido de un archivo sin necesitad de usar una pila? Si sí, indique cómo (sin necesidad de código).

    - ¿En qué ejemplo de la vida real (no informático) se puede ver reflejado el uso de una pila?

Ejemplo de estructura:

```
Repo. [directorio con su número de carné]
└── PP2 [directorio con nombre obligatorio]
    ├── ... [archivos/carpetas]
    ├── README.md [archivo con nombre obligatorio]
    └── ... [archivos/carpetas]
```

<br />

## Evaluación

La siguiente tabla muestra los rubros a evaluar, siempre y cuando el proyecto compile correctamente; así mismo, en caso de no compilar satisfactoriamente, se evaluará como que no fue entregado, es decir, con cero puntos.

|       | Rubros                          | Puntos |
| :---: | :------------------------------ | :----: |
| **A** | Estructura del proyecto         |   1    |
| **B** | Uso de la pila                  |   4    |
| **C** | Lectura y escritura de archivos |   2    |
| **D** | Documentación                   |   3    |
|       | **Total**                       | **10** |
