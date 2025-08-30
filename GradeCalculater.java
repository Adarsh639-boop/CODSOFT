import java.util.Scanner;
public class GradeCalculater {
    public static void main(String[] args){
        Scanner ac=new Scanner(System.in);
       int numSub=5;
        double[] marks = new double[numSub];
        double totalMarks = 0;
        for(int i=0;i<numSub;i++){
            System.out.println("Enter obtaind marks in subject " + (i+1)+":");
            marks[i]=ac.nextDouble();
            totalMarks += marks[i];
        }
        double averagePercentage=totalMarks/numSub;
        String grade;
        if(averagePercentage>=90){
            grade="A+";
        }else if(averagePercentage>=80) {
            grade="A";
        }else if(averagePercentage>=70){
            grade="B";
        }else if(averagePercentage>=60){
            grade="C";
        }else if (averagePercentage>=50) {
            grade="D";
        }else{
            grade="F";
        }
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage is:"+averagePercentage);
        System.out.println("Grade is:"+grade);
    }
}
