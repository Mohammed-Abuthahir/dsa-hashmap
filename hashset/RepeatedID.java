// Geek is given a task to select at most 10 employees for a company project. Each employee is represented by a single-digit ID number which is unique for all the selected employees for the project. Geek has a technical problem in his system which printed ID number multiple times. You are given array arr having all printed IDs. Help him to get rid of the repeated IDs.
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class RepeatedID{
    public static int[] repeated(int[] nums){
        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int[] index = new int[set.size()];
        int j = 0;
        for(int num : set){
            index[j] = num;
            j++;
        }
        return Arrays.copyOf(index,j);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = repeated(nums);
        System.out.println("result :"+ Arrays.toString(result));
    }
}