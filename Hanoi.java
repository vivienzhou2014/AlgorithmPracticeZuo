package ForceRecursion;

public class Hanoi {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n);
    }

    private static void hanoi(int n) {
        if(n >0){
            p(n,"left", "right", "middle");
        }
    }

    private static void p(int n, String from, String to, String other) {
        if(n == 1){
            System.out.println("Move 1 from " + from + " to " + to);
        }else{
            p(n-1, from, other, to);
            System.out.println("Move " + n + " from " + from + " to " + to);
            p(n-1, other, to , from);
        }
    }
}
