package Arrays.Questions;

import java.util.Arrays;


class Concatenation_LC {
    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int i = 0;
        while (i < nums.length) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}

