/**
 * Author: Mary L
 */
package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SearchSuggestions {
/*
Given min 2 characters in search field, system suggests max 3 ekyworkds
from the review word repo, alpha order, must start with characters typed
case insensitive
     * Complete the 'searchSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY repository
     *  2. STRING customerQuery
     */

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here
        repository.sort(String::compareToIgnoreCase);
        List<List<String>> result = new ArrayList<List<String>>();

        for (int i = 0; i < customerQuery.length(); i++) {
            List<String> currentSearchSuggestionsArr = new ArrayList<String>();
            for (int j = 0; j < repository.size(); j++) {
                if (currentSearchSuggestionsArr.size() >= 3) {
                    break;
                }
                if (repository.get(j).toLowerCase().startsWith(customerQuery.substring(0, i + 1).toLowerCase())) {
                    currentSearchSuggestionsArr.add(repository.get(j));
                }
            }
            result.add(currentSearchSuggestionsArr);

        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

        int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> repository = new ArrayList<>();

        for (int i = 0; i < repositoryCount; i++) {
            String repositoryItem = bufferedReader.readLine();
            repository.add(repositoryItem);
        }

        String customerQuery = bufferedReader.readLine();

        List<List<String>> result = SearchSuggestions.searchSuggestions(repository, customerQuery);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                bufferedWriter.write(result.get(i).get(j));

                if (j != result.get(i).size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
