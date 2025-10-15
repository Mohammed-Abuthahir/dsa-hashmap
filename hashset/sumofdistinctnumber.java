import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumofdistinctnumber{
    public static int sumofnumber(int[] nums){
        int sum = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int arr : set){
            sum = sum + arr;
        }
        return sum;
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
        int result = sumofnumber(nums);
        System.out.println("result :"+ result);
    }
}