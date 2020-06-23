package seleniumLearning;

public class TryCatchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int array[]={2,3,4,5,6,7};
		System.out.println(array[2]);
		}catch (Exception e) {
			e.getMessage();//this will capture what kind of exception occurred 
			e.fillInStackTrace();//this will tell where exactly exception occurred
			
		}
		System.out.println("i have done with my code");

	}

}
