
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
            collectBeepers();
}
   
public void collectBeepers() {
        faceEast();
        findABeeperCollumn();
        collectCollumnInital();
        collectCollumn();
        returnToSouth();
        returntoLine();
        faceEast();
        findABeeperCollumn();
        collectCollumnInital();
        collectCollumn();
        returnToSouth();
        returntoLine();
        faceEast();
        findABeeperCollumn();
        collectCollumnInital();
        collectCollumn();
        returnToSouth();
        returntoLine();
        faceEast();
        findABeeperCollumn();
        collectCollumnInital();
        collectCollumn();
        returnToSouth();
        returntoLine();
        faceEast();
        findABeeperCollumn();
        collectCollumnInital();
        collectCollumn();
        returnToSouth();
        returntoLine();
        
}
public void faceEast() {
    while(!facingEast())
        turnLeft();
    }
public void findABeeperCollumn() {
    while (frontIsClear() && !nextToABeeper()) { 
        move();
}
}
public void collectCollumnInital() {
    while (!facingNorth() && nextToABeeper()) { 
        turnLeft();
        
    }
}
public void collectCollumn() {
    while (frontIsClear() && nextToABeeper()) {
        pickBeeper();
        move();
    }
}
public void returnToSouth() {
    while (frontIsClear() && !nextToABeeper() && !facingSouth()) {
        turnLeft();
    }
}
public void returntoLine() {
    while (frontIsClear() && facingSouth()) {
        move();
    }
}
}
