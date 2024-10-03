import java.util.Scanner;
	public class IT24102706Lab7Q1A {
		public static void main(String[] args) {
      		Scanner input = new Scanner(System.in);

		int mark,sum,count;
		double average;
		sum = 0;
		average = 0;
		System.out.println(" Enter marks for four subjects: ");

		count=1;	
		while( count <=4 ){
        	System.out.print("Enter Subject mark " + count + ": ");
		mark= input.nextInt();
		
		if(!(mark>=0&& mark<=100)){
			System.out.println("Invalid input.Marks must between 0 and 100.");
			continue;
			}


		count = count + 1;
		sum+= mark;
                }
		average=sum/4;
		String grade = "";
                      
		
		if(average <= 100 && average >=75){
			grade = "distinction ";
		}
		else if (average > 50 ){
			grade = " Credit ";
		}
		else {
			grade = " fail";
		}
            	System.out.println("average is:"+average);
	    	System.out.println("overall grade is:"+ grade);

		
              }
        }