/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

import static java.util.Arrays.*;

public class Library {
    public static void main(String[] args) {

        getall();
    }

    public static String[] setmaxandmin(){
        Set<Integer> setnumbers = new HashSet<Integer>();

        for (int[] i : weeklyMonthTemperatures){
            for(int j :i){
                setnumbers.add(j);
            }
        }
        String handler = Arrays.toString(setnumbers.toArray());
        handler = handler.replace("[","");
        handler = handler.replace("]","");
        String[] arrOfStr = handler.split(", ");
        Arrays.sort(arrOfStr);
        return arrOfStr;
    }
    public static int getmax(){
        String[] arr = setmaxandmin();
        return Integer.parseInt(arr[arr.length-1]);
    }
    public static int getmin(){
        String[] arr = setmaxandmin();
        return Integer.parseInt(arr[0]);
    }

    public static int getall(){
        String handler = Arrays.toString(setmaxandmin());
        String[] arr = setmaxandmin();
        int i = Integer.parseInt(arr[0]);
        while (i !=Integer.parseInt(arr[arr.length-1]) ){
            if (!(handler.contains(Integer.toString(i)))){
                System.out.println("Never saw temperature: " + Integer.toString(i));
            }
            i++;
        }
        return Integer.parseInt(arr[0]);
    }


    public static int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };



    public boolean someLibraryMethod() {
        return false;
    }
    public boolean someLibraryMethod2() {
        return true;
    }
    static int[] roll(int number) {
        int max = 6;
        int min = 1;
        int[] FinalArray = new int[number];
        for (int i = 0; i < FinalArray.length; i++) {
            FinalArray[i] = (int) (Math.random() * (max-min+1)) + min;
        }
        return FinalArray;
    }

    public static boolean containsDuplicates  (String[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculatingAverages (int[] arr){
        double sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return (sum/arr.length);
    }
    public static int minAvg (int[][] arr){
        double minArr = calculatingAverages(arr[0]);
        int[] returnArr = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            double arrAvg = calculatingAverages(arr[i]);
            if(minArr > arrAvg){
                minArr = arrAvg;
                returnArr = arr[i];

            }
        }

        double finall = calculatingAverages(returnArr);
        int c = (int) finall;
        return c;
    };
}
