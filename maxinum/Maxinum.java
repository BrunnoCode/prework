import java.util.*;

public class Maxinum{
  public static void main(String[] args){	
     int numbers[] = {14, 52, 63, 472, 85, 13, 3, 5};

     int maxnum = max(numbers);
     
     System.out.printf("El numero mas alto del array es: %d\n", maxnum);
  }
  
  public static int max(int[] nums){
    int max = nums[0];
    for (int i = 0; i < nums.length; i++){
      if(nums[i] > max)
	max = nums[i];	
    }
    return max;  
  } 	

}
