public class task8 {
    public static void main(String[] args) {
        var totalHours = 640;
        var hoursPerWorker = 8;

        var totalWorkers = totalHours / hoursPerWorker;

        System.out.println("Всего работников в компании — " + totalWorkers + " человек");

        var newWorkers = totalWorkers + 94;

        var newTotalHours = newWorkers * hoursPerWorker;

        System.out.println("Если в компании работает " + newWorkers +
                " человек, то всего " + newTotalHours +  " часов работы может быть поделено между сотрудниками");
    }
}