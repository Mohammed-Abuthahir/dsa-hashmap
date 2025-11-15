import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Fibonacciarray{
    public static int fiboonacciseries(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int max = Integer.MIN_VALUE;
        while(left<=right){
            max = Math.max(max,Math.max(nums[left],nums[right]));
            left++;
            right--;
        }
        HashSet <Integer> set = new HashSet<>();
        int a = -1,b = 1,c;
        int i = 0;
        while(i<=max){
            c = a+b;
            set.add(c);
            a = b;
            b = c;
            i++;
        }
        int count = 0;
        for(int num : nums){
            if(set.contains(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = fiboonacciseries(nums);
        System.out.println("Count Of Fibonacci Number is :"+ result);
    }
}