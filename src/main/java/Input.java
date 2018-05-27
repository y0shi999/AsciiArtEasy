import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Input {

    private final Integer height;
    private final Integer length;
    private final String textToTransform;
    private final List<String> asciiRepresentationRows;

    Input(String input) {
        Scanner scanner = new Scanner(input);
        length = scanner.nextInt();
        height = scanner.nextInt();
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        textToTransform = scanner.nextLine();
        asciiRepresentationRows = new ArrayList<>();

        while (scanner.hasNextLine()) {
            asciiRepresentationRows.add(scanner.nextLine());
        }

        scanner.close();
    }

    Input(Scanner scanner) {
        length = scanner.nextInt();
        height = scanner.nextInt();
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        textToTransform = scanner.nextLine();
        asciiRepresentationRows = new ArrayList<>();

        while (scanner.hasNextLine()) {
            asciiRepresentationRows.add(scanner.nextLine());
        }

        scanner.close();
    }

    Integer getHeight() {
        return height;
    }

    Integer getLength() {
        return length;
    }

    String getTextToTransform() {
        return textToTransform;
    }

    List<String> getAsciiRepresentationRows() {
        return asciiRepresentationRows;
    }
}
