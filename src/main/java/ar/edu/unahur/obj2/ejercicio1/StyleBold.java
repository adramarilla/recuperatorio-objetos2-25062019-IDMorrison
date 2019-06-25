package ar.edu.unahur.obj2.ejercicio1;

public class StyleBold implements StyleAbstract {

    @Override
    public String apply(String input) {
        return "<b>" + input + "</b>";
    }
}
