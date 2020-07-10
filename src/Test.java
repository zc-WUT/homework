import java.time.Clock;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[20000];
        int[] a =getRandomArr(arr);
        int[] b = a.clone();
        int[] c = b.clone();
        int[] d = b.clone();
        int[] e = b.clone();
        int[] f = b.clone();
        int[] g = b.clone();
        int[] h = b.clone();
        long s = Clock.systemDefaultZone().millis();
        QuickSort.sort(a,0,a.length-1);
        System.out.println("quickSort耗时: " + (Clock.systemDefaultZone().millis() - s) + " ms");

        s = Clock.systemDefaultZone().millis();
        Merge.mergeSort(b,0,b.length-1);
        System.out.println("mergeSort: " + (Clock.systemDefaultZone().millis() - s) + " ms");

        s = Clock.systemDefaultZone().millis();
        MaoPao.sort(e);
        System.out.println("maoPaoSort耗时: " + (Clock.systemDefaultZone().millis() - s) + " ms");

        s = Clock.systemDefaultZone().millis();
        MaoPao.sortPlus(f);
        System.out.println("maoPaoSortPlus耗时: " + (Clock.systemDefaultZone().millis() - s) + " ms");

        s = Clock.systemDefaultZone().millis();
        InsertSort.sort(g);
        System.out.println("insertSort耗时: " + (Clock.systemDefaultZone().millis() - s) + " ms");

        s = Clock.systemDefaultZone().millis();
        SelectSort.sort(h);
        System.out.println("selectSort耗时: " + (Clock.systemDefaultZone().millis() - s) + " ms");
    }

    /**
     * 获取一个打乱的数组
     * @param arr
     */
    private static int[] getRandomArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(arr.length);
        }
        return arr;
    }
}
