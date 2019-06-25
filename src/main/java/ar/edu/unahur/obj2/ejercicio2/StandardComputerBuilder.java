package ar.edu.unahur.obj2.ejercicio2;

public class StandardComputerBuilder extends ComputerBuilder {

    public final Computer buildComputer() {
        computerParts.put("Motherboard", "Standard Motherboard");
        motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
        computerParts.put("Processor", "Standard Processor");
        return getComputer();
    }

}
