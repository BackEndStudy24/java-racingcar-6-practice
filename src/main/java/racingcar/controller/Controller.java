package racingcar.controller;

import racingcar.utils.ServiceValidation;
import racingcar.view.InputView;

public class Controller {

    public void start() {
        clientInput_CarNames();
        clientInput_MoveCount();
    }

    private void clientInput_CarNames() {
        String rawInput = InputView.getInput();
        ServiceValidation.validateNull(rawInput);
    }

    private void clientInput_MoveCount() {
        String rawMoveCount = InputView.getMoveCount();
        ServiceValidation.validateNull(rawMoveCount);
        ServiceValidation.validateIsNumeric(rawMoveCount);
        int moveCount = Integer.parseInt(rawMoveCount);
        ServiceValidation.validateMoveCount(moveCount);


    }
}
