class Address{
	String city;
	String state;
	int pinCode;
	String line1;
	String line2; 
	Address(){
		city= " ";
		state= " ";
		pinCode=0;
		line1= " ";
		line2= " ";
		
	}
	Address(String city,String state,int pincode, String line1,String line2){
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
		this.line1=line1;
		this.line2=line2;
		
	}
	void DisplayAddress(){
		System.out.println(city);
		System.out.println(state);
		System.out.println(pinCode);
		System.out.println(line1);
		System.out.println(line2);
		
	}

}