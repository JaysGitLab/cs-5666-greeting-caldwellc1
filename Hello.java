public class Hello {
    public static void main(String[] args){
        if(args.length == 1){
            System.out.println("Hello, " + args[0].substring(0,1).toUpperCase() + args[0].substring(1));
        }
        else{
            System.out.println("Hello, Cydney");
        }
    }
}
