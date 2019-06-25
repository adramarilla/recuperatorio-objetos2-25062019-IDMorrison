package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StylerTest {

    @Test
    public void testApplyBold() {
        StyleBold styleBold = new StyleBold();

        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, styleBold);
        assertEquals(resultado, "<b>" + input + "</b>");
    }

    @Test
    public void testApplyItalic() {
        StyleItalic styleItalic = new StyleItalic();

        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, styleItalic);
        assertEquals(resultado, "<i>" + input + "</i>");
    }

    @Test
    public void testApplyUnderline() {
        StyleUnderLine styleUnderLine = new StyleUnderLine();

        String input = "Hola Mundo !";
        Styler styler = new Styler();
        String resultado = styler.apply(input, styleUnderLine);
        assertEquals(resultado, "<u>" + input + "</u>");
    }
}