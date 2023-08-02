import java.util.Random;
import java.util.Scanner;

public class Quiz {
    private Random random;
    private Scanner scanner;

    public Quiz() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void startQuiz() {
        int correctAnswer, userAnswer;
        int num1, num2;
        do {
            num1 = random.nextInt(100) + 1;
            num2 = random.nextInt(100) + 1;
            correctAnswer = num1 + num2;

            System.out.print("Ваш ответ: ");
            userAnswer = scanner.nextInt();

            System.out.println("Правильный ответ: " + correctAnswer);

        } while (userAnswer != correctAnswer);

        System.out.println("Ура! Опросник завершён! Вы победили!");

        scanner.close();
    }
}