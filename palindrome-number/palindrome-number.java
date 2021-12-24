class Solution {
    public boolean isPalindrome(int x) {
        int s=0,a,b=x;
        if(b<0)
            return false;
        while(x!=0)
                {
                    a=x%10;
                    s=s*10+a;
                    x/=10;
                }
        if(s==b)
            return true;
        else
            return false;
    }
}