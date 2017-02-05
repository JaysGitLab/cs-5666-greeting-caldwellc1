public class Hello {
    public static void main(String[] args){
        if(args.length == 1){
            System.out.println("Hello, " + args[0].substring(0,1).toUpperCase() + args[0].substring(1));
        }
        else if(args.length == 3 && args[0].equals("-me")){
            System.out.println("Hello, " + args[2].substring(0,1).toUpperCase() + args[2].substring(1));
            String programName = args[1];
        }
        else{
            System.out.println("Hello, Cydney");
        }
    }
}
