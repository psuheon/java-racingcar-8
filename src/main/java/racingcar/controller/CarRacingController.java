package racingcar.controller;

import racingcar.model.CarRacing;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class CarRacingController {
    private final CarRacing carRacing = new CarRacing();

    public void start() {
        String nameInput = InputView.getName();
        List<String> nameList = Arrays.asList(nameInput.split(","));
        carRacing.createCarList(nameList);
        carRacing.setNumberOfAttempts(InputView.getNumber());

        System.out.println("실행 결과");
        for (int i = 0; i < carRacing.getNumberOfAttempts(); i++) {
            carRacing.startRacing();

            if (i != 0) {
                System.out.println();
            }
            OutputView.printRacingStatus(carRacing.getCarList());
        }
        OutputView.printWinner(carRacing.judgeWinner());
    }
}
