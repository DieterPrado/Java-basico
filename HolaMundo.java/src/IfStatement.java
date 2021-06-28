public class IfStatement {
    public static void main(String[] args) {
        boolean isBluethoothEnabled = false;
        int filesSent = 3;
        if (isBluethoothEnabled){
            filesSent++;
            System.out.println("Archivo enviado");
            int i = 0;
            i++;
        } else {
            filesSent--;
            System.out.println("Por favor enciende tu bluethoot para inciar la transferencia");
        }

        System.out.println(isBluethoothEnabled);
        System.out.println(filesSent);
    }
}
