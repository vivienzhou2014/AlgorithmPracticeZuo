package BinaryTree;


public class SearchBT {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static class ReturnData{
        public boolean isBST;
        public int min;
        public int max;
        public ReturnData(boolean is, int mi, int ma){
            isBST = is;
            min = mi;
            max = ma;
        }
    }

    public static ReturnData process(Node x){
        if(x == null){
            return null;
        }
        ReturnData leftData = process(x.left);
        ReturnData rightData = process(x.right);


        int min = x.value;
        int max = x.value;
        if(leftData!=null){
            min = Math.min(min,leftData.min);
            max = Math.max(max,leftData.max);
        }
        if(rightData!=null){
            min = Math.min(min,rightData.min);
            max = Math.max(max,rightData.max);
        }
        boolean isBST = true;
        if(leftData!=null && (!leftData.isBST || leftData.max >= x.value)){
            isBST = false;
        }
        if(rightData!=null && (!rightData.isBST || rightData.min <= x.value)){
            isBST = false;
        }

        return new ReturnData(isBST, min, max);
    }
}


