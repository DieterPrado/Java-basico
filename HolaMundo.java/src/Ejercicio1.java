public class Ejercicio1 {
    public static void main(String[] args) {
        String father = "Enrique";
        String mother = "Ana";
        String brother = "Emmanuel";
        int fatherAge = 48;
        int motherAge = 46;
        int brotherAge = 14;

        System.out.println("Les presento a mi familia: Mi padre: " + father + " Mi madre: " + mother + " y mi hermano: " + brother);
        System.out.println("Sus edades son: " + fatherAge + ", " + motherAge + " y " + brotherAge + " respectivamente." );

        //Ejercicio 2, casteo
        //Es un implicito y conversion
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        //Es implicito exactitud
        int i = 250;
        long iL = i;
        System.out.println(iL);
        //Es explicito estimacion
        short iS = (short) iL;
        System.out.println(iS);

        //
        double d = 301.067;
        long dLong = (long) d;
        System.out.println(dLong);

        //
        int i2 = 100;
        float i2f = (float) i2 + (float) 5000.66;
        System.out.println(i2f);

        //
        int i3 = 737;
        byte i3m = (byte) (i3 * 100);
        System.out.println(i3m);

        //
        double d2 = 298.638;
        d2 /= 25;
        long d2d = (long) d2;
        System.out.println(d2d);

    }
}
