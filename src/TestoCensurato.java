public class TestoCensurato extends Testo{
    public String parolaProibita;
    public void setParolaProibita(String parolaProibita){
        this.parolaProibita=parolaProibita;
    }
    public String getParolaProibita(){
        return parolaProibita;
    }
    public TestoCensurato(String autore,String titolo,String contenuto,String parolaProibita){
        super(autore, titolo, contenuto);
        this.parolaProibita=parolaProibita;
    }
    public String toString(){
        return "La parola proibita è: "+parolaProibita;
    }
}