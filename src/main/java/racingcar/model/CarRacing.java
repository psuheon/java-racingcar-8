package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    List<RacingCar> carList = new ArrayList<>();
    int numberOfAttempts;

    public void createCarList(List<String> nameList) {
        for(String str : nameList) {
            RacingCar newRC = new RacingCar(str);
            carList.add(newRC);
        }
    }
}
