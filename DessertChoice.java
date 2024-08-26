import java.util.Scanner;

/**
 * class that gives you choices for dessert and 
 * what utinsil you would like to use
 * 
 * @author Josh Howard
 */
public class DessertChoice implements ItemInfo
{
    //fields
    private Scanner scanner = new Scanner(System.in);
    private int dessert = 0;
    private int utinsil = 0;


    /**
     * main method for testing
     * @param args
     */
    public static void main(String[] args)
    {
        /*     
         DessertChoice object = new DessertChoice();

        object.promptDessertChoice();
        object.scanDessert();

        object.promptUtinsilChoice();
        object.scanUtinsil();
         */
    }

    /**
     * asks what dessert and lists options
     */
    public void promptDessertChoice()
    {
        System.out.println("What dessert would you like?");
        System.out.println("1. cake\n2. ice cream\n3. brownie");
    }

    /**
     * asks what utinsil and gives options
     */
    public void promptUtinsilChoice()
    {
        System.out.println("What utensil would you like?");
        System.out.println("1. spoon\n2. fork\n3. spork");
    }

    /**
     * scans for dessert option
     * @return dessert option
     */
    public int scanDessert()
    {
        while (this.dessert == 0 
        && this.dessert != 1
        && this.dessert != 2
        && this.dessert != 3)
        {
            dessert = scanner.nextInt();
        }

        return dessert;
    }

    /**
     * scans for utinsil option
     * @return utinsil option
     */
    public int scanUtinsil()
    {
        while (this.utinsil == 0 
                && this.utinsil != 1
                && this.utinsil != 2
                && this.utinsil != 3)
        {
            utinsil  = scanner.nextInt();
        }

        return utinsil;
    }

    /**
     * getter
     * @return dessert option
     */
    public int getDessert()
    {
        return dessert;
    }

    /**
     * getter
     * @return utinsil option
     */
    public int getUtinsil()
    {
        return utinsil;
    }

    /**
     * method used to display calories of dessert choice 
     * utilizing a switch.
     */
    @Override
    public void calories() {
        switch (dessert) {
            case 1:
                System.out.println("15 cals"); 
                break;
        
            case 2:
                System.out.println("20 cals");
                break;
                        
            case 3:
                System.out.println("25 cals");
                break;
                    
            default:
                System.out.println("no dessert selected");
                break;
        }
    }


}