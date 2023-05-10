import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void validateReadInput(){
        List<String> expected = new ArrayList<>(List.of("6","2","4"));

        String userInput = String.format("6%s2%s4",System.lineSeparator(),System.lineSeparator());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(byteArrayInputStream);

        Task1 task1 = new Task1();
        List<String> actual = task1.readInputByScanner();

        assertEquals(expected,actual);
    }

    @Test
    void calculateShouldReturnIntegersList() {
        List<String> inputList = new ArrayList<>(List.of("1", "10", "20", "20", "2", "5"));
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 5, 10, 20));

        Task1 task1 = new Task1();
        List<Integer> actual = task1.calculate(inputList);

        assertEquals(expected,actual);

    }
}