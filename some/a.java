class a{
	public static void main(String args[]){
		int i,sum=0;
		for (i=0; i<args.length;i++ ) {
			sum+=Integer.parseInt(args[i]);
		}
		int average = sum / args.length;
    
    System.out.println("Average of " + args.length + " command line arguments is " + average);
	}
}