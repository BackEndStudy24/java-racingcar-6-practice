package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    private static final int MOVING_FORWARD_STANDARD = 4;
    private static final int RANDOM_MINIMUM = 0;
    private static final int RANDOM_MAXIMUM= 9;

    public static boolean getMoveChance() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MINIMUM, RANDOM_MAXIMUM);
        return randomNumber >= MOVING_FORWARD_STANDARD;
    }

}
