public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 8, 9, 10};
        int myVar = Main.sumOfEvenNumber(numbers);
        System.out.println(myVar);
    }

    public static int sumOfEvenNumber(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        return sum;
    }
}

