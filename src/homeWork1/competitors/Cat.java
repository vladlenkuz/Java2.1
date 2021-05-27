package homeWork1.competitors;

import homeWork1.Competitive;

public class Cat implements Competitive {
    private final String name;
    private final int maxHeight;
    private final int maxRun;
    private boolean finished;

    public Cat(String name, int maxHeight, int maxRun) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRun = maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxJump() {
        return maxHeight;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    @Override
    public void succesOvercame() {
        finished = true;
        System.out.println(info() + " Мяу победил!!");
    }

}
