class Solution {
    public int tribonacci(int n) 
    {
        if(n == 0)
        {return 0;}
        else if(n == 1 || n == 2)
        { return 1;}
        else
        {
            int FirstT = 0;
            int SecondT = 1;
            int ThirdT = 1;
            int FourthT = 0;
            int i = 0;

            for(i = 1; i <= n; i++)
            {
                FourthT = FirstT + SecondT + ThirdT;

                FirstT = SecondT;
                SecondT = ThirdT;
                ThirdT = FourthT;
            }
            return FirstT;
        }
    }
}