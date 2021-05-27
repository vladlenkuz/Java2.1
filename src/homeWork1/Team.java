package homeWork1;

import homeWork1.competitors.Cat;
import homeWork1.competitors.Human;
import homeWork1.competitors.Robot;
import homeWork1.obstacles.Treadmill;
import homeWork1.obstacles.Wall;

public class Team {

    private final String name;
    private final Competitive[] competitors;

    public Team(String name, Competitive... competitors) {
        this.name = name;
        this.competitors = competitors;
    }


    public void printTeamInfo() {
        System.out.println("*******************************");
        System.out.println("Участники каоманды " + name + ":");
        for (Competitive competitor : competitors) {
            System.out.println(competitor.info());
        }
        System.out.println("*******************************");
    }

    public void printFinished() {
        System.out.println("*******************************");
        System.out.println("Пришли к финишу участники команды " + name + ":");
        for (Competitive competitor : competitors) {
            if (competitor.isFinished()) {
                System.out.println(competitor.info());
            }
            System.out.println("*******************************");
        }
    }

    public void overcome(Course course) {
            for (Competitive competitor: competitors){
                for (int i = 0; i < course.getObstacles().length; i++){
                final  Obstacle obstacle = course.getObstacles()[i];
                if(!obstacle.overcome(competitor)){
                break;
                }
                if (i == course.getObstacles().length - 1){
                    competitor.succesOvercame();
                }
                }
            }
    }
}
