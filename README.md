# Skylight Generadores API

Aplicación REST desarrollada con Spring Boot para
gestionar información de equipos generadores eléctricos
de la empresa Skylight Generadores.

## Tecnologías

- Java 21
- Spring Boot 3.5.6
- Maven
- Spring Web
- GitHub Codespaces

## Funcionalidades

### 1. Consultar equipos

Método: GET

Endpoint: /api/equipos

Permite obtener la lista de equipos registrados.

### 2. Registrar equipos

Método: POST

Endpoint: /api/equipos

Permite registrar equipos mediante objetos JSON.

## Estructura del equipo

- codigo
- nombre
- marca
- potencia
- estado

## Ejecución

Ejecutar el siguiente comando:

./mvnw spring-boot:run

La aplicación se ejecuta en:

http://localhost:8080

## Autor

Paul Mauricio Mendoza Del Carpio