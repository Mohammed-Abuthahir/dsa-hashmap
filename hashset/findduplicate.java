import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findduplicate{
    public static boolean duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
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
        boolean result = duplicate(nums);
        System.out.println("result :" +result);
    }
}