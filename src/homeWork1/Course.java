package homeWork1;

public class Course {
    private  final Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }
    public void start(Team team){
        team.overcome(this);
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }
}
