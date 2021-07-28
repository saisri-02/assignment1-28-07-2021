import java.util.*;
class Twinprimes
{
    static int N=2000005;
    public static int prime[]=new int[N];
    public static void sieve()
    {
        for(int i=0;i<N;i++)
        {
            prime[i]=1;
        }
        prime[0]=0;
        prime[1]=0;
        for(int x=2;x*x<N;x++)
        {
            if(prime[x]==1)
            {
                for(int i=x*x;i<N;i+=x)
                {
                    prime[i]=0;
                }
            }
        }
    }
    public static void main(String args[]) 
    {
        int m,n,count=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        sieve();
       for(int i=m;i<=n;i++)
       {
          if(prime[i]==1 && prime[i+2]==1)
          {
              count++;
          }
       }
       System.out.println(count);
    }
}

output:

3 13
3
