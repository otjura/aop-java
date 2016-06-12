//demo 5.4
//write method that returns array with smallest and largest int in param array
import java.util.Arrays;
class SmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {8,2,3,52,3,42,2,56,67,42,1,5,6,2133,5,64};
        int[] aaa = smallandlarge(arr);
        System.out.println(Arrays.toString(aaa));
    }

    private static int[] smallandlarge(int[] arr) {
        int[] smla = {arr[0], arr[0]};
        for(int i:arr) {
            if(i < smla[0]) smla[0] = i;
            if(i > smla[1]) smla[1] = i;
        }
        return smla;
    }
}