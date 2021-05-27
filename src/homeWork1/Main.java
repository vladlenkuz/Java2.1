package homeWork1;

import homeWork1.competitors.Cat;
import homeWork1.competitors.Human;
import homeWork1.competitors.Robot;
import homeWork1.obstacles.Treadmill;
import homeWork1.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team ("Непобедимые",
                new Cat("Barsic", 200,30),
                new Robot("Chappy", 100, 100),
                new Human("Bob", 2, 10)
        );
        Team team2 = new Team ("Безнадежные",
                new Cat("Kuzya", 20,3),
                new Robot("Robert", 228, 1),
                new Human("Stiv", 2, 2)
        );

        Course course = new Course(new Wall(5), new Treadmill(5));
        team1.printTeamInfo();
        team2.printTeamInfo();

        course.start(team1);
        course.start(team2);

        team1.printFinished();
        team2.printFinished();
    }
}
