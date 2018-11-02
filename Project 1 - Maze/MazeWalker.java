
/**
 * This is my MazeWalker class having been refined up to Activity 6.
 * 
 * @Veronica Pratt
 * @830
 */
public class MazeWalker
{
    public static void run(){
        Maze maze = new Maze(2);
        MazeWalker tortuga = new MazeWalker();
        tortuga.walkMaze(maze, maze.getMazeBot());
    }

    public void walkMaze(Maze maze, MazeBot mazeBot)
    {
        while(mazeBot.didNotReachGoal()){
            for( int i=4; i>0; i-=1){
                mazeBot.turnLeft();
                if(mazeBot.canMoveForward()){
                    mazeBot.moveForward();
                    if(mazeBot.getBreadCrumbObject() == "0"){
                        mazeBot.turnLeft();
                        mazeBot.turnLeft();
                        mazeBot.moveForward();
                    }else{
                        i=0;
                        mazeBot.setBreadCrumbObject("0");
                    }
                }else{
                    mazeBot.turnLeft();
                    mazeBot.turnLeft();
                }
            }
            for(int w=4; w>0; w -=1){
                mazeBot.turnLeft();
            if(mazeBot.canMoveForward()){
                    w=0;
                    mazeBot.moveForward();
                    mazeBot.setBreadCrumbObject("5");
                    }else{
                     mazeBot.turnLeft();
                    mazeBot.turnLeft();
                    }
        }
    }
    mazeBot.signalSuccess();
    System.out.println("You did it!");

}
}