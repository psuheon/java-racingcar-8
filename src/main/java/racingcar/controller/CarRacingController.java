package racingcar.controller;

import racingcar.model.CarRacing;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;

public class CarRacingController {
    private final CarRacing carRacing = new CarRacing();
    public void start() {
        String nameInput = InputView.getName();
        List<String> nameList = Arrays.asList(nameInput.split(","));
        carRacing.createCarList(nameList);
        carRacing.setNumberOfAttempts(Integer.parseInt(InputView.getNumber()));

        for(int i = 0; i < carRacing.getNumber(); i++) {
            carRacing.startRacing();
        }
    }
}
