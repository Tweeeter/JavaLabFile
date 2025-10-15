//Q15c Program that illustrates the Creation of simple package.
public class PackageDemo {
    public static void main(String[] args) {
        // Using Calculator from mypackage
        mypackage.Calculator calc = new mypackage.Calculator();
        System.out.println("10 + 5 = " + calc.add(10, 5));
        
        // Using Message from mypackage
        mypackage.Message msg = new mypackage.Message();
        msg.display("Hello from mypackage!");
    }
}