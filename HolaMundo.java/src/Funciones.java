public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        circleArea(y);
        //area de una esfera
        sphereArea(y);
        //volulmen de una esfera
        sphereVolumen(y);

        System.out.println("pesos a dolares: " + convertToDollar(200, "MXN"));
    }
    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public static double sphereArea(double radius){
        return 4 * Math.PI * Math.pow(radius,2);
    }
    public static double sphereVolumen(double radius){
        return (Math.PI * (4/3) * Math.pow(radius,3));
    }


    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency  Tipo de moneda, solo acepta pesos MXN o COP
     * @return Quantity devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
