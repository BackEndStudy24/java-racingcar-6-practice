package racingcar.controller;

import racingcar.model.CarNames;
import racingcar.model.MoveCar;
import racingcar.model.Winners;
import racingcar.utils.ServiceValidation;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {

    private final CarNames carNames = new CarNames();
    private final MoveCar moveCar = new MoveCar();
    private final Winners winners = new Winners(moveCar);

    public void start() {
        runWithRetry(this::clientInput_CarNames);
        runWithRetry(this::clientInput_MoveCount);
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

        moveCar(moveCount);
        printWinners();

    }

    private void moveCar(int moveCount) {
        OutputView.printGameResults();
        moveCar.createCars(carNames.getCarNames(), moveCount);
    }

    private void printWinners() {
        winners.setWinners();
        String winner = winners.getWinners().toString();
        winner = winner.replaceAll("[\\[\\]]", "");
        OutputView.printGameWinners(winner);
    }


    private void runWithRetry(Runnable serviceMethod) {
        boolean success = false;
        while (!success) {
            try {
                serviceMethod.run();
                success = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
