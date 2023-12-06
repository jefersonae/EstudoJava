public class Coordenador extends Professor {
    // Escolhi coordenador para representar um coordenador de algum curso que deve ser um professor
    private String anoEntrada;
    private String anoSaida;
    private int qntAno;

    public String getAnoEntrada() {
        return anoEntrada;
    }
    public void setAnoEntrada(String anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public String getAnoSaida() {
        return anoSaida;
    }
    public void setAnoSaida(String anoSaida) {
        this.anoSaida = anoSaida;
    }

    public int getQntAno() {
        return qntAno;
    }
    public void setQntAno(int qntAno) {
        this.qntAno = qntAno;
    }

    public String toString(){
        return super.toString()+"Ano de Entrada: "+getAnoEntrada()+"\n"+
                "Ano Saída: "+getAnoSaida()+"\n"+
                "A quantidade de anos permaceu no cargo foi:"+getQntAno();
    }
}