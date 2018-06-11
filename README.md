# Spring-Boot-MVC-JPA
Proyecto sencillo Spring 
Este proyecto realiza operaciones CRUD en una entidad usuario utilizando Spring Boot, Spring MVC, Spring JPA 

Para obtener todos los usuarios disponibles en el sistema:
GET a http://localhost:8080/usuarios

Para obtener un usuario del sistema 
GET a http://localhost:8080/usuarios/{id}

Para agregar un usuario al sistema
POST a http://localhost:8080/usuario

Para eliminar un usuario del sistema
DELETE a http://localhost:8080/usuario/{id}

Para actualizar un usuario del sistema
PUT a http://localhost:8080/usuario/{id}


Ejemplo JSON:

{
    "nombre": "Jon",
    "apellidos": "Snow",
    "email": "Bastard.Jon.Snow@Targarians.Stark",
    "password": "Misandei"
  }
