public class Roupa {
    private String tamanho;
    private String tipo;
    private String eUsada;
    private String importada;

    private int contador = 0;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Roupa(String tamanho, String tipo, String eNovo, String importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eUsada = eNovo;
        this.importada = importada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String geteNovo() {
        return eUsada;
    }

    public void seteNovo(String eNovo) {
        this.eUsada = eNovo;
    }

    public String getImportada() {
        return importada;
    }

    public void setImportada(String importada) {
        this.importada = importada;
    }
}
