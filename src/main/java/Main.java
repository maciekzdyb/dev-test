import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Choose task: enter 1, 2 or 3");
        System.out.println("Exit, enter q");
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine()).equals("q")){
            switch (input) {
                case "1" -> {
                    System.out.println("Taks 1, enter input:");
                    Task1 task1 = new Task1();
                    task1.calculate();
                }
                case "2" -> {
                    System.out.println("Taks 2, enter input:");
                    Task2 task2 = new Task2();
                    task2.calculate();
                }
                case "3" -> {
                    System.out.println("Taks 3, enter input:");
                    Task3 task3 = new Task3();
                    task3.calculate();
                }
            }
        }

    }
}