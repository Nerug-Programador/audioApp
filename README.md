# AudioApp
##   Descripción
        
udioApp es una aplicación innovadora desarrollada en Java que permite gestionar y reproducir canciones y podcasts. Los usuarios pueden realizar seguimientos de reproducciones y "me gusta", así como agregar contenido a una lista de favoritos. Esta herramienta es ideal para los amantes de la música y los podcasts, brindando una experiencia personalizada y organizada.

##   Características

*   Reproducción de Canciones y Podcasts: Los usuarios pueden reproducir sus canciones y podcasts favoritos, y llevar un registro de las reproducciones.

*   Sistema de "Me Gusta": Permite a los usuarios expresar su preferencia por canciones y podcasts, registrando el número de "me gusta".

*   Gestión de Favoritos: Añade canciones y podcasts a una lista de favoritos, destacando aquellos con una alta clasificación.

*   Clasificación: Las canciones y podcasts se clasifican en función de la cantidad de "me gusta" y reproducciones.

#   Instalación
1.  ### Clona el repositorio:

        git clone https://github.com/Nerug-Programador/audioapp.git
2.  ### Navega al directorio del proyecto:

        cd audioapp

3.  ### Compila y ejecuta el proyecto:

        javac -d bin src/com/nerugprogramador/audioapp/principal/Principal.java
        java -cp bin com.nerugprogramador.audioapp.principal.Principal

##  Uso

Al ejecutar la aplicación, el programa:

1.  Crea una instancia de una canción con el título "Forever" de la banda Kiss.

2.  Crea una instancia de un podcast titulado "Cafe.Tech" presentado por Gabriela Aguilar.

3.  Incrementa los "me gusta" y las reproducciones de ambas instancias en múltiples iteraciones.

4.  Muestra el total de reproducciones y "me gusta" de la canción.

5.  Agrega tanto la canción como el podcast a una lista de favoritos.

## Estructura del Proyecto

### Clase Principal

* *Principal.java:* Punto de entrada de la aplicación. Crea instancias de ```Cancion``` y ```Podcast```, incrementa sus contadores y muestra los resultados.

### Modelo de Datos

* *Audio.java:* Clase base que incluye los atributos comunes a Cancion y Podcast, como título, total de reproducciones y "me gusta".

* *Cancion.java:* Subclase de ```Audio``` que representa una canción. Añade atributos específicos como álbum, cantante y género.

* *Podcast.java:* Subclase de ```Audio``` que representa un podcast. Añade atributos específicos como presentador y descripción.

* *MisFavoritos.java:* Clase para gestionar una lista de favoritos, destacando aquellos con alta clasificación.

### Autor
William German Aranguren Buitrago - https://github.com/Nerug-Programador

### Licencia
Este proyecto no tiene una licencia específica.