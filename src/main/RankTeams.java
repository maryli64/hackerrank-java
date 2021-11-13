package main;

import java.util.*;

public class RankTeams {
    public String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        List<Team> teams = new ArrayList<>();
//instantiate all the teams

        for (int i = 0; i < 26; i++) {
            char teamName = (char) ('A' + i);
            Team team = new Team();
            team.name = teamName;
            teams.add(team);
        }
//assign votes to the teams
        for (int i = 0; i < votes.length; i++) {
            for (int j = 0; j < votes[i].length(); j++) {
                teams.get(((int) votes[i].charAt(j)) - (int) 'A').votes[j]++;
            }
        }
//sort the teams
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                for (int i = 0; i < 26; i++) {
                    if (o1.votes[i] < o2.votes[i]) {
                        return 1;
                    } else if (o1.votes[i] > o2.votes[i]) {
                        return -1;
                    }
                }

                if (o1.name < o2.name) {
                    return -1;
                }
                return 1;
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < votes[0].length(); i++) {
            sb.append(teams.get(i).name);
        }

        return sb.toString();
    }
}
