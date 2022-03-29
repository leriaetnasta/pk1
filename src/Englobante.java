public class Englobante {
    private int i= 5;
    public void afficher(){
        System.out.println("i : "+ i);
    }
    public class Interne{
        private int k=i;
        public void afficher(){
            System.out.println(this);
            System.out.println(Englobante.this);
        }
    }

    public static void main(String[] args) {
        Englobante englobante = new Englobante();
        Englobante.Interne interne = englobante.new Interne();
        interne.afficher();
    }
}
