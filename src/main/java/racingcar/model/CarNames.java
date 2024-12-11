package racingcar.model;

import racingcar.utils.ServiceValidation;

import java.util.Arrays;
import java.util.List;

public class CarNames {

    private static final String COMMA = ",";

//    List<String> carNames = new ArrayList<>();

    private List<String> checkedCarNames(List<String> rawCarNames) {
        ServiceValidation.validateCarNameLength(rawCarNames);
        ServiceValidation.validateCarNameNull(rawCarNames);
        return rawCarNames;
    }

    private List<String> separateComma(String rawInput) {
        List<String> carNames = Arrays.stream(rawInput.split(COMMA))
                .map(String::trim)
                .toList();
        return carNames;
    }
}
