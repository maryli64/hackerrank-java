/**
 * Author: Mary L
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

package main;

import java.io.*;

public class CountingValley {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int totalValueOfSteps = 0;
        int countValleys = 0;
        boolean foundValley = false;
        for (char step : path.toCharArray()) {
            if (step == 'U') {
                totalValueOfSteps++;
            } else {
                totalValueOfSteps--;
            }
            if (!foundValley && totalValueOfSteps < 0) {
                foundValley = true;
            } else if (foundValley && totalValueOfSteps == 0) {
                foundValley = false;
                countValleys++;
            }
        }
        return countValleys;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(("test.txt")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
