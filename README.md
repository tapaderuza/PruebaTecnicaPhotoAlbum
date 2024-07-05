# Photo Albums API

Esta es una API desarrollada en Kotlin con Spring Boot para mostrar todos los álbumes de fotos alojados en JSON Placeholder, así como los detalles de las fotos de cada uno de los álbumes.

## Tabla de Contenidos
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Ejecución de la Aplicación](#ejecución-de-la-aplicación)
- [Ejecución de Tests](#ejecución-de-tests)
- [Endpoints de la API](#endpoints-de-la-api)
- [Documentación de la API](#documentación-de-la-api)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Licencia](#licencia)

## Requisitos
- Java 11
- Gradle

## Instalación
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tapaderuza/PruebaTecnicaPhotoAlbum.git
2. Navegar al directorio del proyecto:
   ```bash 
   cd PruebaTecnicaPhotoAlbum

## Ejecución de la Aplicación
1. Construir el proyecto y ejecutar la aplicación:
   ```bash
   ./gradlew bootRun
2. La API estará disponible en http://localhost:8080.

## Ejecución de Tests
1. Para ejecutar los tests unitarios, utiliza el siguiente comando:
   ```bash 
   ./gradlew test

## Endpoints de la API
1. **GET /albums:** Obtiene todos los álbumes.
3. **GET /albums/{albumId}/photos:** Obtiene las fotos de un álbum específico.

## Documentación de la API

La documentación de la API generada con Swagger OpenAPI estará disponible en http://localhost:8080/swagger-ui.html.

## Estructura del Proyecto

photo-albums
├── .gitignore
├── README.md
├── build.gradle.kts
├── settings.gradle.kts
├── src
│   ├── main
│   │   ├── kotlin
│   │   │   └── com
│   │   │       └── example
│   │   │           └── photo_albums
│   │   │               ├── AlbumController.kt
│   │   │               ├── AlbumService.kt
│   │   │               ├── JsonPlaceholderClient.kt
│   │   │               ├── model
│   │   │               │   ├── Album.kt
│   │   │               │   └── Photo.kt
│   │   │               └── PhotoAlbumsApplication.kt
│   │   └── resources
│   │       ├── application.properties
│   └── test
│       ├── kotlin
│       │   └── com
│       │       └── example
│       │           └── photo_albums
│       │               ├── AlbumServiceTest.kt
│       │               ├── PhotoAlbumsApplicationTests.kt
│       └── resources
└── gradlew
└── gradlew.bat
└── gradle
└── wrapper
├── gradle-wrapper.jar
└── gradle-wrapper.properties

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
