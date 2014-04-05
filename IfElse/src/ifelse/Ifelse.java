package ifelse;

//Grading System

public class Ifelse {

	public static void main(String[] args) {
		
		int num=7;
		
		if(num>=90){
			System.out.println("A");
		}
		else if(num<90 && num>=80){
			System.out.println("B");
		}
		else if(num<80 && num>=70){
			System.out.println("C");
		}
		else if(num<70 && num>=60){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
		// TODO Auto-generated method stub
		

	}

}
