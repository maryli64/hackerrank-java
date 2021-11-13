package main;

import java.util.*;
import java.util.stream.Collectors;

public class BuyAndSellStock {
    public int maxProfit(int prices[]) {
        int maxProfits = 0;
        if(prices.length <= 1){
            return maxProfits;
        }
        int minPrice= Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else if((prices[i]-minPrice)>maxProfits){
                maxProfits=prices[i]-minPrice;
            }
        }

        return maxProfits;
    }
}
