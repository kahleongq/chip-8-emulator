package src.main.java.emulator;

import java.util.Stack;

// Need to have a parent class?
public class InstructionRegister {

    private final Stack<Byte> q;

    InstructionRegister() {
        this.q = new Stack<>();
    }

    public void add(byte b) {
        q.push(b);
    }

    public byte getRecentByte() {
        return q.pop();
    }
}
