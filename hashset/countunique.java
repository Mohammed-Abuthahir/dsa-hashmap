import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class countunique{
    public static int count(int[] nums){
        HashSet<Integer>set = new HashSet<>();
        int count = 0;
        for(int num : nums){
            set.add(num);
        }
        count = set.size();
        return count;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the ARrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = count(nums);
        System.out.println("Count :"+ result);
    }
}