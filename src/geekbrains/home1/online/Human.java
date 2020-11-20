package geekbrains.home1.online;

public class Human {
    private String name;
    int maxRun;
    int maxJump;
    Treadmill treadmill = new Treadmill();
    Wall wall = new Wall();
    public Human(String name, int maxJump, int maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }void run(){
        System.out.println(name + " побежал(а)");
    }void jump(){
        System.out.println(name + " прыгнул(а)");
    }void runTreadmill(int dist){
        if(dist < this.maxRun) {
            System.out.println(this.name + " побежал(а)");
        }else {System.out.println(this.name + " не добежал(а)");
        }
    }
    void jumpWall(int height){
        if(height < this.maxJump) {
            System.out.println(this.name + " подпрыгнул(а)");
        }else{System.out.println(this.name + "Не допрыгнул(а)");
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
