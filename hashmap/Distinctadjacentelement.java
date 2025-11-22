// Given an array arr[] of integers, the task is to check whether obtaining an array with distinct adjacent elements is possible by swapping two neighboring array elements.
// Examples:
// Input: arr[] = [1, 1, 2]
// Output: true
// Explanation: Swapping last 2 elements can result in [1, 2, 1].
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Distinctadjacentelement{
    public static boolean Adjacentelement(int[] nums){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int maxoccurance = Integer.MIN_VALUE;
        for(Map.Entry <Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxoccurance ){
                maxoccurance = entry.getValue();
            }
        }
        int ans = (nums.length + 1) / 2;
        if(ans >= maxoccurance){
            return true;
        }
        return false;
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
        boolean result = Adjacentelement(nums);
        System.out.println("Result : " + result);
    }
}