
/**
 * Write a description of class CyborDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyborDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CyborDemon_HP = 100;
    private static final int MIN_CyborDemon_HP = 25;
    private static final int MAX_CyborDemon_STR = 40;
    private static final int MIN_CyborDemon_STR = 20;

    /**
     * Constructor for objects of class CyborDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of CyborDemon minimum and maximum values
     * 
     * The instantiating class asks for a CyborDemon and the CyborDemon class is responsible for
     * return a CyborDemon object with values in the appropriate range
     * 
     */
    public CyborDemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_CyborDemon_HP-MIN_CyborDemon_HP)+MIN_CyborDemon_HP,    
            Randomizer.nextInt(MAX_CyborDemon_STR-MIN_CyborDemon_STR)+MIN_CyborDemon_STR
        );
          
    }

}
