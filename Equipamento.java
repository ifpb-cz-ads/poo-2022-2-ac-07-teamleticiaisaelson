
ppublic class Equipamento {
    private boolean ligado = false;
    private String id;
    private String tipo;
    private String marca;

    public Equipamento(String id, String tipo, String marca) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
    }
    public void ligar() {
        ligado = true;
    }
    public void desligar() {
        ligado = false;
    }
    public boolean isLigado() {
        return ligado;
    }
    public String getMarca() {
        return marca;
    }
    public String getId() {
        return id;
    }
    public String getTipo() {
        return tipo;
    }
    public String getInfo() {
        return "Id: " + id +
                "\nTipo: " + tipo +
                "\nMarca: " + marca;
    }
}
