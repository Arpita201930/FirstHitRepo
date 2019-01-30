class PrimeCheck {
	public static void main(String [] args){
		int num =33333;
		boolean flag =true;
		for(int i =2; i<num; i++){
			if(i%2==0){
				flag =false;
				break;				
				
			}
			else if(flag){
				System.out.println("prime");
				
			}
			else
			{
				System.out.println("NOt prime");
			}
		}
	}
}