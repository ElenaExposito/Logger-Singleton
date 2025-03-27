<div align="center">

# **Patrón de Diseño Singleton en Java**

<img src="https://refactoring.guru/images/patterns/content/singleton/singleton-2x.png" alt="Singleton Pattern" width="300" />

</div>

_Implementación del patrón Singleton en Java para gestionar un registro de actividades._

<details>
<summary style="color: rgb(255, 177, 0);">📜 Índice</summary>

---

- [**Patrón de Diseño Singleton en Java**](#patrón-de-diseño-singleton-en-java)
  - [📖 Introducción](#📖-introducción)
  - [🎯 Beneficios del Patrón Singleton](#🎯-beneficios-del-patrón-singleton)
  - [💻 Implementación en Java](#💻-implementación-en-java)
    - [📄 Main.java](#📄-mainjava)
    - [🛠️ Utils.java](#🛠️-utilsjava)
    - [🗃️ Logger.java](#🗃️-loggerjava)
  - [🔚 Conclusión](#🔚-conclusión)

</details>

---

## 📖 Introducción

El patrón de diseño Singleton es un patrón creacional que garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a dicha instancia. Este patrón es útil cuando se necesita controlar el acceso a un recurso compartido, como una base de datos o un archivo de registro.

## 🎯 Beneficios del Patrón Singleton

- **🛡️ Instancia Única**: Garantiza que solo haya una instancia de una clase en todo el sistema.
- **🌍 Acceso Global**: Proporciona un punto de acceso global a la instancia única.
- **🔒 Control del Acceso**: Permite controlar el acceso a recursos compartidos, evitando problemas de concurrencia y asegurando la consistencia de los datos.

## 💻 Implementación en Java

### 📄 Main.java

Esta clase contiene el método principal que permite al usuario interactuar con el sistema a través de un menú. Dependiendo de la opción seleccionada, se pueden sumar o restar dos números aleatorios, o ver el registro de actividades.

### 🛠️ Utils.java

Esta clase contiene métodos estáticos para realizar operaciones de suma y resta, registrando cada operación en el `Logger`.

### 🗃️ Logger.java

Esta clase sigue el patrón Singleton para garantizar que solo haya una instancia de la clase. Almacena un registro de actividades en una lista.

## 🔚 Conclusión

El patrón Singleton es una herramienta poderosa para controlar la creación de instancias y el acceso a recursos compartidos en una aplicación. La implementación presentada muestra cómo se puede utilizar este patrón para gestionar un registro de actividades de manera eficiente y segura.
