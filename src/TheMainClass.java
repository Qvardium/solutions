
import utility.*;

import java.util.Arrays;

public class TheMainClass {

    final static int N = 10;    //константа для вычесления N-го числа Фибоначчи

    public static void main(String[] args){

        TheFibonachy theFibonachy = new TheFibonachy();
        //print(theFibonachy.getResult(N));


        Integer[] forQS = new Integer[]{4,2,8,1,3,7,6,5};

        print("\n"+Arrays.toString(forQS)+"\n");
        TheQuckSort theQuckSort = new TheQuckSort();
        theQuckSort.quickSor(forQS);

        print("\n"+Arrays.toString(forQS));
    }

    public static void print(Object o){
        System.out.print(o);
    }
}
