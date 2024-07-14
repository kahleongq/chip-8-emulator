package src.main.java.emulator;

public class ProgramCounter {

    private final int address;

    ProgramCounter() {
        this.address = 0;
    }

    ProgramCounter(int address) {
        this.address = address;
    }

    public int getAddress() {
        return this.address;
    }

    public ProgramCounter update() {
        return new ProgramCounter(this.address + 1);
    }
}
