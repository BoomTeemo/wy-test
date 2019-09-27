package leetcode;

public class NIM {
    public boolean canWinNim(int n){
        if(n<=3) {
            return true;
        }
        if(n%4!=0) {
            return true;
        }
        return false;
    }
}
