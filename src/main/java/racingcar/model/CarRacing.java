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
        for (String str : nameList) {
            if (str.length() > 5 || str == "") {
                throw new IllegalArgumentException("Wrong input");
            }

            RacingCar newRC = new RacingCar(str);
            carList.add(newRC);
        }
    }

    public void setNumberOfAttempts(String numberInput) {
        int number;

        try {
            number = Integer.parseInt(numberInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Wrong input");
        }

        if (number < 0) {
            throw new IllegalArgumentException("Wrong input");
        }

        this.numberOfAttempts = number;
    }

    public int getNumberOfAttempts() {
        return this.numberOfAttempts;
    }

    public List<RacingCar> getCarList() {
        return this.carList;
    }

    public void startRacing() {
        for (RacingCar rc : carList) {
            rc.moveCar();
        }
    }

    public List<String> judgeWinner() {
        OptionalInt maxAdvanceOpt = carList.stream()
                .mapToInt(RacingCar::getNumberOfAdvances)
                .max();

        int maxAdvance = maxAdvanceOpt.getAsInt();
        List<String> winner = carList.stream()
                .filter(carList -> carList.getNumberOfAdvances() == maxAdvance)
                .map(RacingCar::getName)
                .collect(Collectors.toList());

        return winner;
    }
}
