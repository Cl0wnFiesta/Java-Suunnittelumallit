public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();

        // Load the first 10 files from the hard drive into memory. These are the most important files.

        for (int i = 0; i < 10; i++) {
            memory.load(i, hardDrive.read(i));
        }
        
        cpu.jump(0);
        cpu.execute();
    }
}
