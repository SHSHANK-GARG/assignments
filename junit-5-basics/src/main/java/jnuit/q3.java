package jnuit;


	public class q3 {
	    public Integer withdrawl(Integer withdrawl) throws InsufficientFundsExpcetion {
	    	Integer b=5000;
	                if ((b-withdrawl)<0){
	                throw new InsufficientFundsExpcetion("insufficient balance");
	            }
	            else {
	                System.out.println(b=b-withdrawl);;
	            }
	       return b;
	}
	class  InsufficientFundsExpcetion extends Exception{

		public InsufficientFundsExpcetion(String message) {
			// TODO Auto-generated constructor stub
		}
	}
	}