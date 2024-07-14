package src.main.java.emulator;

import java.util.ArrayList;

public class Register {

    private final ArrayList<Instruction> arr;

    Register() {
        this.arr = new ArrayList<>();
    }

    public Instruction get(int address) {
        return this.arr.get(address);
    }
}
