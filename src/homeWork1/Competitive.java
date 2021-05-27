package homeWork1;

public interface Competitive {
    default int  run(){
        System.out.println(info() + " бежит");
        return getMaxRun();
    }
    default int jump(){
        System.out.println(info() + " прыгает");
        return getMaxJump();
    }

    default String info(){
        return getClass().getSimpleName() + " " + getName();
    }
    String getName();
    int getMaxJump();
    int getMaxRun();

    boolean isFinished();

    void succesOvercame();
}
