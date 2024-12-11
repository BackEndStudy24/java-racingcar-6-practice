package racingcar.controller;

import racingcar.model.CarNames;
import racingcar.model.MoveCar;
import racingcar.utils.ServiceValidation;
import racingcar.view.InputView;

public class Controller {

    private final CarNames carNames = new CarNames();
    private final MoveCar moveCar = new MoveCar();

    public void start() {
        clientInput_CarNames();
        clientInput_MoveCount();
    }

    private void clientInput_CarNames() {
        String rawInput = InputView.getInput();
        ServiceValidation.validateNull(rawInput);

        checkedCarNames(rawInput);
    }

    private void checkedCarNames(String rawInput) {
        carNames.setCarNames(rawInput);
    }


    private void clientInput_MoveCount() {
        String rawMoveCount = InputView.getMoveCount();
        ServiceValidation.validateNull(rawMoveCount);
        ServiceValidation.validateIsNumeric(rawMoveCount);
        int moveCount = Integer.parseInt(rawMoveCount);
        ServiceValidation.validateMoveCount(moveCount);

    }

    private void moveCar(int moveCount) {

    }
}
