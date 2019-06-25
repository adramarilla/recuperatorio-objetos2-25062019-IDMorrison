package ar.edu.unahur.obj2.ejercicio1;

import static ar.edu.unahur.obj2.ejercicio1.Style.*;

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
