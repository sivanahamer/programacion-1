package countdown;

public class Main{
    public static void main(String [] args){
        Blastoff blastoff = new Blastoff();

        blastoff.countdown(10);
        //Se cae con muchos datos
        blastoff.countdown(16000);
    }
}