package src.main.java.emulator;

public class Emulator {

    private static boolean EXIT = false;

    private static ProgramCounter pc;
    private static Memory mem;
    private static InstructionRegister instructReg;

    public static void main(String[] args) {

        onInit();

        while (!EXIT) {
            try {
                fetchCmd();
                Instruction instruction = decodeCmd();
                executeCmd();
            } catch (Exception e) {
                System.out.println(e);
                onExit();
            }
        }
    }

    private static void fetchCmd() {
        int increment = 2; // each instruction is 2 bytes, increment of PC done in fetch phase.
        for (int i = 0; i < increment; i++) {
            byte b = mem.get(pc.getAddress());
            instructReg.add(b);
            pc.update();
        }
    }

    private static Instruction decodeCmd() {
        byte b2 = instructReg.getRecentByte();
        byte b1 = instructReg.getRecentByte();
        return new Instruction(b1, b2);
    }

    private static void executeCmd() {
        pc = pc.update();
    }

    private static void onInit() {
        EXIT = false;
        pc = new ProgramCounter();
        mem = new Memory();
        instructReg = new InstructionRegister();
    }

    private static void onExit() {
        EXIT = true;
    }
}
