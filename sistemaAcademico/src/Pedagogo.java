public class Pedagogo extends Pessoa {
    private String registro;

    public Pedagogo(String cpf) {
        super(cpf);
    }

    @Override
    double calcularRemuneracao() {
        return 0;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String toString(){
        return super.toString()+"Registro: "+getRegistro()+"\n Remuneração extra: R$"+calcularRemuneracao();
    }
}