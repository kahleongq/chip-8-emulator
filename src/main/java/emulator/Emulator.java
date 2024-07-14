package src.main.java.emulator;

public class Emulator {

    private static boolean EXIT = false;

    private static ProgramCounter pc;
    private static Register reg;

    public static void main(String[] args) {

        onInit();

        while (!EXIT) {
            try {
                Instruction instruction = fetchCmd(pc, reg);
                decodeCmd(instruction);
                executeCmd();
            } catch (Exception e) {
                System.out.println(e);
                onExit();
            }
        }
    }

    private static Instruction fetchCmd(ProgramCounter pc, Register reg) {
        return reg.get(pc.getAddress());
    }

    private static void decodeCmd(Instruction instruction) {

    }

    private static void executeCmd() {
        pc = pc.update();
    }

    private static void onInit() {
        EXIT = false;
        pc = new ProgramCounter();
        reg = new Register();
    }

    private static void onExit() {
        EXIT = true;
    }
}
