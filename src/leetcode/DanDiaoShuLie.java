package leetcode;

public class DanDiaoShuLie {
    public boolean isMonotonic(int[] A) {
        if(A == null) {
            return false;
        }
        if(A.length == 1) {
            return true;
        }
        int len = A.length;
        if(A[0] < A[len-1]){
            for(int i = 1; i < len; i++){
                if(A[i] < A[i-1]){
                    return false;
                }
            }
        } else if(A[0] > A[len-1]){
            for(int i = 1; i < len; i++){
                if(A[i] > A[i-1]){
                    return false;
                }
            }
        } else if(A[0] == A[len-1] && len > 2){
            for (int i = 1; i < len; i++) {
                if (A[i] != A[i-1]){
                    return false;
                }
            }
        } else {
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        DanDiaoShuLie danDiaoShuLie = new DanDiaoShuLie();
        int question [] = {1,2,2,3};
        boolean result = danDiaoShuLie.isMonotonic(question);
        System.out.println(result);
    }
}
