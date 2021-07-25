import java.util.*;
public class threeindices
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the number of test cases");
    int t=sc.nextInt();//test-cases
    while(t-- != 0)
    {
        // System.out.println("enter the array size");
        int n=sc.nextInt(); // array size
        int arr[]=new int[n]; //array
        int hashArr[] = new int[1000]; // initialised by 0 by default. HASH TABLE
        // System.out.println("enter the array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
            hashArr[arr[i]] = i+1;
        }
          int c=0;

        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                int sum = arr[i] + arr[j];
                if(hashArr[sum] > 0)
                {
                    System.out.println( (i+1) + "," + (j+1) + "," + (hashArr[sum]));
                    c = 1;
                }
            }
            // if(c==1)
            // break;
        }
        if(c == 0)
        System.out.println("No sequence found");
    }
    sc.close();
}
}

