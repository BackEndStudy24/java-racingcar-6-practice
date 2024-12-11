package racingcar.model;

public class CarName {

    private String carName;
    private int moveCount = 0;

    public CarName(String carName) {
        this.carName = carName;
        this.moveCount = 0;
    }

    public void move_forward() {
        if(RandomNumber.getMoveChance()) {
            this.moveCount += 1;
        }
    }
}
