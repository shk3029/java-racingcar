package step5.view;

import step5.domain.Car;
import step5.domain.Driver;
import step5.domain.checkor.ScoreCheckor;

import java.util.ArrayList;
import java.util.List;

import static step5.view.ViewManager.*;


public class View {

    public static void main(String[] args) {
        List<Driver> drivers = new ArrayList<>();
        String cars = inputMessageAboutCars();

        for (String carName : cars.split(",")) {
            drivers.add(new Driver(new Car(carName)));
        }

        int numOfTry = inputMessageAboutTry();

        outputMessageAboutMove(drivers, numOfTry);

        int winnerScore = new ScoreCheckor().check(drivers);
        outputMessageAboutWinner(drivers, winnerScore);
    }
}
