public class Professor extends Pessoa {
    private String formacao;
    private byte qntDisciplina;
    private byte tempoServico;

    public Professor(String cpf, String formacao) {
        super(cpf);
        this.formacao = formacao;
    }

    public Professor(String cpf) {
        super(cpf);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public byte getQntDisciplina() {
        return qntDisciplina;
    }

    public void setQntDisciplina(byte qntDisciplina) {
        this.qntDisciplina = qntDisciplina;
    }

    public byte getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(byte tempoServico) {
        this.tempoServico = tempoServico;
    }

    @Override
    double calcularRemuneracao() {
        if (this.tempoServico < 3){
            return 1000;
        }else{
            return 2000;
        }
    }

    public String toString(){
        return super.toString()+"Formação: "+getFormacao()+"\n"+
                "Quantidade de disciplina: "+getQntDisciplina()+"\n Remuneração extra: R$"+calcularRemuneracao();
    }
}