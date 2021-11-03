/**
 * Author: Mary L
 */
package main;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FruitsWinnerRegularExpression {

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

      String shoppingCartStr=  shoppingCart.stream().collect(Collectors.joining(","));
        StringBuilder sb= new StringBuilder();
        sb.append("\\b");

        for(int i = 0; i<codeList.size(); i++){
            String[] codeArr = codeList.get(i).split(" ");
            if(i>0){
                sb.append("(.*)");
            }
            for(int j=0; j<codeArr.length; j++){
                if(j>0){
                    sb.append("[,]");
                }
                if(codeArr[j].equalsIgnoreCase("anything")){
                    sb.append("(\\w+)");
                }else {
                    sb.append("(").append(codeArr[j]).append(")");
                }
            }

        }
        sb.append("\\b");
        String match=sb.toString();
        Pattern pattern = Pattern.compile(sb.toString(), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(shoppingCartStr);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
            return 1;
        } else {
            System.out.println("Match not found");
            return 0;
        }
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