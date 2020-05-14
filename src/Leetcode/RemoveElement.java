package Leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int a = remove(nums,val);
        System.out.println(a+"   "+nums.toString());
    }
    public  static int remove(int[] nums,int val) {
        int a= nums.length;
        int num = a;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (nums[i] == val) {
                nums[i] = nums[num - 1];
                num--;
                i--;
                sum++;
            }
        }
            return a-sum;
    }
}
