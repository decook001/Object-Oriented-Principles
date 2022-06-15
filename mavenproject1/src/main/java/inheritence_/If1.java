package inheritence_;

public interface If1 {
    public void run();
    void exe();
}

class Ball implements If1
{

    @Override
    public void run() {
        System.out.println("Its running");
    }

    @Override
    public void exe() {
        System.out.println("Its executing");
    }
}

abstract class Bat implements If1
{
    @Override
    public void run() {
        System.out.println("Its only running");
    }
}
