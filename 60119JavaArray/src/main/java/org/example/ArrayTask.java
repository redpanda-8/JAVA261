package org.example;
/*
1.Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
just sum up the elements that exist, returning 0 if the array is length 0.
sum2([1, 2, 3]) → 3 -  sum2([1, 1]) → 2 -  sum2([1, 1, 1, 1]) → 2
*/
public class ArrayTask {
    public static int sum2(int[] nums){
        if (nums.length == 0) { // jei masyvas tuščias
            return 0;
        }
        if (nums.length == 1) { // jei yra tik vienas elementas
            return nums[0];
        }
        return nums[0] + nums[1]; // jei yra 2 ar daugiau – imam tik pirmus du
    }
    //for test - System.out.println(ArrayTasks.sum2(new int[]{1,2,3})); // 3

    /*
    2.Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
    double23([2, 2]) → true double23([3, 3]) → true double23([2, 3]) → false
     */
    public static boolean double23(int[] array){
        if(array.length <2){
            return false;
        }
        return (array[0]==2 && array[1]==2) ||
                (array[0]==3 && array[1]==3);
    }
    public static void main(String[] args){
        System.out.println(double23(new int[]{2, 3}));
        System.out.println(double23(new int[]{3, 3}));
    }

    /*
    3.Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    sum28([2, 3, 2, 2, 4, 2]) → true sum28([2, 3, 2, 2, 4, 2, 2]) → false sum28([1, 2, 3, 4]) → false
     */
    public static boolean sum28(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==2){
                sum += 2;
            }
        }
        return sum==8;
    }
    //for test - System.out.println(ArrayTasks.sum28(new int[]{2,3,2,2,4,2}));   // true
    // System.out.println(ArrayTasks.sum28(new int[]{2,3,2,2,4,2,2})); // false
}