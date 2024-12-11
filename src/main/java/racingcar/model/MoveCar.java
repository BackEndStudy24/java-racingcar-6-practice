package racingcar.model;

import java.util.List;

public class MoveCar {

    private static final String HYPHEN = "-";

    public void createCars(List<String> carNames) {
        for (String carName : carNames) {
            CarName car = new CarName(carName);
        }
    }

}
