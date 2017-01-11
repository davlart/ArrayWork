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

    public static void math1 (){
        int a = Integer.parseInt(sc.nextLine()),
                b = Integer.parseInt(sc.nextLine()),
                c = Integer.parseInt(sc.nextLine()),
                d = Integer.parseInt(sc.nextLine()), m,n,m1,n1;
        m=a*d+c*b; n=d*b; m1=m; n1=n;
        while(m1!=n1){
            if(m1>n1) m1 -=n1;
            else n1 -=m1;
        }
        m=m/m1; n=n/m1;
        System.out.format("%d %d",m,n);
    }

    public static void math2 (){
        int n=Integer.parseInt(sc.nextLine()),m=Integer.parseInt(sc.nextLine());
        while(true){
            if (m==0) {System.out.println(n); break;}
            if (n==0) {System.out.println(m); break;}
            if(n>m) n %=m;
            else m %=n;
        }
    }

    public static void math3 (){
        int n=Integer.parseInt(sc.nextLine());
        int i=2, k=4;
        while(k<=n)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
            k = k + 2*i + 1;
            i++;
        }
        if(n>1) System.out.print(n);
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
       // math1();
        //math2();
        math3();
    }

}
