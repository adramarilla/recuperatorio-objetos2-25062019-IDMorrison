package ar.edu.unahur.obj2.ejercicio2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StandardComputerBuilderTest {

    @Test
    public void testStandardComputer() {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer highEndComputer = standardComputerBuilder.buildComputer();
        assertEquals("Standard Motherboard", highEndComputer.getComputerParts().get("Motherboard"));
        assertEquals("Standard Processor", highEndComputer.getComputerParts().get("Processor"));
        assertTrue(highEndComputer.getMotherboardSetupStatus().contains("Screwing the standard motherboard to the case."));
        assertTrue(highEndComputer.getMotherboardSetupStatus().contains("Pluging in the power supply connectors."));
    }
}