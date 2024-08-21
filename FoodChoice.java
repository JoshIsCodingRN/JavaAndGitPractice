import java.util.Scanner;

public class FoodChoice
{
    private Scanner scanner = new Scanner(System.in);
    private int entree = 0;
    private int side;


    public static void main(String[] args)
    {
        FoodChoice object = new FoodChoice();

        object.promptEntreeChoice();
        object.scanEntree();

        object.promptSideChoice();
        object.scanSide();
    }

    public void promptEntreeChoice()
    {
        System.out.println("What food would you like?");
        System.out.println("1. burga\n2.hotdawg\n3.chicken sammy");
    }

    public void promptSideChoice()
    {
        System.out.println("What side would you like?");
        System.out.println("1. fries\n2. maccy cheese\n3. onion ring");
    }

    public int scanEntree()
    {
        while (entree < 3 || entree > 3)
        {
           entree = scanner.nextInt();
        }

        return entree;
    }

    public int scanSide()
    {
        while (side < 3 || side > 3)
        {
           side  = scanner.nextInt();
        }

        return side;
    }
}