package racingcar.controller;

import racingcar.view.InputView;

public class Controller {

    public void start() {
        clientInput_CarNames();
    }

    private void clientInput_CarNames() {
        String rawInput = InputView.getInput();
    }
}
