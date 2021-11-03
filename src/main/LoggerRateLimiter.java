package main;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter {

    Map<String, Integer> messagesTimeMap = new HashMap<String, Integer>();

        public LoggerRateLimiter() {

        }

        public Boolean shouldPrintMessage(int timestamp, String message) {
            if(messagesTimeMap.get(message)==null || messagesTimeMap.get(message)<=timestamp){
                messagesTimeMap.put(message, timestamp+10);
                return true;
            }
            return false;
        }


/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
}
