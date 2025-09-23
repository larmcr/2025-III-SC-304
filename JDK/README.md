# JDK

La versión para desarrollar durante el curso es [**_Java SE 21 & JDK 21_**](https://docs.oracle.com/en/java/javase/21/docs/api/index.html) (_Standard Edition & Java Development Kit version 21)_, la cual es [LTS](<https://en.wikipedia.org/wiki/Java_version_history#Java_SE_21_(LTS)>) (_Long-Term Support_).

Se recomienda utilizar la implementación de [OpenJDK](https://jdk.java.net/java-se-ri/21) o de [Oracle](https://www.oracle.com/java/technologies/downloads/#java21), aunque cualquier otra debería funcionar de manera similar.

Ahora bien, en caso que se tenga más de un **JDK** instalado, es necesario configurar el proyecto para que utilice la versión correspondiente (**21**).

En esta guía se muestran los pasos para hacerlo con tres IDEs:

- [Eclipse](#eclipse)
- [IntelliJ IDEA](#intellij-idea)
- [Netbeans](#netbeans)

<br />

## Eclipse

Este IDE se puede descargar desde la [página oficial](https://eclipseide.org).

Cuando se va a crear un proyecto nuevo, se debe escoger la versión correspondiente (**21**):

![Eclipse-1](img/ec-1.png)

<br />

## IntelliJ IDEA

La versión **Community Edition**, la cual es _Open Source_, se puede descargar desde su [página oficial](https://www.jetbrains.com/idea/download/).

Cuando se va a crear un proyecto nuevo, se debe escoger la versión correspondiente:

![Idea-1](img/idea-1.png)

Ahora bien, si el proyecto ya fue creado, se puede configurar accediendo a su estructura (_Project Structure_) desde el menú (_File_):

![Idea-2](img/idea-2.png)

Una vez ahí, se debe seleccionar las configuraciones del proyecto (_Project_):

![Idea-3](img/idea-3.png)

Y escoger la versión correspondiente del **JDK**/**SDK** (**21**):

![Idea-4](img/idea-4.png)

Para finalmente, aceptar los cambios (_OK_):

![Idea-5](img/idea-5.png)

<br />

## Netbeans

Este IDE se puede descargar desde su [página oficial](https://netbeans.apache.org/front/main/index.html).

Primero, luego de crear un proyecto, se debe ir a sus propiedades (_Properties_). Esto se logra haciendo clic derecho sobre el nombre del proyecto (en el ejemplo se llama `Prueba`), o bien, desde la opción del menú:

![Netbeans-1](img/nb-1.png)

![Netbeans-1-2](img/nb-1-2.png)

Segundo, se debe acceder a las opciones de compilación (_Compile_) en la parte de construcción (_Build_):

![Netbeans-2](img/nb-2.png)

Tercero, se debe escoger la versión correspondiente (**21**) tanto para la plataforma (_Java Platform_) como su objetivo (_Target Release_):

![Netbeans-3](img/nb-3.png)

Cuarto, aceptar los cambios (_OK_):

![Netbeans-4](img/nb-4.png)
