package project;
import java.util.*;

public class Project1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Using infinite loop for checking multiple binary images.
        while (true) {
            System.out.print("Enter the number of rows (or enter -1 to exit): ");
            int r = scanner.nextInt();

            if (r == -1) {
                break; // Exit the loop if -1 is entered
            }

            System.out.print("Enter the number of columns: ");
            int c = scanner.nextInt();

            int[][] binaryImage = new int[r][c];

            System.out.println("Enter the binary image (0 for black pixel which is (.), 1 for white pixel which is (*)):");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    binaryImage[i][j] = scanner.nextInt();
                }
            }

            Map<Integer, Integer> componentSizes = PixelRecursive(r, c, binaryImage);

            // Display the tabulation
            System.out.println("Size\tCount");
            for (Map.Entry<Integer, Integer> entry : componentSizes.entrySet()) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        }

        scanner.close();
    }


    public static Map<Integer, Integer> PixelRecursive(int r, int c, int[][] array) {
        char[][] labeledImage = new char[r][c];

        char label = 'a';

        Map<Integer, Integer> componentSizes = new HashMap<>();

        // Initialize labeledImage to '.' characters
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                labeledImage[i][j] = '.';
            }
        }

        // Iterate through each pixel in the binary image
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // If the pixel is white and has not been labeled yet
                if (array[i][j] == 1 && labeledImage[i][j] == '.') {
                    int size = labelConnectedComponent(i, j, label, array, labeledImage);
                    label++;
                    componentSizes.put(size, componentSizes.getOrDefault(size, 0) + 1);
                }
            }
        }

        // Display the labeled image
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(labeledImage[i][j]);
            }
            System.out.println();
        }

        return componentSizes;
    }

    private static int labelConnectedComponent(int i, int j, char label, int[][] array, char[][] labeledImage) {
        // Check if the pixel is within bounds and is white
        if (i < 0 || i >= array.length || j < 0 || j >= array[0].length || array[i][j] == 0 || labeledImage[i][j] != '.') {
            return 0;
        }

        // Label the current pixel and recursively label connected pixels
        labeledImage[i][j] = label;
        return 1 + labelConnectedComponent(i + 1, j, label, array, labeledImage)  // North
                + labelConnectedComponent(i - 1, j, label, array, labeledImage)  // South
                + labelConnectedComponent(i, j + 1, label, array, labeledImage)  // East
                + labelConnectedComponent(i, j - 1, label, array, labeledImage); // West
    }
}

