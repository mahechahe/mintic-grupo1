# TucitaApp Rest API
Repositorio para el desarrollo del proyecto Mintic del grupo 1

author: Yeffran Gonzalez (Grupo 52 Utp)

ENDPOINTS:

        Users:
                GET /users
                GET /users/{id]
                POST /users
                GET /users/recibidos/{id} (Retorna envios segun id de un usuario)
                PUT /users
                DELETE /users/{id}
        
        Envios:
                GET /envios
                GET /envios/{id}
                POST /envios
                PUT /envios
                DELETE /envios/{id]
                
        Tramites:
                GET /tramites
                GET /tramites/{id}
                POST /tramites
                PUT /tramites
                DELETE /tramites/{id}
                
         Login:
                POST /login
                POST /register

JSON POST:

        ENVIOS:
                nombre
                apellidos
                email
                telefono
                nombreEnvio
                direccionEnvio
                largo
                ancho
                altura
                peso
                nombreDestinatario
                apellidoDestinatario
                emailDestinatario
                telefonoDestinatario
        TRAMITES:
                name
                description
        USERS:
                nombreUsuario
                apellidoUsuario
                email
                contraseña
        LOGIN:
                REGISTRO:
                        nombreUsuario
                        apellidoUsuario
                        email
                        contraseña
               
                LOGIN:
                        email
                        contraseña
