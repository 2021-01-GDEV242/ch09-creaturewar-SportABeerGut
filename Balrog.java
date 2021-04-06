
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables 
    private static final int MAX_Balrog_HP = 200;
    private static final int MIN_Balrog_HP = 80;
    private static final int MAX_Balrog_STR = 100;
    private static final int MIN_Balrog_STR = 50;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of Balrog minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the Balrog class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_Balrog_HP-MIN_Balrog_HP)+MIN_Balrog_HP,    
            Randomizer.nextInt(MAX_Balrog_STR-MIN_Balrog_STR)+MIN_Balrog_STR
        );
          
    }
    
    /**
     * The balrog is so fast it attacks twice
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        // return a random number that the creature uses to attack.
        int damage = 0;
        int damage1 = demonAttack();
        int damage2 = demonAttack();
        
        damage = damage1 + damage2;  
        
        return damage;
    }
}
