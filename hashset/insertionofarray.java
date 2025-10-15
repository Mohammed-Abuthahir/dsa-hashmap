import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class insertionofarray{
    public static Set<Integer> insertion(int[] nums1,int[] nums2){
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        for(int arr1 : nums1){
            set1.add(arr1);
        }
        for(int arr2 : nums2){
            if(set1.contains(arr2)){
                set2.add(arr2);
            }
        }
        return set2;
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
        Set<Integer> result = insertion(nums1,nums2);
        System.out.println("Insertion of Arrays :"+result);
    }
}
