package Com.Task;

public class Task1 {


    public static void main(String[] args) {
        Iexception ex = new Iexception();
        try {
            ex.nullPointerException();
        }
        catch (NullPointerException e){
            System.out.println("There is an error ");
            e.printStackTrace();
            e.toString();
        }

    }

}
 class Iexception{
     public void nullPointerException(){
         String a = null;
         System.out.println(a.length());
     }

}
