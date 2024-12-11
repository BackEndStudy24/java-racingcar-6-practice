package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNames {

    private static final String COMMA = ",";

//    List<String> carNames = new ArrayList<>();

    private void separateComma(String rawInput) {
        List<String> carNames = Arrays.stream(rawInput.split(COMMA))
                .map(String::trim)
                .toList();
    }
}
