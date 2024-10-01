class Rectangle{
	double l,b;

	Rectangle(){
		l=10;
		b=5;
	}

	Rectangle(int length,int breadth){
		l=length;
		b=breadth;
	}

    void area(){
		double a=l*b;
		System.out.println(a);
	
	}

	void perimeter(){
		double p=2*(l+b);
		System.out.println(p);
	}

	public static void main(String[] args) {
		Rectangle R1=new Rectangle();
		R1.area();
        R1.perimeter();

        Rectangle R2=new Rectangle(1,5);
        R2.area();
        R2.perimeter();
	  
	}
}