
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        //Our Farmer who is planting the seeds will be called lightning.
        Robot lightning = new Robot(kw, 1, 1, Direction.EAST, 20);

        for (int rows = 8; rows > 0; rows = rows - 1) {
            //rows means how many times this loops, there are four rows so lightning
            //repeats this process four times.


            for (int columns = 5; columns > 0; columns = columns - 1) {
                if (!lightning.canPickThing() && lightning.getAvenue() != 6 && lightning.getStreet() != 5) {
                    lightning.putThing();
                }
                //If lightining hasn't planted a seed in on the spot she is standing on, then
                //lightning will plant the seed
                lightning.move();

                if (lightning.getAvenue() == 6) {
                    lightning.turnLeft();
                    lightning.turnLeft();
                } //If lightning is at the right side of the field she turns around
                //to go for another row.
                else if (lightning.getAvenue() == 1 && lightning.getStreet() != 5) {
                    lightning.turnLeft();
                    lightning.move();
                    lightning.turnLeft();
                    //If lightning is on the left side of the field, she goes down to do
                    //another row.

                }
            }
        }
    }
}
