
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        checkforDoor();
        checkforDoor();
        checkforDoor2();
    }
    public void findWall() {
        while (frontIsClear()) {
            move();
        }
    }
    public void checkforDoor() {
        turnLeft();
        move();
        turnRight();
    }
    public void checkforDoor2() {
        turnLeft();
        turnLeft();
        move();
        turnRight(); 
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

