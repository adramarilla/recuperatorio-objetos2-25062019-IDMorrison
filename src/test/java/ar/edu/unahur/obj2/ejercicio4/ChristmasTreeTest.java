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
        PlasticChristmasTreeWithGarland plasticChristmasTree = new PlasticChristmasTreeWithGarland();
        assertEquals(plasticChristmasTree.assembly(), "Plastic Christmas tree with Garland");
    }

    @Test
    public void testPlasticTreeWithBubbleLights() {
        PlasticChristmasTreeWithBubbleLights plasticChristmasTree = new PlasticChristmasTreeWithBubbleLights();
        assertEquals(plasticChristmasTree.assembly(), "Plastic Christmas tree with Bubble Lights");
    }

    @Test
    public void testPlasticTreeWithGarlandAndBubbleLights() {
        PlasticChristmasTreeWithGarlandAndBubbleLights plasticChristmasTree = new PlasticChristmasTreeWithGarlandAndBubbleLights();
        assertEquals(plasticChristmasTree.assembly(), "Plastic Christmas tree with Garland with Bubble Lights");
    }

    @Test
    public void testRealTree() {
        RealChristmasTree realChristmasTree = new RealChristmasTree();
        assertEquals(realChristmasTree.assembly(), "Real Christmas tree");
    }

    @Test
    public void testRealTreeWithGarland() {
        RealChristmasTreeWithGarland plasticChristmasTree = new RealChristmasTreeWithGarland();
        assertEquals(plasticChristmasTree.assembly(), "Real Christmas tree with Garland");
    }

    @Test
    public void testRealTreeWithBubbleLights() {
        RealChristmasTreeWithBubbleLights plasticChristmasTree = new RealChristmasTreeWithBubbleLights();
        assertEquals(plasticChristmasTree.assembly(), "Real Christmas tree with Bubble Lights");
    }

    @Test
    public void testRealTreeWithGarlandAndBubbleLights() {
        RealChristmasTreeWithGarlandAndBubbleLights plasticChristmasTree = new RealChristmasTreeWithGarlandAndBubbleLights();
        assertEquals(plasticChristmasTree.assembly(), "Real Christmas tree with Garland with Bubble Lights");
    }
}