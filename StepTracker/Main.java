import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        Converter converted = new Converter();
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            userInput = scanner.nextInt();

            if (command == 1) {
                stepTracke.saveSteps();
            } else if (command == 2) {
                stepTracker.printStatistic();
            } else if (command == 3) {
                stepTracker.changeGoal();
            } else if (comman == 0) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Такой команды не существует!")
            }
        }
    }
         public static void printMenu();
        {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Ввести количество шагов");
            System.out.println("2 - Выдать статистику за месяц");
            System.out.println("3 - изменить цель по количеству шагов в день");
            System.out.println("0 - Выход.");

        }
    }
}
