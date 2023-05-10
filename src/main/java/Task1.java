/*
The input is a long list of integers. Please write a small app that will output the list of distinct elements
sorted in ascending order, plus the basic measurement information that contains the number of elements in the source,
number of distinct elements, min and max value.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {

    private List<String> readInput() throws IOException {
        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        // Reading input a string
        return Arrays.asList(bi.readLine().split(" "));

    }

    public List<String> readInputByScanner(){                  //alternative version using Scanner
        List<String> answer = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            answer.add(scanner.next());
        }
        return answer;
    }

    public void printAnswer(List<Integer> output, int originalListSize){

        for (int i : output){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("count: " + originalListSize);
        System.out.println("distinct: " +output.size());
        System.out.println("min: " + output.get(0));
        System.out.println("max: " + output.get(output.size()-1));
    }

    public List<Integer> calculate(List<String> strNums){

        return  strNums.stream()
                .map(Integer::valueOf)          // convert to Integer
                .distinct()                     // remove duplicates
                .sorted()                       // sort collection
                .collect(Collectors.toList());  // return list

    }

}
