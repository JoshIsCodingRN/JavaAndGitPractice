public class demo 
{
    public static void main(String[] args)
    {
        FoodChoice foodChoice = new FoodChoice();
        DessertChoice dessertChoice = new DessertChoice();

        //prompt and scan food and sides
        foodChoice.promptEntreeChoice();
        foodChoice.scanEntree();
        foodChoice.promptSideChoice();
        foodChoice.scanSide();

        //prompt and scan dessert and utinsil
        dessertChoice.promptDessertChoice();
        dessertChoice.scanDessert();
        dessertChoice.promptUtinsilChoice();
        dessertChoice.scanUtinsil();

        //space
        System.out.println("\n\n");

        //use polymporphic variables to display choice info
        foodChoice.calories();
        dessertChoice.calories();
    }
}
