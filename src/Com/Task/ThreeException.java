package Com.Task;

class  ExceptionA extends Exception{
    public ExceptionA(String message) {
        super(message);
    }
}
class  ExceptionB extends Exception{
    public ExceptionB(String message) {
        super(message);
    }
}
class  ExceptionC extends Exception{
    public ExceptionC(String message){
        super(message);
    }
}

public class ThreeException {
    public static void f(int a) throws ExceptionA,ExceptionB,ExceptionC{
        if (a < 0) throw new  ExceptionA("a < 0");
        if (a == 0) throw new  ExceptionB("a == 0");
        if (a > 0) throw new  ExceptionC("a > 0");

    }

    public static void main(String[] args) {
        try {
            f(-1);
        }
        catch (ExceptionA | ExceptionB | ExceptionC e ){
            e.printStackTrace(System.out);

        }
    }
}
