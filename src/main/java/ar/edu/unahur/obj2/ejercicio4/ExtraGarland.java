package ar.edu.unahur.obj2.ejercicio4;

public class ExtraGarland extends Extra {

    public ExtraGarland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String assembly() {
        return christmasTree.assembly() + " with Garland";
    }
}
