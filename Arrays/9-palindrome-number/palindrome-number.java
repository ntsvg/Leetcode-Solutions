class Solution {
    public boolean isPalindrome(int x) {
        int revNum =0;
        int temp = x;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                int last = x%10;
                revNum = (revNum*10)+last;
                x = x/10;
            }
            return revNum == temp;
            
        }
    }
}