# Kata 1 - Familiarización con IntelliJ IDEA y Flujo de Trabajo

## Objetivo de la Entrega
El objetivo de esta entrega es automatizar el flujo de trabajo en el entorno de desarrollo IntelliJ IDEA, dominar el ciclo de ramas y control de versiones con Git/GitHub, afianzar el uso de atajos de teclado y aplicar la repetición deliberada en un microproyecto Java.

## Vídeo Explicativo
- **Enlace al vídeo (YouTube):** https://youtu.be/SgEw87TbnJw
- **Duración aproximada:** 4:40

## Requisitos y Entorno
- **JDK:** Java 17
- **Gestor de dependencias:** Maven
- **IDE:** IntelliJ IDEA

## Estructura del Proyecto
El código se organiza bajo el paquete `software.ulpgc.katas`:
- `Person`: Clase de dominio inmutable modelada como `record` con los campos `name` y `birthday`, y un método derivado `age()` que calcula la edad a partir de los días transcurridos.
- `Main`: Clase principal de ejecución encargada de instanciar la entidad e imprimir el resultado en consola.

## Flujo Git
- **Ramas:** Rama de producción `master` y rama de evolución funcional `develop`.
- **Commits atómicos:** En la rama `develop` se versionó la evolución de la entidad (`Person class created`, atributos, refactorización a `record` y creación de `Main`).
- **Integración:** Tras actualizar la configuración base en `master` (`POM updated`), se realizó la integración de `develop` hacia `master` mediante un `merge` limpio.

## Compilación y Ejecución
1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar a que el IDE indexe y descargue las dependencias de Maven del `pom.xml`.
3. Navegar a `src/main/java/software/ulpgc/katas/Main.java`.
4. Ejecutar la clase pulsando el atajo `Shift + F10` (o clic derecho > *Run 'Main.main()'*).

## Verificación y Clonado Limpio
Para verificar la reproducibilidad e independencia del proyecto fuera del entorno original:
1. Copiar la URL HTTPS del repositorio público en GitHub.
2. En IntelliJ IDEA, seleccionar **File > New > Project from Version Control...**
3. Pegar la URL, elegir un directorio destino limpio y hacer clic en **Clone**.
4. Abrir la clase `Main` y ejecutarla para validar que compila e imprime la salida correctamente desde cero.
