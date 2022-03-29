public class Englobante {
    private Interne interne = new Interne();
    private int i= 5;
    private int k= 3;
    public void afficher(){
        System.out.println("i : "+ i + " K de la classe globante " + k);
    }
    public class Interne{
        private int k=i;
        public void afficher(){
            System.out.println(" k de la classe interne "  + k);
            Englobante.this.afficher();
        }
        public static void teststatic(){
            System.out.println("testing a static class in an innner class");
        }
    }

    public static void main(String[] args) {
        Englobante englobante = new Englobante();
        Englobante.Interne interne = englobante.new Interne();
        englobante.afficher();
        interne.afficher();
    }
}
