package homeWork1.obstacles;

import homeWork1.Competitive;
import homeWork1.Obstacle;

import java.util.Objects;

public class Treadmill implements Obstacle {
    final private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Competitive competitor) {
        Objects.requireNonNull(competitor,"Competitor can't be null " );
        boolean result = false;

        if (competitor.run() >= this.distance){
            result = true;
            System.out.println(competitor.info() + " успешно пробежал");
        } else {
            System.out.println(competitor.info() + " не смог пробежать");
        }

        return result;
    }
}
