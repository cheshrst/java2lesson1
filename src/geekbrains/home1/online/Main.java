package geekbrains.home1.online;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat("Кот", 1,1 );
	Human human = new Human("Человек",1,1);
	Robot robot = new Robot("Робот",1,1);
	Treadmill treadmill = new Treadmill();
	Wall wall = new Wall();
	//String Team[] = {cat, human, robot};
	cat.run();
    human.run();
    robot.run();
    cat.jump();
    human.jump();
    robot.jumpWall();
    cat.runTreadmill();
    human.runTreadmill();
    robot.runTreadmill();
    cat.jumpWall();
    human.jumpWall();
    robot.jumpWall();
    }
}
