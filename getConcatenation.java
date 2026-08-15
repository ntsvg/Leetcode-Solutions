import java.util.*;
class getConcatenation {
    public int[] getconcatenation(int[] nums) {
        int [] ans = new int[2*nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    //This is main method which is automatically written by leetcode when you run the code. You can use this main method to test your code with custom inputs.  
    public static void main(String[] args) {

        getConcatenation obj = new getConcatenation();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] result = obj.getconcatenation(nums);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}