package ar.edu.unahur.obj2.ejercicio2;

public class StandardComputerBuilder extends ComputerBuilder {

    @Override
    protected void addMotherboard() {
        computerParts.put("Motherboard", "Standard Motherboard");
    }

    @Override
    protected void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
    }

    @Override
    protected void addProcessor() {
        computerParts.put("Processor", "Standard Processor");
    }
}
