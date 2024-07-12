import java.awt.Toolkit;

class Programa {
    public static void main(String[] args) throws InterruptedException {

        Toolkit.getDefaultToolkit().beep();

        System.out.println("Atencao! Ta na hora de beber agua!!");

        Thread.sleep(3000);
    }
}