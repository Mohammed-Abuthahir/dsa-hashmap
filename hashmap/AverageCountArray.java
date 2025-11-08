// Given an array arr[] and an integer x. You have to calculate the average for each element arr[i] and x and find out whether that number exists in the array. Do it for all the elements of the array and store the count result in another array for each index how many occurrences of average are present in the array.
// Note: Always take the floor value of the average.

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class AverageCountArray{
    public static void averagecount(int[] nums,int x){
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i = 0;i<nums.length;i++){
            int avg = (nums[i]+x)/2;
            list.add(map.getOrDefault(avg,0));
        }
        System.out.println(list);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the X :");
        int x = scan.nextInt();
        averagecount(nums,x);
    }
}
