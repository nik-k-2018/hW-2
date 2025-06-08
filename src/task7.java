public class task7 {
    public static void main(String[] args) {
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        // Остаток от деления большего веса на меньший
        var remainder = boxer2Weight % boxer1Weight;

        System.out.println("Остаток от деления " + boxer2Weight + " на " + boxer1Weight + " равен: " + remainder);
    }
}