package racingcar.controller;

import racingcar.model.CarRacing;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;

public class CarRacingController {
    private CarRacing carRacing = new CarRacing();
    public void start() {
        String nameInput = InputView.getName();
        List<String> nameList = Arrays.asList(nameInput.split(","));
        carRacing.createCarList(nameList);
    }
}
