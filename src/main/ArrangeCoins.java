package main;

import java.math.BigInteger;

public class ArrangeCoins {
    /*
    public int arrangeCoins(int n) {
        // 1 coin = 1 row     1
        // 3 coins = 2 rows   1 + 2
        // 6 coins = 3 rows   1 + 2 + 3
        // 10 coins = 4 rows  1 + 2 + 3 + 4
        // 15 coins = 5 rows  1 + 2 + 3 + 4 + 5
        BigInteger nBigInteger= BigInteger.valueOf(n);
        BigInteger currentRow = BigInteger.ZERO;
        BigInteger numCoins = BigInteger.ZERO;

        while (numCoins.compareTo(nBigInteger) < 0) {
            currentRow = currentRow.add(BigInteger.ONE);
            numCoins = currentRow.add(numCoins);
        }

        if (numCoins.compareTo(nBigInteger) > 0) {
            return currentRow.subtract(BigInteger.ONE).intValue();
        }
        return currentRow.intValue();
    }

     */

    public int arrangeCoins(int n) {
        // 1 coin = 1 row     1
        // 3 coins = 2 rows   1 + 2
        // 6 coins = 3 rows   1 + 2 + 3
        // 10 coins = 4 rows  1 + 2 + 3 + 4
        // 15 coins = 5 rows  1 + 2 + 3 + 4 + 5


        long currentRow=0;
        long numCoins=0;
        long nCoins=n;
        while(numCoins<nCoins){
            currentRow++;
            numCoins=currentRow+numCoins;
        }

        if(numCoins>nCoins){
            return (int)(currentRow-1);
        }
        return (int)currentRow;
    }

}
