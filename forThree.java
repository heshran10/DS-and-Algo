

import java.util.Scanner;

public class forThree {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = 0;

     int i =1;
     while (i<=n) {
        sum += i;
        i++;
     }
     System.out.println(sum);
    }
}

// Commit timestamp: 2025-05-11 19:19:00