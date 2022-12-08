import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int birthYear, remainder;
        String zodiac = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        birthYear = scanner.nextInt();

        remainder = birthYear % 12;
        switch (remainder) {
            case 0 -> zodiac = "Monkey";
            case 1 -> zodiac = "Rooster";
            case 2 -> zodiac = "Dog";
            case 3 -> zodiac = "Pig";
            case 4 -> zodiac = "Rat";
            case 5 -> zodiac = "Ox";
            case 6 -> zodiac = "Tiger";
            case 7 -> zodiac = "Rabbit";
            case 8 -> zodiac = "Dragon";
            case 9 -> zodiac = "Snake";
            case 10 -> zodiac = "Horse";
            case 11 -> zodiac = "Goat";
        }
        System.out.print("Your chinese zodiac sign is " + zodiac + ".");
    }
}
