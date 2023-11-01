import java.util.*;
public class ChangeValues {
    public static void main(String[] args) {
       int [] arr ={1,34,5,6,7,8};
       change(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void change(int []nums)
    {
        nums[2]=45;

    }

    
}
