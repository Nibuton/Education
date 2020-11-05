public class Task_7 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        shiftArray(arr1,-12); // тоже самое, что -3 (учтено внутри кода)
        printArr(arr1);
        System.out.println();
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shiftArray(arr2,4);
        printArr(arr2);
    }

    /*
    Когда думал, как решать, заметил, что можно было бы постараться все сдвигать вправо на один
    элемент. Но это потребовало бы количество проходов всего массива равное необходимому свдигу. А
    скорость решения, как кажется, должна зависеть только от размера массива, а не от необходимого
    сдвига. Будем просто переставлять каждое число на место следующего, увеличивая индекс на величину
    сдвига.  Станет понятно, что внутри массива возникают циклы перестановок. К примеру, в массиве
    {0,1,2,3,4,5,6,7,8} -> {0,3,6} , {1,4,7} , {2, 5, 8} - 3 группы. Получается, таких групп в
    общем случае выходит НОД из длины массива и нужного сдвига. Тогда для каждой из таких групп
    можно совершить перестановку и таким образом пройти весь массив единожды.
     */
    public static int[] shiftArray(int[] arr, int n){
        int nod = greatDivison(arr.length, abs(n));
        int new_index;
        int old_index;
        int mem;
        int l = arr.length;
        if (abs(n) > l){
            n = n % l; // на случай, если вводят число большее чем длина массива
        }
        for (int i = 0; i < nod; i++){
            old_index = i;
            mem = arr[i];
            for(;;){
                new_index = old_index - n;
                if (new_index < 0){
                    new_index = l + new_index;
                }
                else if (new_index >= l){
                    new_index = new_index - l;
                }
                arr[old_index] = arr[new_index];
                if (new_index == i){
                    arr[old_index] = mem;
                    break;
                }
                old_index = new_index;
            }
        }
        return arr;
    }

    // Реализуем рекурсивный алгоритм Евклида для поиска НОД

    public static int greatDivison(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return greatDivison(b, a % b);
    }

    public static void printArr(int arr[]) {
        for (int a: arr){
            System.out.println(a);
        }
    }

    public static int abs(int n){
        int ab;
        if (n >= 0) {
            ab = n;
        }
        else{
            ab = -n;
        }
        return ab;
    }
}

