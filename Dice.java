import java.util.Random;

public class Dice
{
  int noOfSides;
  public Dice(int side)
  {
    System.out.println("Dice Initialised with " + side + " sides\n");
    if(side < 2) // For Invalid Number of Sides.
    {


        throw new java.lang.Error("Invalid Number of Sides");
    }
    else
      this.noOfSides = side;

    }


  public void Dice_Info()
  {
    System.out.println("Sides of Dice = " + this.noOfSides);
  }

  public void RollDice()
  {
    Random rand_obj = new Random();
    int rand_num = rand_obj.nextInt(this.noOfSides) + 1;
    if(this.noOfSides == 2)
    {
      if(rand_num == 1)
        System.out.println("Heads Up");
      else
        System.out.println("Tails Up");
    }
    else
    System.out.println("Obtained Number is " + rand_num);
  }
}
