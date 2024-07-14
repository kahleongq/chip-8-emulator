package src.main.java.emulator;

public class Instruction {

    private final String str;

    Instruction(byte b1, byte b2) {
        String str1 = String.format("%02X", b1);
        String str2 = String.format("%02X", b2);
        str = str1 + str2;
    }
}
