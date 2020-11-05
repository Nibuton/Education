public class sortedElement {

    int[] arr;
    int inversion;

    public sortedElement(int[] arr, int inversion){
        this.arr = arr;
        this.inversion = inversion;
    }

    public sortedElement(int[] arr){
        new sortedElement(arr, 0);
    }

    public int getInversion() {
        return inversion;
    }

    public int[] getArr() {
        return arr;
    }

    public int length(){
        return arr.length;
    }
}
