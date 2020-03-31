
// Java Program to check Even or Odd number

import java.util.Scanner; // program uses class Scanner

class CheckEvenOdd
{
  // main method begins execution of Java application
  public static void main(String args[])
  {
    //int num;
    int i=0;
    int j=0;  //100
    int k=0;
    
    //System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    //Scanner input = new Scanner(System.in);
    //num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    for(j=2;j<=100;j++){
      for(i=1;i<=j;i++){
        if(j%i==0) k++;
      }
      if(k<=2) Sysytem.out.println(j);
    }
  }
}
