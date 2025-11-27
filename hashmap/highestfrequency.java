// Difference between highest and lowest occurrence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class highestfrequency{
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
        int max = Collections.max(map.values());
        int maxElemetoccur = 0;
        for(Map.Entry <Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
                maxElemetoccur = entry.getKey();
            }
        }
        return maxElemetoccur;
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