public class task6 {
    public static void main(String[] args) {
        var boxer1Weight = 78.2; // масса первого боксера
        var boxer2Weight = 82.7; // масса второго боксера

        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;

        System.out.println("Общая масса бойцов: " + totalWeight + " кг");
        System.out.println("Разница в массе бойцов: " + weightDifference + " кг");
    }
}