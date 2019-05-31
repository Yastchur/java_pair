import java.util.*;

public class Main{

    public static void main(String []args){
        int [] numbers = {1, 39, 7, 36, 20, 15, 20, 20, 33, 35};
        int sum = 40;
        System.out.println("Из ряда чисел (" + Arrays.toString(numbers) + ") сумму " + sum + " дют такие пары :");
        System.out.println(PairNumber(numbers, sum));
    }
     
    public static List<List<Integer>> PairNumber(int[] numbers, int sum) {
         
        Arrays.sort(numbers);
         
        List<List<Integer>> result = new ArrayList<>();
         
        for(int i = 0, j = (numbers.length - 1); i < j; i++){
            if(numbers[i] >= sum) break;
            int pair = sum - numbers[i];
            for(int k = j; i < k; k--){
                if(numbers[k] == pair){
                    result.add(Arrays.asList(numbers[i], numbers[k]));
                    j = k - 1;
                    break;
                }
            }
        }
         
        return result;
    }
}
