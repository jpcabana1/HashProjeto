package hash;

public class Hash {
  
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.create();
        
        for(int i= 0; i < 100000; i++){
            h.inserir((int)(Math.random()* 50 + 1), (int)(Math.random()* 50 + 1));        
        }
        
        System.out.println("\n" + h.getQtdElement());
        
    }
    
}
