public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        salary += 200;
        System.out.println(salary);
        salary  = salary -50;
        System.out.println(salary);
        salary = salary + (30*2) - 45;
        System.out.println(salary);
        //actualizando cadenas de texto
        String employeeName = "Dieter Prado";
        employeeName = employeeName + " Prado Lumbreras";
        System.out.println("Tu nombre es: " + employeeName);
    }
}
