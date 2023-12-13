public class Tecnico extends Pessoa {
    private String cargo;
    private String funcao;
    private String anoEntrada;

    public Tecnico(String cpf) {
        super(cpf);
    }

    @Override
    double calcularRemuneracao() {
        return 0;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(String anoEntrada) {
        this.anoEntrada = anoEntrada;
    }
    public String toString() {
        return super.toString()+"Cargo: "+getCargo()+"\n"+
                "Função: "+getFuncao()+"\n"+
                "Entrada: "+getAnoEntrada()+"\n Remuneração extra: R$"+calcularRemuneracao();
    }
}