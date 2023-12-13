public class Candidato extends Pessoa {
    private String dataConcurso;
    private int codConcurso;
    private int pontuacao;

    public Candidato(String cpf) {
        super(cpf);
    }

    @Override
    double calcularRemuneracao() {
        return 0;
    }

    public String getDataConcurso() {
        return dataConcurso;
    }
    public void setDataConcurso(String dataConcurso) {
        this.dataConcurso = dataConcurso;
    }
    public int getCodconcurso() {return codConcurso;}
    public void setCodConcurso(int codConcurso) {
        this.codConcurso = codConcurso;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String toString() {
        return super.toString()+"Data do Concurso: "+getDataConcurso()+"\n"+
                "Código do Concurso: "+getCodconcurso()+"\n"+
                "Pontuação: "+getPontuacao()+"\n"+"Remuneração extra: R$"+calcularRemuneracao();
    }
}