public class HardDrive {
    private String[] data = new String[100];

    public HardDrive() {
        for (int i = 0; i < data.length; i++) {
            data[i] = "Wonderful file nr " + String.valueOf(i);
        }
    }

    public String read(long lba) {
        System.out.println("HardDrive read file " + lba);
        return data[(int) lba];
    }
}
