package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StylerTest {

    @Test
    public void testApplyBold() {
        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, Style.BOLD);
        assertEquals(resultado, "<b>" + input + "</b>");
    }

    @Test
    public void testApplyItalic() {
        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, Style.ITALIC);
        assertEquals(resultado, "<i>" + input + "</i>");
    }

    @Test
    public void testApplyUnderline() {
        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, Style.UNDERLINE);
        assertEquals(resultado, "<u>" + input + "</u>");
    }
}