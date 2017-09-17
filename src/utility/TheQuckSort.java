package utility;

public class TheQuckSort {

    Integer[] temp;
    int iterLeft=0,iterRight=0;

    public void quickSor(Integer[] o){
        temp=o;
        recursion(0,o.length-1);
        System.out.println("\n");
    }

    private void recursion(int left, int right) {
        if(right-left<=0) return;
        else {
            long current = temp[right];
            //printIter(iterLeft,left,right);
            int part = findPart(left,right,current);
            printIter(++iterLeft,left,right);
            recursion(left,part-1);
            printIter(++iterRight,left,right);
            recursion(part+1,right);
        }
    }

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
