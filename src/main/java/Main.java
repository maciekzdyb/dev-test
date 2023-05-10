import java.awt.*;
import java.util.List;
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
                    List<String> inputList = task1.readInputByScanner();
                    List<Integer> answerList = task1.calculate(inputList);
                    task1.printAnswer(answerList,inputList.size());
                }
                case "2" -> {
                    System.out.println("Taks 2, enter input:");
                    Task2 task2 = new Task2();
                    List<Integer> integerList = task2.readinput();
                    List<Point> answerList = task2.calculate(integerList);
                    task2.printAnswer(answerList);
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