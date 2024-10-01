class average{
    public static void main(String[] args) {
        int sum=0;
        for(String arg: args)
                sum+=Integer.parseInt(arg);
        float avg=(float)sum/args.length;
        System.out.println("Average of the numbers are "+avg);
    }
        
}
