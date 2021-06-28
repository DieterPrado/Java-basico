public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste light mode");
                break;
            case "Night":
                System.out.println("Seleccinste night mode");
                break;
            case "Blue dark":
                System.out.println("Seleccionaste blue dark");
            case "Dark":
                System.out.println("Seleccionaste Dark mode");
                break;
            default:
                System.out.println("Selecciona una opcion correcta");

        }
    }
}
