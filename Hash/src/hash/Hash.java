package hash;

public class Hash {
  
    public static void main(String[] args) {
        int v[] = new int[100];
        HashMap h = new HashMap(); 
        
        for(int i = 0; i < 100; i++){
            h.create();
            for(int j = 0; j < 100000; j++){               
                h.inserir((int)(Math.random() * 50 + 1), (int)(Math.random()* 50 + 1));
            }
            v[i] = h.getQtdColisao();
            h.destroy();           
        }    
        h.bubbleSort(v);    
        System.out.println("Menor N de colisões: ");
        System.out.println("1 - " + v[0]);
        System.out.println("2 - " + v[1]);
        System.out.println("3 - " + v[2]);
  
      
    }
    
}
