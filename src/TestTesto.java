import java.util.Scanner;
public class TestTesto {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Testo testo=new Testo("Giuseppe Cruciani","Via Crux","Battaglia contro il politicamente corretto"); //CAMBIARE IL TITOLO POSSIBILMENTE
        TestoCensurato censura=new TestoCensurato("Giuseppe Cruciani","Via Crux","Battaglia contro il politicamente corretto","battaglia");
        String controlloContenuto=testo.getContenuto();
    }
}
