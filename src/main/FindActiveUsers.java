package main;

import java.util.*;

public class FindActiveUsers {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        //stores the userid, set of unique UAMs
        Map<Integer, Set<Integer>> userToUAMSetMap = new HashMap<>();

        for (int[] log : logs) {
            if (userToUAMSetMap.get(log[0]) == null) {
                Set<Integer> timeSet = new HashSet<>();
                timeSet.add(log[1]);
                userToUAMSetMap.put(log[0], timeSet);
            } else {
                userToUAMSetMap.get(log[0]).add(log[1]);
            }
        }

        int[] result = new int[k];

        for (Map.Entry<Integer, Set<Integer>> entrySet : userToUAMSetMap.entrySet()) {
            result[entrySet.getValue().size() - 1]++;
        }

        return result;
    }
}
