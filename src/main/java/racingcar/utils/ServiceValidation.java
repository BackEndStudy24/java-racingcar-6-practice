package racingcar.utils;

import racingcar.constants.ErrorMessageType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class ServiceValidation {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("-?\\d+");

    public static void validateNull(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_NULL_INPUT.getMessage());
        }
    }

    public static void validateMoveCount(int moveCount) {
        if(moveCount < 1) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_MOVE_COUNT.getMessage());
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
                throw new IllegalArgumentException(ErrorMessageType.INVALID_CAR_NAME_NULL.getMessage());
            }
        }
    }

    public static void validateCarNameLength(List<String> carNames) {
        for(String car : carNames) {
            if(car.length() > 5) {
                throw new IllegalArgumentException(ErrorMessageType.INVALID_CAR_NAME_LENGTH.getMessage());
            }
        }
    }

    public static void validateDuplicateNames(List<String> carNames) {
        Set<String> setCarNames = new HashSet<>(carNames);

        if(setCarNames.size() != carNames.size()) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_DUPLICATE_NAME.getMessage());
        }
    }

}
