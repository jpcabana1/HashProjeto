package hash;

public class noHash {
    private int chave;
    private int valor;
    private noHash prox;

    public noHash(int chave, int valor) {
        this.chave = chave;
        this.valor = valor;
        this.prox = null;
    }

    
    public noHash getProx() {
        return prox;
    }
    public void setProx(noHash prox) {
        this.prox = prox;
    }    
    public int getChave() {
        return chave;
    }
    public void setChave(int chave) {
        this.chave = chave;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
