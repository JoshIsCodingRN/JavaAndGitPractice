import java.util.Scanner;

public class DessertChoice
{
    private Scanner scanner = new Scanner(System.in);
    private int dessert = 0;
    private int utensil = 0;
    private int utinsil;


    public static void main(String[] args)
    {
        DessertChoice object = new DessertChoice();

        object.promptDessertChoice();
        object.scanDessert();

        object.promptUtinsilChoice();
        object.scanUtinsil();
    }

    public void promptDessertChoice()
    {
        System.out.println("What dessert would you like?");
        System.out.println("1. cake\n2. ice cream\n3.brownie");
    }

    public void promptUtinsilChoice()
    {
        System.out.println("What utensil would you like?");
        System.out.println("1. spoon\n2. fork\n3. spork");
    }

    public int scanDessert()
    {
        while (dessert < 3 || dessert > 3)
        {
            dessert = scanner.nextInt();
        }

        return dessert;
    }

    public int scanUtinsil()
    {
        while (utensil < 3 || utensil > 3)
        {
            utensil  = scanner.nextInt();
        }

        return utensil;
    }

    public int getDessert()
    {
        return dessert;
    }

    public int getUtinsil()
    {
        return utinsil;
    }


}