public class Testo {
    private String autore;
    private String titolo;
    private String contenuto;
    public void setAutore(String autore){
        this.autore=autore;
    }
    public String getAutore(){
        return autore;
    }
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    public String getTitolo(){
        return titolo;
    }
    public void setContenuto(String contenuto){
        this.contenuto=contenuto;
    }
    public String getContenuto(){
        return contenuto;
    }
    public Testo(String autore,String titolo,String contenuto){
        this.autore=autore;
        this.titolo=titolo;
        this.contenuto=contenuto;
    }
    public String toString(){
        return "Titolo del testo: "+titolo+"\n"+
                "Autore del testo: "+autore+"\n"+
                "Contenuto del testo: "+contenuto;
    }
}