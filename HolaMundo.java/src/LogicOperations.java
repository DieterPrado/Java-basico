public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //asignacion
        System.out.println("a es igual a b? ->" + (a == b));
        System.out.println("es a diferente a b? -->" + (a != b));
        // relacionalres
        System.out.println("a es menor a b? ->" + (a < b));
        System.out.println("es a mayor a b? -->" + (a > b));
        System.out.println("a es menor o igual a b? ->" + (a <= b));
        System.out.println("es a mayor o igual a b? -->" + (a >= b));

        if (a == b){
            System.out.println("a y b son iguales");

        }else if((a != b) && (a < b)){
            System.out.println("a y b son diferentes");

        }else if(a < b){
            System.out.println("a es menor que b");

        }else if(a > b){
            System.out.println("a es mayor que b");


        }else if(a >= b){
            System.out.println("a es mayor o igual a b");

        }
    }
}
