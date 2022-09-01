package enlaces;

public class Main {
    public static void main (String args[]){
        AgregadorEnlaces agregadorEnlaces = new AgregadorEnlaces("youtube.com");
        agregadorEnlaces.annadirClics(10);
        agregadorEnlaces.annadirClics(70);

        agregadorEnlaces.imprimir();
        }
        
}
