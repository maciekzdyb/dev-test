import org.junit.jupiter.api.Test;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    @Test
    public void testReadInput(){
        List<Integer> expected =List.of(1,2,3);

        String userInput = String.format("1%s2%s3",System.lineSeparator(),System.lineSeparator());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(byteArrayInputStream);

        Task2 task2 = new Task2();
        List<Integer> actual = task2.readinput();

        assertEquals(expected,actual);
    }

    @Test
    public void testCalculateShouldReturnPointsList(){
        List<Integer> inputList = new ArrayList<>(List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));
        List<Point> expected = List.of(new Point(0,13), new Point(3,10),
                                       new Point(6,7), new Point(6,7));
        Task2 task2 = new Task2();
        List<Point> actual = task2.calculate(inputList);

        assertEquals(expected,actual);
    }

}