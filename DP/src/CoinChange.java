public class CoinChange
{

    
    public static void main(String args[]){
        int[] coins = {1, 2, 5};
        int amount = 27;
        System.out.println(coinChange(coins,amount));

    }
     public static int coinChange(int[] coins, int amount) {
        int[] f =new int[amount+1];
        f[0]=0;//初始条件
        for (int i=1;i<=f.length-1; i++) {
            f[i] = Integer.MAX_VALUE;
            for(int j =0 ;j<coins.length;++j){
                if(i>= coins[j] && f[i-coins[j]]!= Integer.MAX_VALUE){
                    f[i] = Math.min(f[i-coins[j]]+1,f[i]);
                }
            }
        }

        if(f[f.length-1] == Integer.MAX_VALUE){
            return -1;
        }

        return f[f.length-1];

    }


}
