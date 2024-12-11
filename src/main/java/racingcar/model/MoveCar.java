package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class MoveCar {

    private static final String HYPHEN = "-";

    private List<CarName> cars = new ArrayList<>();


    public void createCars(List<String> carNames, int moveCount) {

        for (String carName : carNames) {
            cars.add(new CarName(carName));
        }
        playGames(moveCount);
    }

    public void playGames(int moveCount) {
        for(int i = 0; i< moveCount; i++) {
            for (CarName car : cars) {
                car.move_forward();
                System.out.println(car.getCarName() + " : " + HYPHEN.repeat(car.getMoveCount()));
            }
            System.out.println();
        }
    }

}
