package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

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
        return this.numberOfAttempts;
    }

    public List<RacingCar> getCarList() {
        return this.carList;
    }

    public void startRacing() {
        for(RacingCar rc : carList) {
            rc.moveCar();
        }
    }

    public List<String> judgeWinner() {
        OptionalInt maxAdvanceOpt = carList.stream()
                                           .mapToInt(RacingCar::getNumber)
                                           .max();

        int maxAdvance = maxAdvanceOpt.getAsInt();
        List<String> winner = carList.stream()
                                        .filter(carList->carList.getNumber() == maxAdvance)
                                        .map(RacingCar::getName)
                                        .collect(Collectors.toList());

        return winner;
    }
}
