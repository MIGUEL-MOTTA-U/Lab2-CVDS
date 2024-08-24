# Lab 2 - Maven
# Integrantes
## Diego Macía
## Miguel Motta

# Introducción
### ¿Cuál es su mayor utilidad?
Maven te permite usar bibliotecas externas en tu proyecto Java. Estas bibliotecas manejan funcionalidades complejas y comunes. Por ejemplo, si quieres usar la fecha y hora actuales en un proyecto Java, puedes usar las bibliotecas Joda Time. Maven también admite marcos externos para crear los proyectos.

### Fases de maven
* Validate
* Compile
* Test
* Package
* Integration Test
* Verify
* Install
* Deploy

### Ciclo de vida de la construcción

#### Validate
Esta fase se encarga de hacer la verificación de dependencias, para comprobar que el proyecto cuenta con la información necesaria para ser procesada.

#### Compile
En esta fase se compilan todos los ficheros .java y genera los archivos .class del proyecto.

#### Test
En esta fase se compilan todos los ficheros .java de las pruebas unitarias del proyecto, esto se hace con el fin de garantizar que el código es correcto, el grado de certeza depende de las pruebas unitarias.

#### Package
En esta fase se generan todos los archivos empaquetados de nuestro código, son necesarios para poder compilar y desplegar el proyecto desde un servidor.

#### Integration Test
Esta fase comprueba que los diferentes componentes de la aplicación funcionen correctamente, además, de garantizar que se integre correctamente con sistemas externos, bases de datos, servicios web, etc.

#### Verify
En esta fase de despliega el artefacto en el repositorio LOCAL.

#### Install
En esta fase se hace la implementación de las dependencias que pueda tener el proyecto, para garantizar que sea independiente y sea procesado completamente.

#### Deploy
Finalmente, cuando el arquetipo está en su estado final listo para ser implementado, se despliega en un entorno específico. Generalmente se despliega en un servidor remoto o un entorno no local.




## Para qué sirven los plugins
Los plugins en Maven son componentes fundamentales que extienden y personalizan el proceso de construcción. Sirven para varios propósitos importantes:

Automatización de tareas:

Permiten automatizar tareas comunes de desarrollo como compilación, pruebas, empaquetado, despliegue, etc.


Extensibilidad:

Extienden las capacidades básicas de Maven, permitiendo adaptar el proceso de construcción a necesidades específicas del proyecto.


Ejecución de metas (goals):

Cada plugin define una o más "metas" que pueden ser ejecutadas en diferentes fases del ciclo de vida de Maven.


Configuración del proyecto:

Ayudan a configurar aspectos específicos del proyecto, como la versión de Java a usar, la estructura de directorios, etc.


Generación de informes:

Algunos plugins generan informes útiles sobre el proyecto, como cobertura de código, análisis de dependencias, etc.


Integración con herramientas externas:
Facilitan la integración con otras herramientas y frameworks, como servidores de aplicaciones, herramientas de calidad de código, etc.
Manejo de dependencias:
Ayudan a gestionar y resolver las dependencias del proyecto.
Personalización del ciclo de vida:
Permiten modificar o extender el ciclo de vida estándar de Maven para adaptarlo a flujos de trabajo específicos.
Portabilidad:
Aseguran que las tareas de construcción se puedan ejecutar de manera consistente en diferentes entornos.
Estandarización:
Promueven buenas prácticas y estándares en el proceso de desarrollo al proporcionar implementaciones comunes para tareas frecuentes.


## Qué es y para qué sirve el repositorio central de maven



## Creación del proyecto

![image](./assets/Foto%201.png)


# Compilar y ejecutar

Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn. Compila el código,
ejecuta las pruebas y empaqueta el código.

El parametro package tiene como objetivo ejecutar el ciclo de vida de maven hasta la fase de empaquetado.
Parametros que se podrian usar con mvn package:
-DskipTests : omite la ejecución de las pruebas.
-Dmaven.test.skip=true : omite la compilación y ejecución de las pruebas.
-Darguments : permite pasar argumentos adicionales a los plugins que se ejecutan durante el empaquetado.
-p : activa un perfil específico del proyecto.



Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass".
Para ejecutar un proyecto de maven desde la linea de comandos se necesita:
-Configurar el exec-maven-plugin en el pom.xml

![image](./assets/execmavenplugin.png)

-Compilar el proyecto y usar el comando mvn exec:java para ejecutarlo
![image](./assets/ejecucionArgumentos.png)

-Buscar cómo enviar parámetros al plugin "exec".
Para enviar parametros a exec se usa el comando -Dexec.args="param1 param2 param3"
![image](./assets/exec-parametros.png)
![image](./assets/codigo-params.png)

-Con nombre y apellido
![image](./assets/exec-parametros2.png)

-Arreglandolo para que aparezca nombre y apellido
![image](./assets/exec-parametros3.png)
![image](./assets/codigo-params2.png)

