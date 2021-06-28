public class Increment {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives -1;

        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        int gift = 100 + lives++;
        System.out.println(gift);

        //si se pone como prefijo entonces el cambio es global
    }
}
