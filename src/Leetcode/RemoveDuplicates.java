package Leetcode;

/**
 * 移除相同字符
 * @author czy
 * @date 20200409
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 0,0,0,1,1,2,3,3,3,4};
        int num = removeDuplicates(nums);
//        int num = getNum(nums);
        for (int i = 0; i < num; i++) {
            System.out.print(nums[i]);
        }
    }

    //双指针查找
    private static int getNum(int[] nums) {
        int length = nums.length;
        int p=0;
        int arr = 1;
        for (int q = 1; q < length;q++ ) {
            if (nums[p]!=nums[q]){
                p=q;
                nums[arr]=nums[p];
                arr++;
            }
        }
        return arr;
    }

    //将重复的字符置后
    public static int removeDuplicates(int[] nums) {
        int num = nums.length;
        int arr = num;
        for (int i = 0; i < num; i++) {
            int len = 0;
            for (int j = i + 1; j < arr; j++) {
                if (nums[i] == nums[j]) {
                    len++;
                    num--;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < arr - len; j++) {
                nums[j] = nums[j + len];
            }
            for (int j = arr - len; j < arr; j++) {
                nums[j] = nums[i];
            }
        }
        return num;
    }
}

