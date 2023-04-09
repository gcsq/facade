package facade;

public class Combo {
	private Hamburguer hamburguer = new Hamburguer();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();

    public void Combo_Master(){

        hamburguer.setGramas(300);
        sobremesa.setTamanho("Medio");
        bebida.setML(350);

        System.out.println("Hamburguer de " + hamburguer.getGramas() + " Gramas");
        System.out.println("Tamanho da Sobremesa " + sobremesa.getTamanho());
        System.out.println("Bebida: " + bebida.getML() + "Ml");
    }

    public void Super_Combo(){

        hamburguer.setGramas(500);
        sobremesa.setTamanho("Grande");
        bebida.setML(600);

        System.out.println("Hamburguer de " + hamburguer.getGramas() + "Gramas");
        System.out.println("Tamanho Sobremesa: " + sobremesa.getTamanho());
        System.out.println("Bebida: " + bebida.getML() + "Ml");
    }
}
