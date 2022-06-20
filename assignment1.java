class hi
{
 public static void main(String args[])
    {
        for (int i=1; i<=10;i++)
        {
          for(int j =1; j<=10;j++)
          {
            if((i == 1 && j!=4) || j == 2 ||j == 5 || (i == 10 && j >= 6) || ( i == 5 && j >=6))
              System.out.print("* ");
            else 
             System.out.print("  ");
          }
          System.out.println();
        }
        System.out.println("TELUSKO");
        System.out.println("INEURON");           
    } 

}

