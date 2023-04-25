import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 8, 9, 10};
        int sumOfEvenNumber = Main.sumOfEvenNumber(numbers);
        System.out.println("Sum of even numbers:");
        System.out.println();
        System.out.println(sumOfEvenNumber);
        System.out.println();

        String stringWithDuplicatedCharacters = "Alexx9800";
        Main.printStringCharacters(stringWithDuplicatedCharacters);
    }

    public static int sumOfEvenNumber(int[] numbers) {
        int sumOfNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfNumbers += numbers[i];
            }
        }

        return sumOfNumbers;
    }

    public static void printStringCharacters(String value) {
        char[] characters = value.toCharArray();

        ArrayList<Character> charactersList = new ArrayList<Character>();

        for (int i = 0; i < characters.length; i++) {
            if (!charactersList.contains(characters[i])) {
                charactersList.add(characters[i]);
            }
        }

        System.out.println("Parsed string without duplicated characters:");
        System.out.println();

        for (int i = 0; i < charactersList.size(); i++) {
            System.out.println(charactersList.get(i));
        }
    }
}

