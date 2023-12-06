public class Pedagogo extends Pessoa {
    private String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String toString(){
        return super.toString()+"Registro: "+getRegistro();
    }
}