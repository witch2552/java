class Time{
	  int h,m,s;
      Time(){
        s = 105;
      }
    Time(int h){
    	this.h=h;
    	m=0;
    }
    Time(int h,int m){
    	this.h=h;
    	this.m=m;
    }
    Time(int h,int m,int s){
	 this.h=h;
	 this.m=m;
	 this.s=s;
  }
  static void printTime(Time T1,Time T2){
  	System.out.println(T1.h+":"+T1.m+":"+T1.s);
  		System.out.println(T2.h+":"+T2.m+":"+T2.s);
  }
  public static void main(String[] args) {
  	Time t1=new Time();
  	Time t2=new Time(3,20);
  	printTime(t1,t2);

    classname objectname = new classname();
  }
}