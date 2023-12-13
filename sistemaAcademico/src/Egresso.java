public class Egresso extends Pessoa {
    //Escolhi criar uma classe para as pessoas que já se formaram, ou seja, alunos que já sairam da instuição
    private String anoInicio;
    private String anoConclusao;
    private int anosGraduacao;
    private String nomeCurso;

    public Egresso(String cpf) {
        super(cpf);
    }

    @Override
    double calcularRemuneracao() {
        return 0;
    }

    public String getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(String anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }
    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public int getAnosGraduacao() {
        return anosGraduacao;
    }
    public void setAnosGraduacao(int anosGraduacao) {
        this.anosGraduacao = anosGraduacao;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String toString(){
        return super.toString()+"Ano de inicio: "+getAnoInicio()+"\n"+
                "Ano de conclusão: "+getAnoConclusao()+"\n"+
                "Anos para se graduar: "+getAnosGraduacao()+"\n"+
                "Nome do curso: "+getNomeCurso()+"\n Remuneração extra: R$"+calcularRemuneracao();
    }
}