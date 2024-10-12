# Proyecto Floristería MVC

## Descripción
Este proyecto tiene como objetivo crear una aplicación web para la gestión de una floristería. La plataforma permite gestionar flores y pedidos.

## Producto Mínimo Viable (PMV)

### Funcionalidades Implementadas
1. **Gestión de Flores**: 
   - Listado de flores.
   - Crear, editar y eliminar flores.
   
2. **Gestión de Pedidos**:
   - Listado de pedidos.
   - Crear, editar y eliminar pedidos.

3. **Relación entre Flores y Pedidos**:
   - Los pedidos pueden contener una o más flores.

### Requerimientos del Cliente:
El cliente solicitó las siguientes funcionalidades mínimas:
1. Gestionar el inventario de flores.
2. Administrar pedidos realizados por los clientes.
3. Una interfaz sencilla que permita realizar estas acciones.

### Configurar la Seguridad con Spring Security
 -Configura la seguridad básica con Spring Security para proteger las rutas. En este caso, solo los usuarios autenticados podrán acceder a las rutas que gestionan flores y pedidos.
 
 -Clase de Configuración de Seguridad: Ya tienes la clase SecurityConfig creada en el paquete configuracion. Esta clase protege las rutas /flores y /pedidos para que solo los         usuarios autenticados puedan acceder a ellas.

-Página de Inicio de Sesión: Has creado una página personalizada de inicio de sesión (login.html), que se muestra cuando un usuario no autenticado intenta acceder a rutas    protegidas.
