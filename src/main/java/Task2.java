import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/*
Again, the input is a long list of integers. Provide a working code that will find all the pairs (in this integer list)
that sum up to 13. Each pair in the output should have first number not greater than the second one and
lines should be sorted in an ascending order.
 */
public class Task2 {

    public List<Point> calculate(List<Integer> originalList){
        List<Point> pairs = new ArrayList<>();
        Collections.sort(originalList);
        for (int i = 0; i < originalList.size(); i++) {     // because it's sorted just go thru
            for (int j = i + 1; j < originalList.size(); j++) {
                if (originalList.get(i) + originalList.get(j) == 13) {
                    Point pair = new Point(originalList.get(i),originalList.get(j));
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }

    public List<Integer> readinput(){
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            integerList.add(scanner.nextInt());
        }
        return integerList;
    }

    public void printAnswer(List<Point> pairs){
        pairs.forEach(pair ->{
            System.out.println(pair.x + " " + pair.y);
        });
    }
}
