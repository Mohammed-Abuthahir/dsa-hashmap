// Difference between highest and lowest occurrence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class highestandlowestoccurrence{
    public static int frequency(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                maxElement = entry.getKey();
            }
        }
        return maxElement;
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
        int result = frequency(nums);
        System.out.println("Result :"+result);
    }
}