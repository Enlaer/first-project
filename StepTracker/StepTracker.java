
import java.util.Scanner;


public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    int goalSteps = 10000;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void saveSteps() {
        System.out.println("Введите месяц (от 1 до 12):");
        int month = scanner.nextInt();
        MonthData monthData = MonthData
        System.out.println("Введите день:");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов:");
        int stepsInp = scanner.nextInt();
        while (stepsInp < 0) {
            System.out.println("Количество шагов не может быть отрицательным! \n Введите количество шагов:");
            stepsInp = scanner.nextInt();
        }
        monthData.steps[(day - 1)] = stepsInp;

    }

    class MonthData {
       int[] steps = new int[30]; // Заполните класс самостоятельно
    }
    void printStatistic() {
        System.out.println("Введите номер месяца, для отображения статистики:");
        int month = scanner.nextInt();
        MonthData thisMonth = MonthData();
        System.out.println("Количество пройденных шагов: ");
        for (int i = 0; i < 30; i++) {
            System.out.print((i + 1) + " день:" thisMonth.steps[i] + ", ");
        }
        int totalSteps = 0;
        for (int i = 0; i < 30; i++){
            totalSteps = totalSteps + thisMonth.steps[i];
        }
        System.out.println("Общее количество шагов за месяц: " + totalSteps);

        int maxSteps = 0;
        for (int i = 0; i < 30; i++) {
            if (thisMonth.steps[i] > maxSteps) {
                maxSteps = thisMonth.steps[i];
            }
        }
        System.out.println("Максимально пройденное количество шагов за месяц: " + maxSteps);

        double averageSteps = totalSteps / 30;
        System.out.println("Среднее количество шагов: " + averageSteps);

        Converter converter = new Converter();
        converter.printDistance(totalSteps);

        int currentSeries = 0;
        int maxSeries = 0;
        for (int i = 0; i < 30; i++) {
            if (thisMonth.steps[i] > goalSteps) {
                currentSeries = currentSeries + 1;
            } else {
                currentSeries = 0;
            }
            if (currentSeries > maxSeries) {
                maxSeries = currentSeries;
            }
        }
        System.out.println("Лучшая серия: дней подряд - " + maxSeries);

    }

    void changeGoal() {

        System.out.println("Введите новую цель:");
        int NewGoal = scanner.nextInt();
        while (NewGoal < 0) {
            System.out.println("Количество шагов не может быть меньше нуля! Введите значение больше нуля.");
            NewGoal = scanner.nextInt();
        }
        goalSteps = NewGoal;
        System.out.println("Новая цель: " + goalSteps + " шагов.");
    }
}