import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class unionofarray{
    public static Set<Integer> union(int[] nums1,int[] nums2){
        Set<Integer> set = new HashSet<>();
        for(int num1 : nums1){
            set.add(num1);
        }
        for(int num2 : nums2){
            set.add(num2);
        }
        return set;
    
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays1 :");
        int[] nums1 = new int[n1];
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = scan.nextInt();

        }
        System.out.println("Enter the Arrays 2");
        int[] nums2 = new int[n2];
        for(int j = 0;j<nums2.length;j++){
            nums2[j] = scan.nextInt();
        }
        Set<Integer> result = union(nums1,nums2);
        System.out.println("Union of Arrays :"+result);
    }
}