// Smallest number repeating K times
// Given an array arr, the goal is to find out the smallest number that is repeated exactly ‘k’ times.
// Note: If there is no such element then return -1.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Smallestnumberrepeating{
    public static int smallest(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int min = Integer.MAX_VALUE;
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(k)){
                min = Math.min(min,entry.getKey());
            }
         }
         return (min == Integer.MAX_VALUE) ? -1 : min;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = smallest(nums,k);
        System.out.println("Result :"+result);
    }
}