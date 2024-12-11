package racingcar.model;

import racingcar.utils.ServiceValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarNames {

    private static final String COMMA = ",";

    private final List<String> carNames = new ArrayList<>();

    public void setCarNames(String rawInput) {
        List<String> carNameList = separateComma(rawInput);
        ServiceValidation.validateCarNameLength(carNameList);
        ServiceValidation.validateCarNameNull(carNameList);

        carNames.addAll(carNameList);

    }

    private List<String> separateComma(String rawInput) {
        return Arrays.stream(rawInput.split(COMMA))
                .map(String::trim)
                .toList();
    }


    // 방어적 복사
    public List<String> getCarNames() {
        return Collections.unmodifiableList(new ArrayList<>(carNames));
    }
}
