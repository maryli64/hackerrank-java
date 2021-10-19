/**
 * Author: Mary L
 * Link: https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

package main;

import java.io.*;

public class RepeatedStr {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */
    public static long repeatedString(String s, long n) {
        // Write your code here
        if (n <= s.length()) {
            return getNumOfMatchesForLength(s, n);
        }

        return (getNumOfMatchesForLength(s, s.length()) * (n / s.length())) + getNumOfMatchesForLength(s, n % s.length());
    }

    private static long getNumOfMatchesForLength(String s, long n) {
        int countMatch = 0;
        for (long i = 0; i < n; i++) {
            if (s.charAt((int) i) == 'a') {
                countMatch++;
            }
        }
        return countMatch;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
