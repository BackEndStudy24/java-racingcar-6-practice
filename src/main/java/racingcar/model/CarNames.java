package racingcar.model;

import racingcar.utils.ServiceValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarNames {

    private static final String COMMA = ",";

    private final List<String> carNames = new ArrayList<>();

    public void setCarNames(String rawInput) {
        List<String> carNameList = separateComma(rawInput);
        checkedCarNames(carNames);

        carNames.addAll(carNameList);

    }

    private void checkedCarNames(List<String> rawCarNames) {
        ServiceValidation.validateCarNameLength(rawCarNames);
        ServiceValidation.validateCarNameNull(rawCarNames);
    }

    private List<String> separateComma(String rawInput) {
        return Arrays.stream(rawInput.split(COMMA))
                .map(String::trim)
                .toList();
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
