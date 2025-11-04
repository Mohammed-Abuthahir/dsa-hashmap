import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Longestsubstringlength{
    public static int substring(String s){
        int start = 0;
        int end = 0;
        int maxlen = Math.min(s.length(),1);
        HashSet<Character>set = new HashSet<>();
        while(end < s.length()){
            char c = s.charAt(end);
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start = start + 1;
            }
            set.add(c);
            int window = end - start + 1;
            maxlen = Math.max(window,maxlen);
            end = end + 1;
        }
        return maxlen;
    }
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        int result = substring(str);
        System.out.println("Result :"+result);
    }
}