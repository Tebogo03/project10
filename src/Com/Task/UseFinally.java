package Com.Task;

public class UseFinally {

    public static void generateException(int a){
        int b;
        int number[]=new int[2];
        System.out.println("Input value " + a);
        try {
            switch (a){
                case 0: b=10/a;break;
                case 1: number[5] =9;break;
                case 2: return;
            }
        }
        catch (ArithmeticException e){
            System.out.println("you cannot divide by zero");
            return;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is n such index in the array");
        }
        finally {
            System.out.println("Have a good day ");

        }
    }
}
class FinallyDemo{
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            UseFinally.generateException(i);
            System.out.println();
        }
    }
}
