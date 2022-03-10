
public class Assigmnet2 {
	
	public int sum(int a1,int a2) {
		int a3=a1+a2;
	    return a3;
	}
	public int sub(int b1,int b2)
	{
		int b3=b1-b2;
		return b3;
	}
	
	public int mul(int m1,int m2)
	{
		int m3=m1*m2;
		return m3;
	}
	public int div(int d1,int d2)
	{
		int d3=d1/d2;
		return d3;
	}	
	//https://github.com/deeksha2312/deeksha-repository.git

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Solve this aithmetic expression(((10*2)-2)*2)+2)/2))");
		
		Assigmnet2 obj =new Assigmnet2();
		int multiResult=obj.mul(10,2);
		System.out.println("Result of multiplication is:"+multiResult);
		//
		int subResult=obj.sub(multiResult,2);
		System.out.println("Result of sub is:"+subResult);
		//
		int multiResult2=obj.mul( subResult,2);
		System.out.println("Result of multi is:"+multiResult2);
		//
		int sumResult=obj.sum(multiResult2,2);
		System.out.println("Result of  is:"+sumResult);
        obj.div(sumResult,2);
	}

}
