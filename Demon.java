
/**
 * Write a description of class Demon here.
 *
 * @author Colin Jones
 * @version v 1.0
 */
public abstract class Demon extends Creature
{
   
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Demon (){
        super();
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Demon (int str, int hp) {
       super(str, hp);
    }
        
    /**
     * The attack method and applies 50 additional chance of getting a bonus attack damage of 2 times towards another creatur.
     * Allows a demon to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int demonAttack(){
        int damage = super.attack();
        int bonus = Randomizer.nextInt(20);
            if(bonus == 1){
                damage += 50; //double the bonus
            }
        return damage;
    }
}
