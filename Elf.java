
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 8;

    /**
     * Constructor for objects of class ELF -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for an ELF and the human class is responsible for
     * return an ELF object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }

    /**
     * Overides the attack method and applies a 10% chance of getting a bonus attack damage of 2 times towards another creatur.
     * Allows an elf to determine how much damage it is causing in this round of battle.
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        // Determine if 2x bonus is to be applied.
        int damage = super.attack();
        int bonus = Randomizer.nextInt(10);
            if(bonus == 1){
                damage *= 2; //double the bonus
            }
        
        return damage;
    }
}
