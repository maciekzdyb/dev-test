import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Again, the input is a long list of integers. Provide a working code that will find all the pairs (in this integer list)
that sum up to 13. Each pair in the output should have first number not greater than the second one and
lines should be sorted in an ascending order.
 */
public class Task2 {

    private List<String> readInput() throws IOException {
        // Creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        // Reading input a string
        return Arrays.asList(bi.readLine().split(" "));

    }

    public void calculate(){
        try {
            List<String> strNums = readInput();
            List<Integer> originalList = strNums.stream()
                    .map(Integer::valueOf)                      //convert to integer
                    .sorted()                                   //here we have sorted answer
                    .collect(Collectors.toList());
            for (int i = 0; i < originalList.size(); i++) {     // because it's sorted just go thru
                for (int j = i + 1; j < originalList.size(); j++) {
                    if (originalList.get(i) + originalList.get(j) == 13) {
                        System.out.println(originalList.get(i) + " " + originalList.get(j)); // print answer
                    }
                }
            }
        }catch (IOException e){
            System.out.println("error reading input");
            System.out.println(e.getMessage());
        }
    }

}
