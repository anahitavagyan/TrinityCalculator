package edu.trinity;

public class Fibonacci {

    public static int calculate(int i) {
        int sum = 1;
        int prevSum = 1;
        int interSum = 0;
        if (i == 0) {
            return 0;
        }else if(i==1 || i==2){
            return 1;
        }else {
            for(int count = 3; count <= i; count++){
                interSum = sum;
                sum = sum + prevSum;
                prevSum = interSum;
            }
            return sum;
        }
    }
}

