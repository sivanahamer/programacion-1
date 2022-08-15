# Variables y operadores

Para programar, ocupamos guardar toda la información que vamos a utilizar en algún lado llamado una **variable**. Por ejemplo, podemos tener una variable que guarde la cantidad de pedazos de una pizza que hemos comido llamada `tajadasComidas`.

En lenguajes de programación existen distintas convenciones con respecto a variables.

1. Son **sustantivos**. Ejemplos de sustantivos son `perros`, `cantidadOjos` o `nombre`.
2. Tienen **nombres significativos**. Esto significa que, basado en el **nombre** que tiene una variable se puede entender lo que está guardando. En nuestro ejemplo anterior, es un nombre más significativo `tajadasComidas` que `tc`.
3. Existen dos convenciones populares para dar nombres de variables. La primera se llama **camelCase** dado que se ponen las palabras juntas, con todas excepto la primera iniciando en mayúsculas para representar los espacios como un camello (e.g., `tajadasComidas`). La otra convención se llama **snake_case** donde se juntan las palabras por medio de _ y se pone todas las palabras en minúscula (e.g., `tajadas_comidas`). En Java, se utiliza la convención de **camelCase** que vamos a seguir.
4. Es una práctica frecuente escribir nombres de variables con los caracteres del alfabeto inglés dado que dependiendo la máquina y compilador, podrían darse problemas. Nosotros vamos a seguir esta práctica de solo utilizar caracteres [ASCII](https://www.asciitable.com/).
5. Igualmente, es común utilizar ingles en programas dado que es la *lingua franca* (lenguaje por defecto) de programar. En este curso, se podrá utilizar ingles, español o *spanglish*.

> [!NOTE]
> Es importante seguir las convenciones de nombres ya que son **buenas prácticas de programación** que ayudan con la **legibilidad** de los programas.

Las variables guardan distintos datos dependiendo su **tipo de datos**. Por ejemplo, en `tajadasComidas` el tipo de dato es un **entero** asumiendo que solo estamos comiendo toda una tajada de pizza o ninguna. Aunque, también podríamos decir que es un **flotante** si alguien come tres tajadas y media (3.5). Decidir el tipo de representación depende del problema que estamos resolviendo y lo que ocupamos guardar.
Otros tipos de datos relevantes son **boleanos** que guarda `True` o `False`. Se puede utilizar para representar si alguien comió o no tajadas con una variable de `comioTajadas`. Otro tipo de dato son **caracteres o strings (cadenas de caracteres)** que guardan información textual. Un ejemplo sería guardar en una variable string el `tipoPizza` que podría ser `"peperoni"`, `"margarita"`, o `"hawaiana"`.

Por medio de variables, podemos utilizarlas para realizar distintas operaciones por medio de **operadores**. Por ejemplo, podríamos sumar una tajada más en `tajadasComidas` para representar que alguien comió una tajada más. Existen otros operadores aparte de los aritméticos como los relacionales, de asignación y lógicos.

> [!ATTENTION]
> Para iniciar a practicar este tema debe haber terminado de realizar la configuración del laboratorio 1. Todos los temas de aquí en adelante son acumulativos y requiere de que comprendan los temas anteriores. Ante cualquier duda, lo mejor es evacuar lo que no entienden lo antes posible 😁.

**Presentaciones:**

- [Variables y tipos de datos](./02-Variables_operadores/pres/03-Var.pdf)
- [Operadores](./02-Variables_operadores/pres/04-Op.pdf)

**Asignación:** Ver en [mediación](https://mv1.mediacionvirtual.ucr.ac.cr/mod/assign/view.php?id=1768907).

## Ejercicios

Pendiente

## Material suplemental

Se recomienda ver los siguientes materiales para repasar el contenido visto en clases.

### Videos

1. [Variables](https://youtu.be/gtQJXzi3Yns).
2. [Variables y tipos de dato](https://youtu.be/qUXbJziVs_o).
3. [Operadores matemáticos](https://youtu.be/5DdacOkrTgo).
4. [Operadores de incremento](https://youtu.be/ydcTx6idTs0).
5. [Operadores lógicos](https://youtu.be/PAaqgTr7Cx4).
6. [Operadores condicionales](https://youtu.be/Y6NheSwTsDs).

### Lecturas

1. Capítulo 2 . Eck, David. Introduction to Programming Using Java. Octava edición. 2015.
2. Capítulo 2. Downey, Allen y Mayfield, Chris. Think Java: How to Think Like a Computer Scientist. Segunda edición. O'Reilly Media. 2019.
