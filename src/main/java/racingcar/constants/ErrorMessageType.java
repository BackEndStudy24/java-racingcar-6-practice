package racingcar.constants;

public enum ErrorMessageType {
    INVALID_MOVE_COUNT("[ERROR] 올바르지 않은 전진 횟수입니다."),
    INVALID_NULL_INPUT("[ERROR] 빈 값은 입력할 수 없습니다.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
