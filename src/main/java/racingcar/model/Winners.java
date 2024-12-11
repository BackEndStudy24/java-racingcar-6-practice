package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final MoveCar moveCar;

    private final List<String> winners = new ArrayList<>();

    public Winners(MoveCar moveCar) {
        this.moveCar = moveCar;
    }

    public void printGetWinner() {
        int maxCount = 0 ;

        for (int i = 0; i < moveCar.getCars().size(); i++) {
            if(moveCar.getCars().get(i).getMoveCount() > maxCount) {
                maxCount = moveCar.getCars().get(i).getMoveCount();
            }

            if(moveCar.getCars().get(i).getMoveCount() == maxCount) {
                winners.add(moveCar.getCars().get(i).getCarName());
            }

        }
        System.out.println(winners);

    }

}
