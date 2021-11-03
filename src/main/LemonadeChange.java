package main;

/*
 * https://leetcode.com/problems/lemonade-change/
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int countFiveDollarBills=0;
        int countTenDollarBills=0;
        int countTwentyDollarBills=0;

        for(int bill : bills){
            int amountOwe= bill - 5;
            if(amountOwe>0){
                while(amountOwe>0 && countTwentyDollarBills>0 &&(20<=amountOwe)){
                    countTwentyDollarBills--;
                    amountOwe-=20;
                }
                while(amountOwe>0 && countTenDollarBills>0 &&(10<=amountOwe)){
                    countTenDollarBills--;
                    amountOwe-=10;
                }
                while(amountOwe>0 && countFiveDollarBills>0 &&(5<=amountOwe)){
                    countFiveDollarBills--;
                    amountOwe-=5;
                }

                if(amountOwe>0){
                    return false;
                }
            }

            if(bill==5){
                countFiveDollarBills++;
            }else if(bill==10){
                countTenDollarBills++;
            }else{
                countTwentyDollarBills++;
            }
        }
        return true;
    }
}
