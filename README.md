# Salon-de-Belleza-Tarea

## Sistema de Gestión de Salón de Belleza
## 
## Aplicación desarrollada en **Java con NetBeans y Java Swing** para administrar clientes, profesionales, servicios y citas de un salón de belleza.
## 
## El proyecto integra los contenidos desarrollados durante las **semanas 5, 6 y 7**, incluyendo colecciones, operaciones CRUD, interfaz gráfica, manejo de eventos, estructura de datos tipo cola, patrón Repository y pruebas unitarias.
## 
## ## Descripción
## 
## La aplicación permite:
## 
## * Registrar y consultar clientes.
## * Registrar y consultar profesionales.
## * Registrar y administrar servicios.
## * Registrar y consultar citas.
## * Cambiar el estado de las citas.
## * Consultar las citas según una fecha.
## * Organizar las citas por hora para establecer el orden de atención.
## 
## ### Semana 7
## 
## Para organizar la atención de las citas se implementó una **cola FIFO (First In, First Out)** de forma manual, utilizando nodos enlazados.
## 
## La cola permite:
## 
## * Agregar citas.
## * Eliminar la siguiente cita.
## * Consultar la siguiente cita.
## * Verificar si está vacía.
## * Contar los elementos.
## 
## También se implementó el **patrón Repository** mediante `CitaRepository` y `CitaRepositoryImpl`, separando la administración de las citas de la lógica principal de la aplicación.
## 
## Se realizaron pruebas unitarias con **JUnit 4** para comprobar el funcionamiento de la cola.
## 
## Resultado de las pruebas:
## 
## ```text
## Tests run: 4
## Failures: 0
## Errors: 0
## Skipped: 0
## BUILD SUCCESS
## ```
## 
## ## Requisitos
## 
## Para ejecutar el proyecto se requiere:
## 
## * Java JDK.
## * Apache NetBeans.
## * Microsoft Access o los controladores necesarios para archivos `.accdb`.
## * Archivo `DATA1.accdb`.
## 
## ## Instalación y configuración
## 
## ### 1. Descargar el repositorio
## 
## ```bash
## git clone https://github.com/josemegafull/Salon-de-Belleza-Tarea.git
## ```
## 
## También se puede descargar mediante **Code → Download ZIP** desde GitHub.
## 
## ### 2. Configurar la base de datos
## 
## Dentro del proyecto se encuentra:
## 
## ```text
## DATA1.accdb
## ```
## 
## La aplicación necesita este archivo para acceder a los registros.
## 
## **IMPORTANTE:** dentro de:
## 
## ```text
## src
## ```
## 
## se encuentra el archivo:
## 
## ```text
## CN.txt
## ```
## 
## Este archivo contiene la ruta utilizada para la conexión con la base de datos.
## 
## Al descargar el proyecto en otro equipo, se debe abrir `CN.txt` y actualizar la ruta para que apunte a la ubicación real de:
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
## La ruta anterior es solamente un ejemplo. Debe utilizarse la ruta correspondiente al equipo donde se ejecutará el proyecto.
## 
## ### 3. Abrir y ejecutar
## 
## 1. Abrir **Apache NetBeans**.
## 2. Seleccionar **File → Open Project**.
## 3. Abrir el proyecto **Salon**.
## 4. Esperar a que Maven cargue las dependencias.
## 5. Ejecutar mediante **Run Project**.
## 
## ## Pruebas unitarias
## 
## Las pruebas se encuentran en:
## 
## ```text
## Test Packages
## └── com.tarea2026.repository
##     └── ColaCitasTest.java
## ```
## 
## Para ejecutarlas desde NetBeans:
## 
## **Clic derecho en `ColaCitasTest.java` → Test File**
## 
## Las pruebas verifican las operaciones principales de la cola y deben mostrar `BUILD SUCCESS` cuando se ejecutan correctamente.
## 
## ## Estructura general
## 
## ```text
## Salon/
## ├── src/
## ├── DATA1.accdb
## ├── pom.xml
## └── README.md
## ```
## 
## El proyecto contiene el código fuente de la aplicación, la configuración Maven, la base de datos y las pruebas unitarias.
## 