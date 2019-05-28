package hash;

public class Hash {
  
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.create();
        h.inserir(50,9);
        h.inserir(50,1);
        h.inserir(50,10);
        h.inserir(50,6);
        h.inserir(50,8);
        h.inserir(50,5);      
        h.exibeFileira(50);
        //1 - verificar inserir no final
        //2 - verificar exibir
        //3 - adicionar cont ao comparar na inserção(quando estiver percorrendo a lista)
        //4 - fazer o loop de 100 vezes
        //5 - retornar os 3 menores conts
        
    }
    
}
