import java.util.Scanner;
public class TestTesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Testo testo = new Testo("Autore", "Titolo", "Contenuto del testo");
        String controlloContenuto = testo.getContenuto();
        String contenutoCensurato = "";
        for (int i = 0; i<controlloContenuto.length(); i++) {
            if (i<=controlloContenuto.length()-9&&controlloContenuto.substring(i,i+9).equalsIgnoreCase("contenuto")) {
                contenutoCensurato += "*********";
                i += 8;
            } else {
                contenutoCensurato += controlloContenuto.charAt(i);
            }
        }
        System.out.println("Contenuto originale: " + controlloContenuto);
        System.out.println("Contenuto censurato: " + contenutoCensurato);
    }
}