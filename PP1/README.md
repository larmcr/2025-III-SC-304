# Práctica Programada 1

| Curso                   | Estructuras de Datos                    |
| :---------------------- | :-------------------------------------- |
| Código                  | SC-304                                  |
| Profesor                | Luis Andrés Rojas Matey                 |
| Valor                   | 5 %                                     |
| Fecha y hora de entrega | Lunes 29 de setiembre antes de las 6 pm |

<br />

- [Introducción](#introducción)
- [Objetivo](#objetivo)
- [Especificaciones funcionales](#especificaciones-funcionales)
- [Especificaciones técnicas](#especificaciones-técnicas)
- [Entregables](#entregables)
- [Evaluación](#evaluación)

<br />

## Introducción

Con la operación aritmética de la división se pueden crear y ejecutar algoritmos que permiten múltiples transformaciones y cálculos de números naturales.

<br />

## Objetivo

Familiarizarse con el lenguaje de programación `Java`, creando un programa capaz de obtener el inverso de un número natural, utilizando los elementos **cociente** y **residuo** de la división, con un algoritmo recursivo.

<br />

## Especificaciones funcionales

Se debe crear un programa llamado `Inverso` para **Consola** que, al ejecutarse con un número natural como argumento, despliegue tanto el número original como su inverso. Por ejemplo:

```java
$ java Inverso 123
123 → 321
```

Una vez el programa imprime ambos resultados (el número original y su inverso), este debe terminar.

Se puede asumir que siempre se va a proveer un número natural mayor o igual que cero como argumento del programa.

<br />

## Especificaciones técnicas

La versión para desarrollar la práctica debe ser [**_Java SE 21 & JDK 21_**](https://docs.oracle.com/en/java/javase/21/docs/api/index.html) (_Standard Edition & Java Development Kit version 21)_, la cual es [LTS](https://en.wikipedia.org/wiki/Java_version_history#Java_SE_21_(LTS)) (_Long-Term Support_). Se recomienda utilizar la implementación de [OpenJDK](https://jdk.java.net/java-se-ri/21) o de [Oracle](https://www.oracle.com/java/technologies/downloads/#java21).

Todo el código fuente (incluyendo el método inicial `main`) debe estar contenido en un solo archivo llamado `Inverso.java`.

Para crear el algoritmo que invierte un número, se debe utilizar un método recursivo que reciba el número natural de tipo [`int`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html) y retorne su inverso también natural de tipo `int`. Además, el **cociente** y el **residuo** de la división deben calcularse y utilizarse como parte de dicho algoritmo.

<br />

## Entregables

Esta es una práctica individual, por lo que en su respectivo repositorio de **Git**, específicamente en el _Branch_ principal (`main`), debe hallarse una carpeta llamada `PP1`, la cual contenga:

- El archivo `Inverso.java` con el código fuente. Sin embargo, no debe contener los archivos compilados, es decir, excluir el archivo `.class`.

  - Puede copiar el archivo [`.gitignore`](https://github.com/larmcr/2025-III-SC-304/blob/main/.gitignore) del [repositorio del profesor](https://github.com/larmcr/2025-III-SC-304) en la raíz de su repositorio para excluir los archivos indicados.

- Un archivo de documentación llamado `README.md`, hecho en [Markdown](https://www.markdownguide.org), donde se indique lo siguiente:

  - Su nombre y carné.

  - Páginas web donde halló posibles soluciones a problemas encontrados o _Snippets_ de código.

  - _Prompts_ (consultas y respuestas) de los chatbots de IA (`Copilot`, `Gemini`, `ChatGPT`, etc.) que haya utilizado.

    - Este puede ser el vínculo compartido de dicho(s) chatbot(s).

  - La respuesta a las siguientes preguntas:

    - ¿Es posible implementar una solución equivalente pero de comportamiento iterativo?

    - ¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?

    - ¿Qué relación observa entre el algoritmo para invertir un número natural (calculando y utilizando los cocientes y residuos de las divisiones) con las estrategias para pasar de una base numérica a otra?

<br />

## Evaluación

La siguiente tabla muestra los ítemes a evaluar, siempre y cuando el proyecto compile correctamente; así mismo, en caso de no compilar satisfactoriamente, se evaluará como que no fue entregado, es decir, con cero puntos.

|       | Ítemes                                 | Puntos |
| :---: | :------------------------------------- | :----: |
| **A** | Estructura del proyecto                |   1    |
| **B** | Implementación del método recursivo    |   5    |
| **C** | Presentación de valores en **Consola** |   1    |
| **D** | Documentación                          |   3    |
|       | **Total**                              | **10** |
