

package com.mycompany._12nisan_2026;



public class PERFECT_NUMBER {
    
    public static void faundperfect(int x){
        int sum=0;
        if (x==0) {
            System.out.println("Your number is not a perfect number");
        }
        for (int i = 1; i < x; i++) {
            if (x%i==0) {
                sum+=i;
            }
        }
        if (sum==x) {
            System.out.println("YOUR NUMBER IS A PERFECT NUMBER");
        }
        else{
            System.out.println("your numbet is not a perfect number");
        }
    }

    public static void main(String[] args) {
        faundperfect(6);
    }
}
