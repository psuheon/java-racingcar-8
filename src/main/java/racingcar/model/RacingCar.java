package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
public class RacingCar {
    String name;
    int numberOfAdvances;

    public RacingCar(String name) {
        this.name = name;
        this.numberOfAdvances = 0;
    }

    public void moveCar() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        if(randomNumber > 3) {
            this.numberOfAdvances += 1;
        }
    }

    public int getNumber() {
        return this.numberOfAdvances;
    }
}
