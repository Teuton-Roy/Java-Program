//{ Driver Code Starts
//Initial Template for Java

//import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            CountEvenLength ob = new  CountEvenLength();
            int ans = ob.compute_value(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class CountEvenLength
{
    long m = (long) (1e9+7);
    public long binpow(long a, long b) {
        a %= m;
        long r = 1;
        while (0 < b) {
            if (b & 1) {
                r = r * a % m;
            }
            a = a * a % m;
            b >>= 1;
        }
        return r;
    }
    long inv(int n) {
        return binpow(n, m-2);
    }
    public int  compute_value(int n)
    {
        // code here
        long ans = 1, num = 1, den = 1, cur = n;
        for(int i = 1, j = n; i <= n; i++, j--)
        {
            num = (num * j) % m;
            den = (den * i) % m;

            long temp = (num * inv((int) den)) % m;
            temp = binpow(temp, 2);
            ans = (ans + temp) % m;
        }
        return (int)ans;
    }
}