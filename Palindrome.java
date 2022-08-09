class Solution {
    public boolean isPalindrome(int x) {
        
        int n=x,num=0,rem;
       if(n<0)
           return false;
      else {
        while(n!=0){
            rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
         return num==x;
      }
    }

}
