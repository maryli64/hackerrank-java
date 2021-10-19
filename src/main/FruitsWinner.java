/**
 * Author: Mary L
 */
package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FruitsWinner {

    /*
     *Complete the 'foo' function below.
     *
     *The function is expected to return an INTEGER.
     *The function accepts following parameters:
     *1.STRING_ARRAY codeList
     *2.STRING_ARRAY shoppingCart
     */

    public static int foo(List<String> codeList, List<String> shoppingCart) {
        //Write your code here
        int currentCodeListInd = 0;
        if (codeList == null || codeList.isEmpty()) {
            return 1;
        }
        if (shoppingCart == null || shoppingCart.isEmpty()) {
            return 0;
        }
        String currentCodeArrStr = codeList.get(currentCodeListInd);
        String[] currentCodeArr = currentCodeArrStr.split(" ");
        int matchIndex = 0;
        for (String item : shoppingCart) {

            if (currentCodeArr[matchIndex].equalsIgnoreCase("anything") || currentCodeArr[matchIndex].equalsIgnoreCase(item)) {
                if (matchIndex >= currentCodeArr.length - 1) {
                    matchIndex = 0;
                    currentCodeListInd++;
                    if (currentCodeListInd >= codeList.size()) {
                        return 1;
                    }
                    currentCodeArrStr = codeList.get(currentCodeListInd);
                    currentCodeArr = currentCodeArrStr.split(" ");
                } else {
                    matchIndex++;
                }
            } else if (matchIndex > 0) {
                matchIndex = 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

        int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = new ArrayList<>();

        for (int i = 0; i < codeListCount; i++) {
            String codeListItem = bufferedReader.readLine();
            codeList.add(codeListItem);
        }

        int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = new ArrayList<>();

        for (int i = 0; i < shoppingCartCount; i++) {
            String shoppingCartItem = bufferedReader.readLine();
            shoppingCart.add(shoppingCartItem);
        }

        int result = foo(codeList, shoppingCart);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}