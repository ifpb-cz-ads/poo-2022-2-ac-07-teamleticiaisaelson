public class Computador extends Equipamento {
    private int ram;
    private String os;
    public Computador(String id, String marca) {
        super(id, "Computador", marca);
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getOs() {
        return os;
    }
    public String getInfoComp() {
        return "Id: " + super.getId() +
                "\nTipo: " + super.getTipo() +
                "\nMarca: " + super.getMarca() +
                "\nMemoria RAM: " + ram + "GB" +
                "\nSistema Operacional: " + os;
    }
}
