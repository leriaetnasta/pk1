import java.util.Arrays;

public class Sequence {
    private int[] array;
    public class SubSequence{
         // la classe interne qui permet de remplir le tab
        public SubSequence(int lenght){
            if(lenght<0) throw new IllegalArgumentException("La taille doit etre strictement positive");
            array = new int[lenght]; // le tableau sera creee mais va etre vide
            for (int i = 0; i < lenght; i++) {
                array[i]= (int)Math.random()*1000; // REMPLIR LE TABLEAU AVEC DES VALEURS ALEATOIRE

            }

        }
        public void afficher(){
            System.out.println(Arrays.toString(array));
        }
        public int intAt(int index){
            if (index<0 || index >= array.length) throw new IllegalArgumentException();
            return array[index];
        }


    }
    public static void main(String[] args) {
        Sequence sequence= new Sequence();
        Sequence.SubSequence subSequence= sequence.new SubSequence(4);
        subSequence.afficher();
        System.out.println(subSequence.intAt(2));
    }
}
