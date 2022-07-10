import java.util.*;
class pythogoreantriplet
{
    public static void main(String args[])
    {
        int sum;
        System.out.println("Enter the sum");
        Scanner sc=new Scanner(System.in);
        sum=sc.nextInt();
        int p=0;
        for(int i=1;i<=sum/3;i++)
        {
            for(int j=1;j<=sum/2;j++)
            {
                int k=sum-i-j;
                if(k*k==(i*i+j*j))
                {
                    p=1;
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
        if(p==0)
        System.out.println("Sorry No pythogorean Triplet found in this range");
        


    }

}