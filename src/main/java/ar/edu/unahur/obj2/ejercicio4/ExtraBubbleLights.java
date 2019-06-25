package ar.edu.unahur.obj2.ejercicio4;

public class ExtraBubbleLights extends Extra {

    public ExtraBubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String assembly() {
        return christmasTree.assembly() + " with Bubble Lights";
    }
}
