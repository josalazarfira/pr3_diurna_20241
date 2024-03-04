package co.edu.uniquindio.programacion3.excepciones;

public class MainExcepciones {


    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        int a = 5;
        int b = 0;
        int c = 3;
        Cliente cliente = null;
        try{
            cliente.setNombre("Juan");
        }
//        catch (Exception e){
//            System.out.println("Se ha generado un problema al acceder al objeto cliente "+e.getMessage());
//        }
        catch (ArithmeticException e){
            System.out.println("Se ha generado un problema al realizar la operacion: "+e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Se ha generado un problema al acceder al objeto cliente "+e.getMessage());
            try{
                System.out.println("Valor de C antes de la operacion: "+ c);
                c = a/b;
                System.out.println("Valor de C despues de la operacion: "+ c);
            }catch (NullPointerException e2){
                System.out.println("Se ha generado un problema al acceder al objeto cliente "+e2.getMessage());
            }
        }
        finally{
            System.out.println("Me ejecute si o si");
        }
    }
}
