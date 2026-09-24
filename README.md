# Salon-de-Belleza-Tarea
# programa para administrar la información básica de clientes y de los profesionales que trabajan en el salón.

# IMPORTANTE!!!!!: C:\repositorio-remoto\Salon-de-Belleza-Tarea\Salon\src en esta ruta hay un archivo que se encarga de la conexión de la base de datos, la aplicación va a requerir que se modifique este archivo, CN.txt, debe abrir el archivo y actualizar la ruta de la base de datos en donde se encuentre descargado la aplicación “ACTUALIZA!!!! vacio vacio vacio “. La base de datos contiene los registros y es muy importante.
# Sistema de Gestión de Salón de Belleza

## Descripción
## 
## Este repositorio contiene el proyecto desarrollado durante las **semanas 5 y 6**, correspondiente a la implementación de colecciones, operaciones CRUD, interfaz gráfica y manejo de eventos.
## 
## La aplicación fue desarrollada en **Java utilizando NetBeans y Java Swing**, y utiliza una base de datos local desarrollada en **Microsoft Access**.
## 
## ## Requisitos
## 
## Para ejecutar correctamente la aplicación se requiere:
## 
## * Java JDK instalado.
## * Apache NetBeans.
## * Microsoft Access o los controladores necesarios para trabajar con archivos `.accdb`.
## * Archivo de base de datos `DATA1.accdb`.
## 
## ## Instalación y configuración
## 
## ### 1. Descargar el repositorio
## 
## Descargar o clonar este repositorio en el equipo donde se ejecutará la aplicación.
## 
## ```bash
## git clone https://github.com/josemegafull/Salon-de-Belleza-Tarea.git
## ```
## 
## También se puede descargar el repositorio directamente desde GitHub utilizando la opción **Code → Download ZIP**.
## 
## ### 2. Ubicar la base de datos
## 
## Dentro del proyecto se encuentra el archivo:
## 
## ```text
## DATA1.accdb
## ```
## 
## Este archivo corresponde a la base de datos utilizada por la aplicación.
## 
## ### 3. Actualizar la ruta de la base de datos
## 
## Es necesario verificar y actualizar la **ruta del archivo `DATA1.accdb`** de acuerdo con la ubicación en la que se haya descargado el proyecto en el nuevo equipo.
## 
## > **Importante:** Si la ruta de la base de datos no coincide con la ubicación real del archivo `DATA1.accdb`, la aplicación no podrá establecer la conexión y se producirá un error al intentar acceder a los registros.
## 
## Para realizar esta configuración se debe seguir la indicación correspondiente a la ruta de conexión implementada en el proyecto.
## 
## La ruta debe apuntar directamente al archivo:
## 
## ```text
## DATA1.accdb
## ```
## 
## Por ejemplo:
## 
## ```text
## C:\ruta\del\proyecto\Salon\DATA1.accdb
## ```
## 
## La ruta mostrada anteriormente es solamente un ejemplo. **Debe reemplazarse por la ruta real donde se encuentre el archivo en el equipo.**
## 
## ### 4. Abrir el proyecto en NetBeans
## 
## Una vez configurada la ruta de la base de datos:
## 
## 1. Abrir **Apache NetBeans**.
## 2. Seleccionar **File → Open Project**.
## 3. Ubicar la carpeta descargada del repositorio.
## 4. Seleccionar el proyecto **Salon**.
## 5. Esperar a que NetBeans cargue las dependencias y la configuración del proyecto.
## 
## ### 5. Ejecutar la aplicación
## 
## Después de cargar correctamente el proyecto:
## 
## 1. Localizar el proyecto **Salon** en NetBeans.
## 2. Ejecutar el proyecto utilizando **Run Project**.
## 3. La aplicación iniciará mostrando la ventana principal del sistema.
## 4. Desde el menú principal se podrá acceder a las diferentes opciones implementadas, como **Registro**, **Clientes, Profesionales, Servicios y Citas**.
## 
## ## Consideración importante sobre la base de datos
## 
## La aplicación depende directamente del archivo `DATA1.accdb`. Por esta razón, **no se debe eliminar, cambiar de ubicación ni modificar el nombre del archivo después de configurar la ruta**, a menos que posteriormente se actualice nuevamente la configuración de conexión.
## 
## Si el proyecto se ejecuta en otro equipo, se debe revisar la ruta de la base de datos antes de iniciar la aplicación.
## 
## ## Estructura general
## 
## El proyecto contiene, entre otros, los siguientes elementos:
## 
## ```text
## Salon/
## ├── src/
## ├── DATA1.accdb
## ├── pom.xml
## └── README.md
## ```
## 
## La aplicación utiliza la base de datos `DATA1.accdb` para almacenar y consultar la información utilizada por el sistema.
## 
## ## Ejecución
## 
## Una vez completados los pasos anteriores, el proyecto estará listo para ejecutarse desde **NetBeans** y utilizar las funcionalidades implementadas durante las semanas 5 y 6.
## 