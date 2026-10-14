# Kata 1 - Familiarización con IntelliJ IDEA y Flujo de Trabajo

## Objetivo de la Entrega
Automatizar el flujo de trabajo en el entorno de desarrollo IntelliJ IDEA, dominar el ciclo de ramas y control de versiones con Git/GitHub, afianzar el uso de atajos de teclado (*shortcuts*), utilizar el depurador (*debugger*) y aplicar la repetición deliberada en un microproyecto Java.

## Vídeo Explicativo
- **Enlace al vídeo (YouTube):** https://youtu.be/SgEw87TbnJw
- **Duración aproximada:** 4:40

## Entorno y Requisitos
- **JDK:** Oracle OpenJDK 27 | **Gestor:** Maven | **IDE:** IntelliJ IDEA
- **Dependencias:** Ninguna externa. Uso exclusivo de la librería estándar (`java.time.LocalDate`).

## Estructura del Proyecto
El código se organiza bajo el paquete `software.ulpgc.katas`, separando la entidad de dominio de la orquestación:

- **Entidad de Dominio (`Person` / `Task` / `Student`):** Clases inmutables modeladas como *records* con atributos privados y métodos de consulta implícitos. Incluyen un método de cálculo derivado (ej. `age()`, `weeksRemaining()`, `seniority()`) apoyado en constantes y métodos privados auxiliares para transformar días en años o semanas.
- **Clase Principal (`Main`):** Punto de entrada encargado exclusivamente de instanciar la entidad, invocar sus métodos y mostrar el resultado por consola.

## Práctica Deliberada (Iteraciones)
Para reducir la fricción técnica en el IDE y ganar soltura, el microproyecto se ha reconstruido tres veces desde cero manteniendo el mismo alcance pero introduciendo pequeñas variaciones de dominio en ramas independientes:
- **Rama `master`:** Iteración 1 - Entidad `Person` (Cálculo derivado de edad en años a partir de `birthday`).
- **Rama `iteration-2`:** Iteración 2 - Entidad `Task` (Cálculo derivado de semanas restantes hasta `deadline`).
- **Rama `iteration-3`:** Iteración 3 - Entidad `Student` (Cálculo derivado de antigüedad en años desde `enrollmentDate`).

## Shortcuts de IntelliJ IDEA Practicados
Durante el desarrollo y las repeticiones se automatizó el uso de los siguientes atajos:
- **`Alt + Insert`:** Generación rápida de código (constructores, métodos y creación de clases).
- **`Shift + F6`:** Refactorización segura para renombrar clases, métodos o variables (*Rename*) actualizando todas sus referencias.
- **`Ctrl + Alt + L`:** Formateo y tabulación automática del código fuente.
- **`Shift + F10`:** Compilación y ejecución rápida de la configuración activa (`Main`).
- **`Shift + F9`:** Ejecución en modo depuración (*Debug*).
- **`Alt + Enter`:** Acciones de contexto y correcciones rápidas (como convertir una clase estándar a `record`).

## Flujo Git y Proceso de Desarrollo
- **Ramas base:** Rama principal `master` y rama de desarrollo `develop` (además de las ramas de iteración).
- **Commits atómicos:** En cada iteración se versionó paso a paso la evolución del código (creación de la clase, adición de atributos, conversión a *record*, método derivado y orquestación en `Main`).
- **Integración:** El trabajo realizado en `develop` se integró hacia `master` mediante un *merge* limpio, sincronizando todas las ramas en GitHub mediante `push`.

## Evidencias de Verificación y Depuración
1. **Uso del Depurador (Breakpoints):** Se colocaron puntos de interrupción (*breakpoints*) tanto en la creación de la instancia como dentro del método de cálculo derivado, ejecutando el modo *Debug* para inspeccionar el estado de las variables y evaluar la transformación matemática en tiempo de ejecución.
2. **Refactorización:** Se verificó el renombrado seguro de elementos mediante las herramientas de *Refactor* del IDE en lugar de edición manual.
3. **Clonado Limpio y Ejecución:**
   - Copiar la URL HTTPS del repositorio público (`https://github.com/adrianrobaina102/kata1.git`).
   - En IntelliJ IDEA, ir a *File > New > Project from Version Control...* y clonar en un directorio limpio.
   - Esperar la indexación de Maven, abrir `src/main/java/software/ulpgc/katas/Main.java` y pulsar `Shift + F10` para comprobar que compila y muestra el resultado por consola sin errores.