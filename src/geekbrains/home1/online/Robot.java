package geekbrains.home1.online;

public class Robot {
    private String name;
    int maxRun;
    int maxJump;
    int distant;
    Treadmill treadmill = new Treadmill();
    Wall wall = new Wall();
    public static void setDistant(int distant) {
        Wall.distant = distant;
    }
    public Robot(String name, int maxJump, int maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }void run(){
        System.out.println(name + " побежал(а)");
    }
    void jump(){
        System.out.println(name + " прыгнул(а)");
    }void runTreadmill(int dist){
        if(dist < this.maxRun) {
            System.out.println(this.name + " побежал(а)");
        }else {System.out.println(this.name + " не добежал(а)");
        }
    }

    void runTreadmill(){
        if(treadmill.distant < this.maxRun) {
            System.out.println(this.name + " побежал(а)");
        }else {System.out.println(this.name + " не добежал(а)");
        }
    }void jumpWall(){
        if(wall.distant < this.maxRun) {
            System.out.println(this.name + " допрыгнул(а)");
        }else {System.out.println(this.name + " не допрыгнул(а)");
        }
    }
    }
