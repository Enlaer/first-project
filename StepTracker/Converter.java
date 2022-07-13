public class Converter {
    void printDistance(int stepsInp){
        StepTracker stepTracker = new StepTracker();
        double distance = (stepsInp * 75) / 10000; //дистанция в км
        double lostCalories = (stepsInp * 50) / 1000; // ккал
        System.out.println("Пройденная дистанция: " + distance);
        System.out.println("Потрачено калорий: " + lostCalories);
    }
}
