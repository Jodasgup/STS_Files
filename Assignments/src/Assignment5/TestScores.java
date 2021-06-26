package Assignment5;

import java.util.Scanner;

public class TestScores
{
public static void main(String[] args)
{
double test1, test2, test3, averageScore;
char letterGrade = 0;

Scanner sc = new Scanner(System.in);

test1 = sc.nextDouble();
test2 = sc.nextDouble();
test3 = sc.nextDouble();
averageScore = (test1 + test2 + test3)/3;

System.out.print("Enter first test score");
System.out.print("Enter second test score");
System.out.print("Enter third test score");

if (averageScore >= 90 && averageScore <= 100)
{
letterGrade = 'A';
}
else if (averageScore >= 80 && averageScore <= 89)
{
letterGrade = 'B';
}
else if (averageScore >= 70 && averageScore <= 79)
{
letterGrade = 'C';
}
else if (averageScore >= 60 && averageScore <= 69)
{
letterGrade = 'D';
}
else if (averageScore < 60)
{
letterGrade = 'F';
}

System.out.println("Average score: " + averageScore);
System.out.println("Letter grade: " + letterGrade);

sc.close();
}
}
