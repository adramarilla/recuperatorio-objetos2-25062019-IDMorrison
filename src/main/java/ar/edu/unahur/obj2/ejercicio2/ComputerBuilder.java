package ar.edu.unahur.obj2.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherboardSetupStatus = new ArrayList<>();
    
    public Computer buildComputer(){
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return getComputer();
    }

    protected abstract void addProcessor();

    protected abstract void setupMotherboard();

    protected abstract void addMotherboard();
    


    protected Computer getComputer() {
        Computer computer = new Computer(new HashMap<>(computerParts), new ArrayList<>(motherboardSetupStatus));
        computerParts.clear();
        motherboardSetupStatus.clear();
        return computer;
    }
}
