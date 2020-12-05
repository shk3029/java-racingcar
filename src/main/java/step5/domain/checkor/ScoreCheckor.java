package step5.domain.checkor;


import step5.domain.Driver;

import java.util.List;

public class ScoreCheckor implements Checkor<Integer, List<Driver>> {

    @Override
    public Integer check(List<Driver> drivers) {
        return drivers.stream()
                .map(driver -> driver.getDistanceSize())
                .max(Integer::compareTo).get();
    }
}
