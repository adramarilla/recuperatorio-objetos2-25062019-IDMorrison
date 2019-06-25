# Objetos 2 : Recuperatorio

* El exámen cuenta con 5 ejercicios, todos valen 2(dos) puntos
* Los ejercicios se pueden resolver en el orden deseado
* Cada ejercicio cuenta con código pre-existente y con test unitarios que lo verifican
* Para considerarse completo los test del ejercicio deben seguir compilando y dando ok

## Ejercicio 1
Estamos desarrollando un programa que añade estilos en formato HTML a un texto. Este programa inicialmente soporta los estilos  `BOLD`, `ITALIC` y `UNDERLINE`, pero está pensado agregar muchos mas en el futuro.
Contamos con una implementación inicial con la cual no estamos muy contentos porque no nos permite agregar de forma fácil y dinámica nuevos estilos.
La implementación actual es la siguiente:

```java
public enum Style {
    BOLD, ITALIC, UNDERLINE
}

public class Styler {

    public String apply(String input, Style style) {
        if (style.equals(BOLD)) {
            return "<b>" + input + "</b>";
        } else if (style.equals(ITALIC)) {
            return "<i>" + input + "</i>";
        } else if  (style.equals(UNDERLINE)) {
            return "<u>" + input + "</u>";
        } else {
            throw new NotImplementedException("This style is not supported");
        }
    }
}
```

Tenemos test unitarios que prueban la funcionalidad, por ejemplo el que prueba el estilo BOLD:

```java
    @Test
    public void testApplyBold() {
        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, Style.BOLD);
        assertEquals(resultado, "<b>" + input + "</b>");
    }
```

**Se solicita hacer las mejoras y cambios necesarios en el código para eliminar la lógica condicional de la clase Styler de forma tal que agregar un nuevo estilo no implique tocar dicha clase.**


## Ejercicio 2

El siguiente código modela la línea de producción de determinada marca de computadoras, actualmente tienen 2 tipos de máquinas, las `Standard` para uso hogareño y las `HighEnd` destinadas a uso profesional.
En un futuro se planea tener mas tipos de computadoras y es necesario asegurar que todas se construyan de la misma forma, es decir, siguiendo los mismos pasos para asegurar la calidad de las mismas.

El código que opera la linea de producción actualmente es el siguiente:

```java
public abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherboardSetupStatus = new ArrayList<>();
    
    public abstract Computer buildComputer();


    protected Computer getComputer() {
        Computer computer = new Computer(new HashMap<>(computerParts), new ArrayList<>(motherboardSetupStatus));
        computerParts.clear();
        motherboardSetupStatus.clear();
        return computer;
    }
}

public class StandardComputerBuilder extends ComputerBuilder {

    public final Computer buildComputer() {
        computerParts.put("Motherboard", "Standard Motherboard");
        motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
        computerParts.put("Processor", "Standard Processor");
        return getComputer();
    }

}

public class HighEndComputerBuilder extends ComputerBuilder {

    public final Computer buildComputer() {

        addMotherboard();
        setupMotherboard();
        addProcessor();
        return getComputer();
    }

    protected void addMotherboard() {
        computerParts.put("Motherboard", "High-end Motherboard");
    }

    protected void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
    }

    protected void addProcessor() {
        computerParts.put("Processor", "High-end Processor");
    }
}
```

**Se solicita hacer las mejoras y cambios necesarios en el código de forma tal que los distintos tipos de computadoras, los existentes y los nuevos por haber, se contruyan siempre siguiendo los mismos pasos.**


## Ejercicio 3

Una agencia de noticias tiene un sistema para informar de sus noticias a los canales y radios asociadas. 
Como se acercan épocas electorales, de mucho trabajo, la agencia está en expansión, con muchos nuevos posibles asociados y ve poco escalable el sistema tal cual está ya que por cada uno que consiga necesita agregar mucho código en su sistema.

El código que tienen hoy en día es el siguiente:

```java
public class NewsAgency {

    private String news;
    private NewsChannel10 newsChannel10;
    private NewsChannel11 newsChannel11;
    private NewsPortal newsPortal;
    private Radio900 radio900;

    public NewsAgency(NewsChannel10 newsChannel10, NewsChannel11 newsChannel11, NewsPortal newsPortal, Radio900 radio900) {
        this.newsChannel10 = newsChannel10;
        this.newsChannel11 = newsChannel11;
        this.newsPortal = newsPortal;
        this.radio900 = radio900;
    }

    public void setNews(String news) {
        this.news = news;
        newsChannel10.changeNews(news);
        newsChannel11.setNews(news);
        newsPortal.update(news);
        radio900.updateNews(news);
    }
}

```
**Se solicita hacer las mejoras y cambios necesarios en el código de forma tal que no requiera modificaciones en el código de NewsAgency por cada incorporación o eliminación de un asociado.**


## Ejercicio 4

`NavidaFeli` es un emprendimiento que vende árboles de navidad. Para el ensamblado tienen un sistema que maneja la máquina que lo hace. Por ahora solo tienen `RealChristmasTree` (árboles reales) y `PlasticChristmasTree` (árboles de plástico) y como adornos, tienen `Garland` (guirnaldas) y `BubbleLights` (luces).
Quieren agregar nuevos adornos y tipos de árboles pero se dieron cuenta que el diseño de su sistema generaría un crecimiento exponencial de la cantidad de clases a medida que agreguen c/u.

Este es el diseño que tienen hoy: 

![](/src/main/resources/ejercicio4.png)

**Se solicita hacer las mejoras y cambios necesario en el código de forma tal que agregar nuevos tipos de árboles y adornos no implique dicho crecimiento.** 


## Ejercicio 5
En el siguiente modelo se tiene un banco `Bank`, este tiene una colección de clientes `Client` y los clientes tienen sus cuentas `Account`. 
Las cuentas son todas en la misma moneda

**Se solicita agregar la funcionalidad para:**


1. Buscar un cliente solicitado. 
2. Buscar el cliente más rico `RichestClient`, con mayor saldo en sus cuentas sumadas. 
3. Devolver la suma de todas las cuentas del banco, el tesoro `Treasure`.

_NOTA_: Cuando hayas terminado. Para validar tu código en este ejercicio, descomentá los asserts en los test. 
