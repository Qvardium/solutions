package utility;

public class TheQuckSort {

    Integer[] temp;
    int iterLeft=-1,iterRight=-1;

    public void quickSor(Integer[] o){
        temp=o;
        recursion(0,o.length-1);
        System.out.println("\n");
        //  Обнуляем после сортировки, на случай если будет повтороно использован данный метод
        iterRight=-1;
        iterLeft=-1;
    }

    private void recursion(int left, int right) {
        if(right-left<=0) return;
        else {
            long current = temp[right];
            int part = findPart(left,right,current);
            //  Обходим левый край
            printIter(++iterLeft,left,right);
            recursion(left,part-1);
            //  Обходим правый край
            printIter(++iterRight,left,right);
            recursion(part+1,right);
        }
    }
    //  Метод для вывода рекурсии на консоль
    private void printIter(int iter,int l, int r){
        for (int i = 0; i < iter; i++) {
            System.out.print("-");
        }
        System.out.println(" recursion("+l+", "+r+")");
    }

    private int findPart(int left, int right, long current) {
        int leftP=left-1;
        int rightP=right;
        for(;;){

            while (temp[++leftP]<current);

            while (rightP>0 && temp[--rightP]>current);

            if(leftP>=rightP)
                break;
            else
                change(leftP,rightP);
        }
        if(leftP!=right)change(leftP,right);
        return leftP;
    }

    private void change(int leftP, int rightP) {
        Integer tt=temp[leftP];
        temp[leftP]=temp[rightP];
        temp[rightP]=tt;
    }
}
