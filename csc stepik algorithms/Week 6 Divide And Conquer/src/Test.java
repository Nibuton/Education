import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        int[] l = {2,3,9};
        int[] r = {2,9};
        int[] arr = {10,2,3,9,2,9};
        sortedElement se = new sortedElement(arr);
        se = Sort(se);
        /* for (int c : newarr){
            System.out.print(c + " ");
        } */
        System.out.println(se.getInversion());
    }

    public static sortedElement Sort(sortedElement arr){
        int len = arr.length();
        if(len > 1){
            int a = len/2;
            int[] left = Arrays.copyOfRange(arr.getArr(), 0, a);
            int[] right = Arrays.copyOfRange(arr.getArr(),a,arr.length());
            return Merge(Sort(new sortedElement(left)), Sort(new sortedElement(right)));
        }
        else{
            return arr;
        }
    }

    public static sortedElement Merge(sortedElement left, sortedElement right){
        int i = 0;
        int j = 0;
        int sum = left.getInversion() + right.getInversion();
        int[] arr = new int[left.length() + right.length()];
        while(i != left.length() && j != right.length()){
            if (left.getArr()[i] <= right.getArr()[j]){
                arr[i+j] = left.getArr()[i];
                i++;
            }
            else{
                arr[i+j] = right.getArr()[j];
                j++;
                sum+= left.length() - i;
            }
        }
        if (i == left.length()){
            endWrite(arr, right.getArr(), j);
        }
        else{
            endWrite(arr,left.getArr(),i);
        }
        return new sortedElement(arr,sum);
    }

    public static void endWrite(int[] target, int[] tail, int index){
        for (int i = index; i < tail.length; i++){
            target[target.length - tail.length + i] = tail[i];
        }
        return;
    }

}
