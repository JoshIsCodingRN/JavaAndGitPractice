import java.util.Scanner;

/**
 * class for choosing food and side
 * 
 * @author Josh Howard
 */
public class FoodChoice implements ItemInfo
{
    //fields
    private Scanner scanner = new Scanner(System.in);
    private int entree = 0;
    private int side = 0;


    /**
     * main method for testing.
     * @param args string arguments
     */
    public static void main(String[] args)
    {
        // FoodChoice object = new FoodChoice();

        // object.promptEntreeChoice();
        // object.scanEntree();

        // object.promptSideChoice();
        // object.scanSide();
    }

    /**
     * prompts user for entree choice and gives options
     */
    public void promptEntreeChoice()
    {
        System.out.println("What food would you like?");
        System.out.println("1. burga\n2. hotdawg\n3. chicken sammy");
    }

    /**
     * prompts user for side choice and gets options
     */
    public void promptSideChoice()
    {
        System.out.println("What side would you like?");
        System.out.println("1. fries\n2. maccy cheese\n3. onion ring");
    }

    /**
     * scans for user entree input
     * @return entree choice
     */
    public int scanEntree()
    {
        while (this.entree == 0 
        && this.entree != 1
        && this.entree != 2
        && this.entree != 3)
        {
          this.entree = scanner.nextInt();
        }

        return entree;
    }

    /**
     * scans for user side input
     * @return side choice
     */
    public int scanSide()
    {
        while (this.side == 0 
        && this.side != 1
        && this.side != 2
        && this.side != 3)
        {
           side  = scanner.nextInt();
        }

        return side;
    }

    /**
     * interface method for displaying calories of entree
     */
    @Override
    public void calories() 
    {
      if (entree == 0)
      {
        System.out.println("no entree chosen");
      } 
      else if(entree == 1)
      {
        System.out.println("20 cals");
      }
      else if(entree == 2)
      {
        System.out.println("30 cals");
      }
      else if(entree == 3)
      {
        System.out.println("40 cals");
      }
    }
}