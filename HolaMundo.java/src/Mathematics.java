public class Mathematics {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // devuelve hacia arriba
        System.out.println(Math.ceil(x));
        //devuelve hacia abajo
        System.out.println(Math.floor(x));
        //devuelve numero elevado a otro numero
        System.out.println(Math.pow(x,y));
        //devuelve el numero mayor
        System.out.println(Math.max(x,y));
        //devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));
        //area de un circulo
        System.out.println(Math.PI * Math.pow(y,2));
        //area de una esfera
        System.out.println(4 * Math.PI * Math.pow(y,2));
        //volulmen de una esfera
        System.out.println(Math.PI * (4/3) * Math.pow(y,3));
    }
}
