import java.util.ArrayList;
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;
    int nGoodHumans;
    int nElfs;
    int nEvilHumans;
    int nCyborDemons;
    int nBalrogs;

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        goodArmy = new ArrayList<>();
        evilArmy = new ArrayList<>();
    
        nGoodHumans = 0;
        nElfs = 0;
        nEvilHumans = 0;
        nCyborDemons = 0;
        nBalrogs = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setupGoodArmy()
    {
       //populate good army with 100 random humans and elves.
       for (int i = 0; i < 100; i++){
           if (Randomizer.nextInt(10) < 7){
               // add a human
               goodArmy.add(new Human());
               nGoodHumans++;
            }
           else{
               // add elf
               goodArmy.add(new Elf());
               nElfs++;
            }
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setupBadArmy()
    {
       //populate bad army with 30-50 random humans and elves.
       int rnd = 0; 
       for (int i = 0; i < (29 + Randomizer.nextInt(21)); i++){
           rnd = Randomizer.nextInt(25);
           if (rnd < 19){
               // add a human
               evilArmy.add(new Human());
               nEvilHumans++;
            }
           else if (rnd < 25){
               evilArmy.add(new CyborDemon());
               nCyborDemons++;
            }
           else{
               // add elf
               evilArmy.add(new Balrog());
               nBalrogs++;
            }
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startBattle()
    {
       //populate bad army with 30-50 random humans and elves.
       System.out.print("Good army has " + nGoodHumans + " Humans and " + nElfs + " Elves ");
       System.out.print("Evil army has " + nEvilHumans + " Humans and " + nCyborDemons + " CyborDemons and " + nBalrogs + " Balrogs ");
       
       while (!goodArmy.isEmpty() && !evilArmy.isEmpty()){
           skirmish(goodArmy.get(0), evilArmy.get(0));
           
           // Remove good army creature if they are not alive
           if (!goodArmy.get(0).isAlive()){
               goodArmy.remove(0);
            }
            
           // remove evile army creature if they are not alive
           if (!evilArmy.get(0).isAlive()){
               evilArmy.remove(0);
            }
        }
       
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void skirmish(Creature creatureOne, Creature creatureTwo)
    {
       //populate bad army with 30-50 random humans and elves.
       while (creatureOne.isAlive() && creatureTwo.isAlive()){
           //inflict damage from creature one on creature two and vise versa
           creatureOne.takeDamage(creatureTwo.attack());
           creatureTwo.takeDamage(creatureOne.attack());
        }
       
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void reportResults()
    {
       if (goodArmy.isEmpty() && evilArmy.isEmpty()){
           System.out.println("No winner! Both armies were depleated. ");
        }
       
       if (goodArmy.isEmpty()) {
           System.out.println("The winner is the evil army. ");
        }
       
       if (evilArmy.isEmpty()){
           System.out.println("The winner is the good army. ");
        }
    }
    
}
