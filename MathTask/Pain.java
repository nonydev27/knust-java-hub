package MathTask;

public class Pain {
  
    public static void main(String[] args) {
        int n = 10;
        double sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        double avg = sum / n;

        double sqSum = 0;
        for (int i = 1; i <= n; i++) sqSum += Math.pow(i - avg, 2);
        double sd = Math.sqrt(sqSum / n);

        long factorial = 1;
        for (int i = 1; i <= (int)sd; i++) factorial *= i;

        System.out.println("Average: " + avg);
        System.out.println("SD: " + sd);
        System.out.println("Factorial of (int)SD: " + factorial);
    }
}

