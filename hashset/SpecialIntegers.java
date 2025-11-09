// Consider an integer array arr of length n. Find the number of distinct special integers in the arr. An integer i is called as a special integer if all of i-1, i and i+1 are present in the arr.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SpecialIntegers{
    public static int special(int[] nums,int n){
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count = 0;
        for(int num : set){
            if(set.contains(num-1) && set.contains(num+1)){
                count++;
            }
        }
        return count;
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
        int result = special(nums,n);
        System.out.println("Result :"+result);
    }
}