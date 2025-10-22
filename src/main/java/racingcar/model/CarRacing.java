package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    List<RacingCar> carList = new ArrayList<>();
    int numberOfAttempts;

    public CarRacing() {
        numberOfAttempts = 0;
    }

    public void createCarList(List<String> nameList) {
        for(String str : nameList) {
            RacingCar newRC = new RacingCar(str);
            carList.add(newRC);
        }
    }

    public void setNumberOfAttempts(int number) {
        this.numberOfAttempts = number;
    }

    public int getNumber(){
        return numberOfAttempts;
    }

    public void startRacing() {
        for(RacingCar rc : carList) {
            rc.moveCar();
        }
    }
}
