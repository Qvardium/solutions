
import utility.*;

public class TheMainClass {

    final static int N = 10;    //константа для вычесления N-го числа Фибоначчи

    public static void main(String[] args){

        TheFibonachy theFibonachy = new TheFibonachy();
        print(theFibonachy.getResult(N));

    }

    public static void print(Object o){
        System.out.print(o);
    }
}
