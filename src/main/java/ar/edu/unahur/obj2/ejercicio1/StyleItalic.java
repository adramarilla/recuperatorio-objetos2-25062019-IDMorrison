package ar.edu.unahur.obj2.ejercicio1;

public class StyleItalic implements StyleAbstract {

    @Override
    public String apply(String input) {
        return "<i>" + input + "</i>";
    }
}
