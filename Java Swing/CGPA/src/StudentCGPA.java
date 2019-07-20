import java.util.Scanner;

public class StudentCGPA {
	
	public static void main(String[] args) {
		
	
		String grade = "";
		double garadeValue =0;
		
		double credit1;
		double credit2;
		double credit3;
		double credit4;
		double totalCredits =0;
		
		double totalPointsOfSubject1 =0;
		double totalPointsOfSubject2 =0;
		double totalPointsOfSubject3 =0;
		double totalPointsOfSubjet4 =0;
		double totalPointsOfSubjects =0;
		
		double cgpa;
		
		Scanner input = new Scanner(System.in);
		//For totalPointsOfSubject1
		
		System.out.println("Please enter the number of credits of the totalPointsOfSubject1 :(A number )");
		credit1 =input.nextDouble();
		System.out.println("Please enter your grades for the the totalPointsOfSubject1 (Capital Letters such as A, B+,C-)");
		grade =input.next();
		
		if(grade.equals("A+"))
			garadeValue =4.0;
		else if(grade.equals("A"))
			garadeValue =3.67;
		else if(grade.equals("B+"))
			garadeValue =3.33;
		else if(grade.equals("B"))
			garadeValue =3.00;
		
		else if(grade.equals("B-"))
			garadeValue =2.67;
		else if(grade.equals("C+"))
			garadeValue =2.33;
		else if(grade.equals("C"))
			garadeValue =2.00;
		else if(grade.equals("D+"))
			garadeValue =1.33;
		else if(grade.equals("B+"))
			garadeValue =1.00;
		
		else if(grade.equals("F"))
			garadeValue =0;
		
		else if(grade.equals("FX"))
			garadeValue =0;
		else
			System.out.println("Invalid grade");
		totalPointsOfSubject1 =garadeValue * credit1;
		
		// For totalPointsOfSubject2
		
		System.out.println("Please enter the number credits of the the totalPointsOfSubject2 :(A number )");
		credit2 =input.nextDouble();
		System.out.println("Please enter your grades for the the totalPointsOfSubject2 (Capital Letters such as A, B+,C-)");
		grade =input.next();
		
		if(grade.equals("A+"))
			garadeValue =4.0;
		else if(grade.equals("A"))
			garadeValue =3.67;
		else if(grade.equals("B+"))
			garadeValue =3.33;
		else if(grade.equals("B"))
			garadeValue =3.00;
		
		else if(grade.equals("B-"))
			garadeValue =2.67;
		else if(grade.equals("C+"))
			garadeValue =2.33;
		else if(grade.equals("C"))
			garadeValue =2.00;
		else if(grade.equals("D+"))
			garadeValue =1.33;
		else if(grade.equals("B+"))
			garadeValue =1.00;
		
		else if(grade.equals("F"))
			garadeValue =0;
		
		else if(grade.equals("FX"))
			garadeValue =0;
		else
			System.out.println("Invalid grade");
		totalPointsOfSubject2 =garadeValue * credit2;
		
		//For totalPointsOfSubject2
		
		System.out.println("Please enter the number credits of the the totalPointsOfSubject3 :(A number )");
		credit3 =input.nextDouble();
		System.out.println("Please enter your grades for the the totalPointsOfSubject3 (Capital Letters such as A, B+,C-)");
		grade =input.next();
		
		if(grade.equals("A+"))
			garadeValue =4.0;
		else if(grade.equals("A"))
			garadeValue =3.67;
		else if(grade.equals("B+"))
			garadeValue =3.33;
		else if(grade.equals("B"))
			garadeValue =3.00;
		
		else if(grade.equals("B-"))
			garadeValue =2.67;
		else if(grade.equals("C+"))
			garadeValue =2.33;
		else if(grade.equals("C"))
			garadeValue =2.00;
		else if(grade.equals("D+"))
			garadeValue =1.33;
		else if(grade.equals("B+"))
			garadeValue =1.00;
		
		else if(grade.equals("F"))
			garadeValue =0;
		
		else if(grade.equals("FX"))
			garadeValue =0;
		else
			System.out.println("Invalid grade");
		totalPointsOfSubject3 =garadeValue * credit3;
		
		// For totalPointsOfSubject4
		
		System.out.println("Please enter the number credits of the the totalPointsOfSubject4 :( a number ) ");
		credit4 =input.nextDouble();
		System.out.println("Please enter your grades for the the totalPointsOfSubject4 (Capital Letters such as A, B+,C-)");
		grade =input.next();
		
		if(grade.equals("A+"))
			garadeValue =4.0;
		else if(grade.equals("A"))
			garadeValue =3.67;
		else if(grade.equals("B+"))
			garadeValue =3.33;
		else if(grade.equals("B"))
			garadeValue =3.00;
		
		else if(grade.equals("B-"))
			garadeValue =2.67;
		else if(grade.equals("C+"))
			garadeValue =2.33;
		else if(grade.equals("C"))
			garadeValue =2.00;
		else if(grade.equals("D+"))
			garadeValue =1.33;
		else if(grade.equals("B+"))
			garadeValue =1.00;
		
		else if(grade.equals("F"))
			garadeValue =0;
		
		else if(grade.equals("FX"))
			garadeValue =0;
		else
			System.out.println("Invalid grade");
		totalPointsOfSubjet4 =garadeValue * credit4;
		
		
		totalPointsOfSubjects =totalPointsOfSubject1+totalPointsOfSubject2+totalPointsOfSubject3+totalPointsOfSubjet4;
		totalCredits =credit1+credit2+credit3+credit4;
		cgpa =totalPointsOfSubjects /totalCredits;
		System.out.println("Your CGPA is :"+String.format("%.2f", cgpa));
		

	}

}
