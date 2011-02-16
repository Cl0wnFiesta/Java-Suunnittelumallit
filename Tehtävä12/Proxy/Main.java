import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Image {
    public void displayImage();

    public void showData();
}

// On System A
class RealImage implements Image {
    private final String filename;

    /**
     * Constructor
     * 
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Showing more " + filename + " information");
    }
}

// On System B
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * 
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        if (image == null) {
            System.out.println("Showing " + filename + " information");
        } else
            image.showData();
    }
}

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        List<ProxyImage> list = new ArrayList<ProxyImage>();
        list.add((ProxyImage) image1);
        list.add((ProxyImage) image2);

        for (ProxyImage proxyImage : list) {
            proxyImage.showData();
        }

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println(
                    "Enter 1 to display next picture or 2 to display previous picture or 3 to show data or 4 to exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                if (i < list.size() - 1)
                    i++;
                list.get(i).displayImage();

            } else if (choice == 2) {
                if (i > 0)
                    i--;
                list.get(i).displayImage();
            } else if (choice == 3) {
                list.get(i).showData();
            } else if (choice == 4) {
                break;
            }
        }
    }
}