package ar.edu.unahur.obj2.ejercicio2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HighEndComputerBuilderTest {

    @Test
    public void testHighEndComputer() {
        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        assertEquals("High-end Motherboard", highEndComputer.getComputerParts().get("Motherboard"));
        assertEquals("High-end Processor", highEndComputer.getComputerParts().get("Processor"));
        assertTrue(highEndComputer.getMotherboardSetupStatus().contains("Screwing the high-end motherboard to the case."));
        assertTrue(highEndComputer.getMotherboardSetupStatus().contains("Pluging in the power supply connectors."));
    }
}