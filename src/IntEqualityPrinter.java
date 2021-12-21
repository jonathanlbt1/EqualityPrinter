public class IntEqualityPrinter {
    public static void printEqual(int x, int y, int w){
        if (x < 0 || y < 0 || w < 0){
            System.out.println("Invalid Value");
        }else if (x == y && y == w){
            System.out.println("All numbers are equal");
        }else if(x != y && y != w && x != w){
            System.out.println("All numbers are different");
        } else{
            System.out.println("Neither all are equal or different");
        }
    }
}
