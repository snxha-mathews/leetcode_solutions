class Solution {
    public boolean isPalindrome(int x) {
        boolean flag=false;
        int copy=x;
        int rev=0;
        while(copy>0)
        {
            int ld=copy%10;
            rev=(int)rev*10+ld;
            copy/=10;
        }

        if(rev==x)
        return true;
        else
        return false;
    }
}