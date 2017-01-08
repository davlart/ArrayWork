import java.util.Scanner;

/**
 * Created by ArthurArt on 08.01.2017.
 */
public class WorkArray {
    public static   Scanner sc = new Scanner(System.in);

   public static void  fillingArray(int[] myArray)
    {
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = sc.nextInt();
    }



public static void t1(int[] myArray)
{
    for (int i = 0; i < myArray.length; i+=2)
        System.out.print(myArray[i]+" ");

}
    public static void t2(int[] myArray)
    {
        for (int i = 0; i < myArray.length; i++)
            if(myArray[i]%2==0)  System.out.print(myArray[i]+" ");

    }
    public static void t3(int[] myArray)
    {
        int sumOfPositiveElementsInArray = 0;
        for (int i = 0; i < myArray.length; i++)
            if(myArray[i]>0)  sumOfPositiveElementsInArray++;
        System.out.print(sumOfPositiveElementsInArray);
    }
    public static void t4(int[] myArray)
    {     int sum  =0;
        for (int i = 1; i < myArray.length; i++)
            if(myArray[i]>myArray[i-1])  sum++;
        System.out.print(sum);

    }
    public static void t5(int[] myArray)
    {
        boolean bufSerchElementsameSigns = false;

        for (int i = 0; i < myArray.length-1; i++)
            if(myArray[i]*myArray[i+1]>0) {bufSerchElementsameSigns = true; break;}
        System.out.print(bufSerchElementsameSigns);

    }

    public static void t6(int[] myArray)
    {   int sum = 0;
        for (int i = 1; i < myArray.length-1; i++)
            if((myArray[i]>myArray[i-1])&& (myArray[i]>myArray[i+1]))sum++;
                System.out.print( sum);
    }

    public static void main(String[] args) {

        int LenghtArray = sc.nextInt();
        int [] myArray = new int[LenghtArray];
        fillingArray(myArray);

        //t1(myArray);
        //t2(myArray);
        //t3(myArray);
        //t4(myArray);
        //t5(myArray);
        //t6(myArray);
    }

}
