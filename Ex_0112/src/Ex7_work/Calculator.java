package Ex7_work;

public class Calculator {
	//public void getResult( int n1, int n2, String op )
	public void getResult (String op, int...n){
		
		String result = "";
		
		
		switch ( op ) {// +, -, *, /
		case "+" :
			//result = n[0] +"+"+ n[2] + "=" +(n[0 + n[1]]);
			result = String.format("%d + %d = %d", n[0], n[1], n[0]+n[1]);
			break;

		case "-" :
			//result = n[0] +"+"+ n[2] + "=" +(n[0 + n[1]]);
			result = String.format("%d - %d = %d", n[0], n[1], n[0]-n[1]);
			break;
			
		case "*" :
			//result = n[0] +"+"+ n[2] + "=" +(n[0 + n[1]]);
			result = String.format("%d * %d = %d", n[0], n[1], n[0]*n[1]);
			break;
			
		case "/" :
			//result = n[0] +"+"+ n[2] + "=" +(n[0 + n[1]]);
			result = String.format("%d / %d = %d", n[0], n[1], n[0]/n[1]);
			break;
			
		}//switch
		
		System.out.println(result);
		
	}//getResult
		
	
	
}








