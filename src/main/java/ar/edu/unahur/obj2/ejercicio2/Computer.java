package ar.edu.unahur.obj2.ejercicio2;

import java.util.List;
import java.util.Map;

public class Computer {
    
    private final Map<String, String> computerParts;
    private final List<String> motherboardSetupStatus;

    public Computer(Map<String, String> computerParts, List<String> motherboardSetupStatus) {
        this.computerParts = computerParts;
        this.motherboardSetupStatus = motherboardSetupStatus;
    }

    public Map<String, String> getComputerParts() {
        return computerParts;
    }

    public List<String> getMotherboardSetupStatus() {
        return motherboardSetupStatus;
    }


}
