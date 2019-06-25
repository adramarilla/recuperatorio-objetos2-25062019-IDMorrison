package ar.edu.unahur.obj2.ejercicio4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChristmasTreeTest {

    @Test
    public void testPlasticTree() {
        PlasticChristmasTree plasticChristmasTree = new PlasticChristmasTree();
        assertEquals(plasticChristmasTree.assembly(), "Plastic Christmas tree");
    }

    @Test
    public void testPlasticTreeWithGarland() {
        PlasticChristmasTree plasticChristmasTree = new PlasticChristmasTree();
        ExtraGarland extraGarland = new ExtraGarland(plasticChristmasTree);
        assertEquals(extraGarland.assembly(), "Plastic Christmas tree with Garland");
    }

    @Test
    public void testPlasticTreeWithBubbleLights() {
        PlasticChristmasTree plasticChristmasTree = new PlasticChristmasTree();
        ExtraBubbleLights extraBubbleLights = new ExtraBubbleLights(plasticChristmasTree);
        assertEquals(extraBubbleLights.assembly(), "Plastic Christmas tree with Bubble Lights");
    }

    @Test
    public void testPlasticTreeWithGarlandAndBubbleLights() {
        PlasticChristmasTree plasticChristmasTree = new PlasticChristmasTree();
        ExtraGarland extraGarland = new ExtraGarland(plasticChristmasTree);
        ExtraBubbleLights extraBubbleLights = new ExtraBubbleLights(extraGarland);
        assertEquals(extraBubbleLights.assembly(), "Plastic Christmas tree with Garland with Bubble Lights");
    }

    @Test
    public void testRealTree() {
        RealChristmasTree realChristmasTree = new RealChristmasTree();
        assertEquals(realChristmasTree.assembly(), "Real Christmas tree");
    }

    @Test
    public void testRealTreeWithGarland() {
        RealChristmasTree realChristmasTree = new RealChristmasTree();
        ExtraGarland extraGarland = new ExtraGarland(realChristmasTree);
        assertEquals(extraGarland.assembly(), "Real Christmas tree with Garland");
    }

    @Test
    public void testRealTreeWithBubbleLights() {
        RealChristmasTree realChristmasTree = new RealChristmasTree();
        ExtraBubbleLights extraBubbleLights = new ExtraBubbleLights(realChristmasTree);
        assertEquals(extraBubbleLights.assembly(), "Real Christmas tree with Bubble Lights");
    }

    @Test
    public void testRealTreeWithGarlandAndBubbleLights() {
        RealChristmasTree realChristmasTree = new RealChristmasTree();
        ExtraGarland extraGarland = new ExtraGarland(realChristmasTree);
        ExtraBubbleLights extraBubbleLights = new ExtraBubbleLights(extraGarland);
        assertEquals(extraBubbleLights.assembly(), "Real Christmas tree with Garland with Bubble Lights");
    }
}