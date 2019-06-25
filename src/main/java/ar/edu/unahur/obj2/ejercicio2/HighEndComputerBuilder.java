package ar.edu.unahur.obj2.ejercicio2;

public class HighEndComputerBuilder extends ComputerBuilder {

    protected void addMotherboard() {
        computerParts.put("Motherboard", "High-end Motherboard");
    }

    protected void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
    }

    protected void addProcessor() {
        computerParts.put("Processor", "High-end Processor");
    }
}
