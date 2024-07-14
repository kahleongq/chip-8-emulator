package src.main.java.emulator;

public class Memory {

    private final byte[] arr;

    Memory() {
        this.arr = new byte[4096];
    }

    public byte get(int address) {
        return this.arr[address];
    }
}
