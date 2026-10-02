## Sistema de Gestión para Salón de Belleza
## Descripción
## Este proyecto consiste en una aplicación de escritorio desarrollada en Java para la gestión de un pequeño salón de belleza.
## La aplicación permite administrar la información de clientes, profesionales, servicios y citas, utilizando una interfaz gráfica desarrollada con Java Swing y una base de datos local de Microsoft Access.
## El proyecto integra los contenidos desarrollados durante las semanas 5, 6 y 7, incorporando colecciones, interfaz gráfica, manejo de eventos, operaciones de gestión de información, una estructura de datos tipo cola y el patrón de diseño Repository.
## La aplicación utiliza el archivo DATA1.accdb como base de datos principal, donde se almacenan los registros necesarios para su funcionamiento.
## ________________________________________
## Objetivo del proyecto
## El objetivo principal es desarrollar un sistema que permita administrar de manera organizada la información de un salón de belleza y facilitar la gestión de las citas de los clientes.
## El sistema busca que el usuario pueda registrar y consultar la información necesaria para el funcionamiento del salón y, principalmente, organizar las citas según la fecha y hora programadas para mantener un orden de atención.
## ________________________________________
## Lenguaje utilizado
## Java
## Tecnologías utilizadas
## •	Java
## •	Java Swing
## •	NetBeans
## •	Maven
## •	Microsoft Access
## •	UCanAccess
## •	Git
## •	GitHub
## ________________________________________
## Funcionalidades principales
## La aplicación cuenta con diferentes módulos para administrar la información del salón.
## Clientes
## Permite registrar y administrar los datos de los clientes:
## •	Cédula
## •	Nombre
## •	Teléfono
## •	Correo
## Profesionales
## Permite registrar y administrar los profesionales que trabajan en el salón:
## •	Cédula
## •	Nombre
## •	Teléfono
## •	Correo
## •	Especialidad
## Entre las especialidades consideradas se encuentran:
## •	Peluquería
## •	Manicure
## •	Maquillaje
## •	Barbería
## Servicios
## Permite registrar y administrar los servicios ofrecidos por el salón.
## Citas
## Las citas relacionan:
## •	Cliente
## •	Profesional
## •	Fecha
## •	Hora
## •	Servicio
## •	Estado de la cita
## Los estados utilizados son:
## •	Pendiente
## •	Confirmada
## •	Atendida
## •	Cancelada
## La aplicación permite registrar y consultar las citas y trabajar con la información relacionada con el cliente, profesional y servicio.
## ________________________________________
## Funcionamiento de la aplicación
## La aplicación cuenta con una interfaz gráfica desarrollada mediante Java Swing.
## El menú principal está organizado en diferentes opciones, entre ellas Inicio, Registro y Revisión.
## En la sección Registro se encuentran las opciones para trabajar con:
## •	Clientes
## •	Profesionales
## •	Servicios
## •	Citas
## Los diferentes registros se presentan mediante tablas y formularios que permiten ingresar y administrar la información.
## La interfaz utiliza componentes como JFrame, JPanel, JTable, JTextField, JComboBox y JButton, además de los eventos necesarios para ejecutar las diferentes acciones del sistema.
## ________________________________________
## Colecciones y administración de datos
## Para administrar la información en memoria se utilizan colecciones genéricas de Java, principalmente ArrayList.
## Estas colecciones permiten almacenar objetos correspondientes a las diferentes clases del sistema, como clientes, profesionales y citas.
## Los genéricos permiten establecer el tipo de objetos que puede almacenar cada colección, facilitando el manejo de la información y reduciendo errores relacionados con tipos incompatibles.
## ________________________________________
## Gestión de citas mediante una cola
## Una de las principales funcionalidades incorporadas en la Semana 7 es la gestión de las citas mediante una estructura de datos tipo cola (Queue).
## La cola se utiliza para organizar las citas que deben ser atendidas en una determinada fecha.
## Cuando existen varias citas programadas para el mismo día, el sistema permite mantener un orden de atención tomando en cuenta la hora de cada cita.
## La estructura utiliza el principio:
## FIFO — First In, First Out
## Esto significa que la primera cita que ingresa a la cola es la primera que puede ser atendida.
## La cola fue implementada manualmente mediante una estructura enlazada, sin utilizar directamente la implementación Queue proporcionada por Java. Cada nodo almacena un objeto Citas y una referencia al siguiente elemento.
## Operaciones de la cola
## La estructura implementada permite:
## •	Agregar: incorpora una cita al final de la cola.
## •	Eliminar: retira la primera cita.
## •	Consultar siguiente: permite conocer cuál es la siguiente cita sin eliminarla.
## •	Verificar si está vacía: determina si existen citas en la cola.
## •	Contar elementos: permite conocer la cantidad de citas almacenadas.
## ________________________________________
## Organización de las citas por fecha y hora
## La cola se encuentra integrada directamente con la gestión de citas de la aplicación.
## El funcionamiento es el siguiente:
## 1.	El usuario selecciona una fecha mediante el componente de selección de fecha.
## 2.	El sistema obtiene las citas correspondientes a esa fecha.
## 3.	Las citas son ordenadas según la hora programada.
## 4.	Las citas se incorporan al Repository.
## 5.	El Repository utiliza la cola para mantener el orden de atención.
## 6.	Finalmente, las citas se muestran en una JTable.
## De esta manera, el sistema permite consultar las citas de una fecha específica y mantener un orden para determinar cuál debe ser atendida primero.
## ________________________________________
## Patrón Repository
## Para separar la administración de las citas de la lógica principal de la aplicación se implementó el patrón de diseño Repository.
## Se creó:
## •	CitaRepository.java
## •	CitaRepositoryImpl.java
## La interfaz CitaRepository define las operaciones necesarias para trabajar con las citas, mientras que CitaRepositoryImpl implementa dichas operaciones utilizando la estructura ColaCitas.
## Esto permite que el resto de la aplicación trabaje con las citas mediante el Repository sin acceder directamente a la estructura interna de la cola.
## ________________________________________
## Gestión de registros
## La aplicación también cuenta con operaciones para administrar los diferentes registros.
## Se pueden realizar acciones como:
## •	Crear registros.
## •	Consultar información.
## •	Actualizar registros.
## •	Eliminar registros.
## •	Buscar información.
## Los registros se muestran mediante tablas y la interfaz dispone de opciones como Nuevo, Editar, Guardar, Cancelar y Buscar.
## Estas funcionalidades permiten administrar la información necesaria para posteriormente utilizarla en el proceso de agendamiento de citas.
## ________________________________________
## Base de datos
## La aplicación utiliza una base de datos local de Microsoft Access:
## DATA1.accdb
## Esta base de datos contiene la información necesaria para el funcionamiento del sistema, incluyendo los registros de:
## •	Clientes
## •	Profesionales
## •	Servicios
## •	Citas
## La conexión se realiza desde el proyecto Java mediante la configuración correspondiente para acceder al archivo de Access.
## ________________________________________
## Requisitos para ejecutar el proyecto
## Para ejecutar el proyecto se necesita:
## •	Java JDK.
## •	NetBeans.
## •	Maven.
## •	El archivo DATA1.accdb.
## •	El código fuente del repositorio.
## ________________________________________
## Instrucciones para ejecutar el proyecto
## 1. Clonar el repositorio
## Clonar el repositorio desde GitHub:
## git clone https://github.com/josemegafull/Salon-de-Belleza-Tarea.git
## 2. Abrir el proyecto
## Abrir el proyecto en NetBeans.
## 3. Configurar la base de datos
## El proyecto utiliza el archivo:
## DATA1.accdb
## Es importante mantener este archivo dentro del proyecto.
## Además, se debe revisar el archivo:
## src/CN.txt
## y actualizar la ruta de DATA1.accdb de acuerdo con la ubicación donde se haya descargado el proyecto.
## Por ejemplo:
## C:\repositorio-remoto\Salon-de-Belleza-Tarea\Salon\DATA1.accdb
## La ruta debe corresponder a la ubicación real del archivo en el computador donde se ejecute la aplicación.
## 4. Ejecutar la aplicación
## Una vez configurada correctamente la ruta de la base de datos:
## 1.	Abrir el proyecto en NetBeans.
## 2.	Esperar a que Maven cargue las dependencias.
## 3.	Verificar que no existan errores de compilación.
## 4.	Ejecutar el proyecto.
## 5.	Utilizar el menú principal para acceder a las diferentes funcionalidades.
## Importante: La base de datos DATA1.accdb es necesaria para el funcionamiento de la aplicación. Si la ruta configurada en CN.txt no coincide con la ubicación real del archivo, pueden producirse errores de conexión.
## ________________________________________
## Estructura de la Semana 7
## La Semana 7 incorpora principalmente la estructura de datos Cola de Citas y el patrón Repository.
## La estructura permite administrar las citas respetando el orden de atención establecido por la fecha y hora.
## La integración realizada permite mantener separadas las responsabilidades:
## Interfaz gráfica
##        ↓
## Gestión de citas
##        ↓
## CitaRepository
##        ↓
## CitaRepositoryImpl
##        ↓
## ColaCitas
##        ↓
## Citas
## De esta manera, la aplicación puede utilizar la cola sin que la interfaz tenga que manejar directamente los nodos y la estructura interna de la misma.
## ________________________________________
## Pruebas unitarias
## Como parte de la Semana 7 también se implementaron pruebas unitarias utilizando JUnit 4 para comprobar las principales operaciones de la cola.
## Se realizaron pruebas relacionadas con:
## •	Agregar una cita.
## •	Consultar la siguiente cita.
## •	Eliminar una cita respetando FIFO.
## •	Comportamiento de una cola vacía.
## Las pruebas fueron ejecutadas mediante Maven y finalizaron correctamente.
## ________________________________________
## Repositorio
## El código fuente del proyecto se encuentra disponible en GitHub:
## https://github.com/josemegafull/Salon-de-Belleza-Tarea
## Rama principal: main
## 