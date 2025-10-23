package racingcar.view;

import racingcar.model.RacingCar;

import java.util.List;

public class OutputView {

    public static void printRacingStatus(List<RacingCar> carList) {
        for (RacingCar rc : carList) {
            System.out.print(rc.getName() + " : ");
            printBar(rc.getNumberOfAdvances());
        }
    }

    public static void printBar(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printWinner(List<String> winnerList) {
        String result = String.join(", ", winnerList);
        System.out.println("\n최종 우승자 : " + result);

    }
}
