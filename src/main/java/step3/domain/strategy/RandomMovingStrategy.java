package step3.domain.strategy;

import step3.domain.RandomGenerator;

public class RandomMovingStrategy implements MovingStrategy {

    private final int ADVANCE_MIN_NUMBER = 4;
    private final RandomGenerator randomGenerator;


    public RandomMovingStrategy(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    @Override
    public boolean isMove() {
        return randomGenerator.generate() >= ADVANCE_MIN_NUMBER;
    }

}
