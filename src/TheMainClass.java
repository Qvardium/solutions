
import utility.*;

import java.util.Arrays;

public class TheMainClass {

    final static int N = 10;    //константа для вычесления N-го числа Фибоначчи

    public static void main(String[] args){

        /*--------------------------------
        -
        -   Фибоначчи
        -
         ---------------------------------*/
        TheFibonachy theFibonachy = new TheFibonachy();
        print(theFibonachy.getResult(N)+"\n\n");



        /*-------------------------------
        -
        -   Быстрая сортировка
        -
         -------------------------------*/
        Integer[] forQS = new Integer[]{4,2,8,1,3,7,6,5};

        print("\n"+Arrays.toString(forQS)+"\n\n");// Вывод массива до сортировки

        TheQuckSort theQuckSort = new TheQuckSort();
        theQuckSort.quickSor(forQS);

        print(Arrays.toString(forQS)+"\n\n");// Вывод после сортировки
    }

    public static void print(Object o){
        System.out.print(o);
    }
}
