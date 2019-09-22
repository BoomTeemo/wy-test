package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class ChuShuBoYi {
    public boolean divisorGame(int N) {
        int [] dp = new int[N+1];

        if(N==1){return false;}
        else if(N==2){return true;}
        else if(N==3){return false;}
        else
        {

            dp[0] = 99999;
            dp[1] = 99999;
            dp[2] = 1;
            dp[3] = 0;

            for(int i = 4; i < N+1; i++)
            {
                ArrayList<Integer> Divs = allFactors(i);
                int length = Divs.size();
                dp[i] = 9999;

                for(int k=0; k<length; k++)
                {
                    dp[i] = Math.min(dp[i-Divs.get(k)],dp[i]);
                    if(dp[i] == 0 && k==(length-1)){dp[i] = 1;}
                    else if(dp[i] != 0 && k==(length-1)){dp[i] = 0;}
                }
            }
        }

        if(dp[N] == 0){return false;}
        else{return true;}

    }

    public ArrayList<Integer> allFactors(int a) {

        int upperlimit = (int)(Math.sqrt(a));

        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1;i <= upperlimit; i+= 1)
        {
            if(a%i == 0){
                factors.add(i);
                if(i != a/i)
                {
                    factors.add(a/i);
                }
            }
        }

        Collections.sort(factors);
        return factors;
    }


}
