
public class Kotik {
    private int degreeSatietyCat;
    private int count;

    public void setCount(int count) {
        this.count = count;
        count++;
    }

    boolean play() {
        if (degreeSatietyCat <= 0) {
            System.out.println("не удалось выполнить play, хочу есть");
            return false;
        }
        degreeSatietyCat--;
        System.out.println("играю");
        return true;
    }

    private boolean useEnergy() {
        return false;
    }

    public boolean sleep() {
        if (degreeSatietyCat <= 0) {
            System.out.println("не удалось выполнить sleep, хочу есть");
            return false;
        }
        degreeSatietyCat--;
        System.out.println("сплю");
        return true;
    }

    public boolean chaseMouse() {
        if (degreeSatietyCat <= 0) {
            System.out.println("не удалось выполнить chaseMouse, хочу есть");
            return false;
        }
        degreeSatietyCat--;
        System.out.println("ловлю мышь");
        return true;
    }

    public boolean eat() {
        return false;
    }

    public boolean cleaningTheAssOnTheFloor() {
        if (degreeSatietyCat <= 0) {
            System.out.println("не удалось выполнить cleaningTheAssOnTheFloor, хочу есть");
            return false;
        }
        degreeSatietyCat--;
        System.out.println("чищу об пол одно место");
        return true;
    }

    public boolean run() {
        if (degreeSatietyCat <= 0) {
            System.out.println("не удалось выполнить run, хочу есть");
            return false;
        }
        degreeSatietyCat--;
        System.out.println("бегаю");
        return true;
    }
    public void liveAnotherDay(int randomNum) {
        for (int i = 0; i < 24; i++);
        switch (randomNum) {
            case (1):
                this.run();
                break;
            case (2):
                this.play();
                break;
            case (3):
                this.chaseMouse();
                break;
            case (4):
                this.cleaningTheAssOnTheFloor();
                break;
            case (5):
                this.sleep();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + 1);
        }


    }}




//        System.out.println("кот голоден");




