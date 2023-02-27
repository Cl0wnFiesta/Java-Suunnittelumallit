public class Main {
    public static void main(String[] args) {

        // Create a new instance of the Data class using decorator

        IData data = new SecureData(new FileData());

        // Set the data

        data.setData("This text is so secure, that no one can read this", "file.txt");

        // Read the data

        System.out.println(data.readData("file.txt"));

        // Create a new instance of the Data class using decorator

        IData data2 = new NonSecureData(new FileData());

        // Set the data

        data2.setData("Wow everyone can read this", "This_file_is_not_secure_at_all.txt");

        // Read the data

        System.out.println(data2.readData("This_file_is_not_secure_at_all.txt"));

        // Create a new instance of the Data class

        IData data3 = new FileData();

        data3.setData("This is a normal file", "normalFile.txt");

        System.out.println(data3.readData("normalFile.txt"));

    }
}
