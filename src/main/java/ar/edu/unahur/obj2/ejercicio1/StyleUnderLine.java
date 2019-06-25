package ar.edu.unahur.obj2.ejercicio1;

public class StyleUnderLine implements StyleAbstract {

    @Override
    public String apply(String input) {
        return "<u>" + input + "</u>";
    }
}
