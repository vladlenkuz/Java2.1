package homeWork1.obstacles;

import homeWork1.Competitive;
import homeWork1.Obstacle;

import java.util.Objects;

public class Wall implements Obstacle {
    final private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Competitive competitor) {
        Objects.requireNonNull(competitor,"Competitor can't be null " );
        boolean result = false;

        if (competitor.jump() >= this.height){
            result = true;
            System.out.println(competitor.info() + " успешно перепрыгнул");
        } else {
            System.out.println(competitor.info() + " не смог перепрыгнуть");
        }

        return result;
    }
}
