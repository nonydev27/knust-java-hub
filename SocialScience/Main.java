

package SocialScience;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*QUESTION 7*
        A Social Science lecturer marked her mid-semester and end-of-semester examination scripts
         each over 100 instead of 30 and 70 respectively. After marking, she consulted you, a DIT 2 student, 
         to develop a program in JAVA to compute the final marks of the students, and also indicate the appropriate letter 
         grade obtained by each of the students using the grading system of KNUST. In addition, she asked that your program ought to 
         determine how many students scored each of the letter grades.*/   

         /*Your program should output the following:

    The final score of each student (calculated by scaling mid-sem to 30% and exams to 70%).

    The grade obtained by each student based on the KNUST grading system.

    The frequency of occurrence of each grade (how many As, Bs, etc.).
a.util.*;
    The average score of the class.

    The maximum and the minimum scores.

Note for calculation: Since the lecturer marked both over 100, you will need to apply the formula:
Final Mark=(Midsem×0.3)+(Exams×0.7) */

      System.out.println("===== STUDENT GRADING SYSTEM =====");
       
      double midsemTotal = 0.30;
      double examTotal = 0.70;

      int[] midsemScores = {65, 48, 22, 32, 80, 12, 45, 25, 33, 67, 23, 45, 56, 34, 81}; 
      int[] examScores = {78, 54, 90, 32, 66, 60, 48, 65, 45, 56, 33, 45, 67, 90, 67};
      int[] finalScores ;
      int[] midsemScoresNew;


      //the for loop below is going to iterate in all midsemScores and then compute it as 30% in a new array
      for(int i=0; i<midsemScores.length; i++){
        midsemScoresNew = midsemScores[i] * midsemTotal;
      }

    }
}
