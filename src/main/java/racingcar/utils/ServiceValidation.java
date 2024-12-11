package racingcar.utils;

import racingcar.constants.ErrorMessageType;

import java.util.List;
import java.util.regex.Pattern;

public class ServiceValidation {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+");

    public static void validateNull(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_NULL_INPUT.getMessage());
        }
    }

    public static void validateIsNumeric(String input) {
        if (!NUMBER_PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_MOVE_COUNT.getMessage());
        }
    }

    public static void validateCarNameNull(List<String> carNames) {
        for(String car : carNames) {
            if(car.isBlank()) {
                throw new IllegalArgumentException(ErrorMessageType.INVALID_CAR_NAME.getMessage());
            }
        }
    }

}
