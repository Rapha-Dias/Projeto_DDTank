import java.util.Scanner;
public class DDtank_Evolution2 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        
        //========== Declaração de variáveis =========// início
        String usuario;
        String confirm;
        
        //Medidas para disparo.
	double anguloInicial = 0;
	double velocidadeInicial = 0;
	final double aceleracao = 9.81;
		
	//Medidas com cálculo.
	double alturaMaxima; 
	double tempoTrajeto;
	double alcanceHorizontal;
		
	//Medidas do alvo.
	double distanciaAlvo;
	double tamanhoAlvo;
        //========== Declaração de variáveis ==========// fim
        
        
        //==================== Solicitações ====================// inicio
        //Solicitação do nome de usuário.
        System.out.println("====================== DDTANK EVOLUTION ======================");
        System.out.print("\nAntes de começar, por favor nos diga seu nome de usuário: ");
        usuario = input.nextLine();
        
        //Apresentação dos criadores.
        System.out.println("\n\t============== BEM VINDX " + usuario.toUpperCase() + " ==============");
        System.out.println("\n\t   Algumas informações você precisa saber");

        System.out.println("\n==============================================================");        
        System.out.println("\n\t   DDTANK EVOLUTION FOI DESENVOLVIDO POR: ");
        System.out.println("\n\t    Bianca Gabriel       RA 21493498");
        System.out.println("\t    Enzo Delfante        RA 21497532");
        System.out.println("\t    Giovanna Melchiori   RA 21505242");
        System.out.println("\t    Lucas Albuquerque    RA 21487822");
        System.out.println("\t    Raphael Dias         RA 20433555");
        System.out.println("\n==============================================================");
        System.out.println("\n\t     APERTE 'ENTER' PARA CONTINUAR ");
        confirm = input.nextLine();
        
        //Velocidade do projétil.
        do{
            System.out.println("==============================================================");
            System.out.println("\n\tO jogo consiste em acertar o alvo com um projétil.");
            System.out.println("\tEntão insira os dados e veremos se acertará o alvo.");
            System.out.print("\n\t  QUAL A VELOCIDADE DO PROJÉTIL [ > 0 ]: ");
            velocidadeInicial = input.nextDouble();
            input.nextLine();
            System.out.println("\n==============================================================");
        } while(velocidadeInicial <= 0 );        
        
        //Ângulo do lançador.
        do{
            System.out.print("\n\t QUAL O ÂNGULO DO LANÇADOR [1º - 89º]: ");
            anguloInicial = input.nextDouble();
            input.nextLine();
            System.out.println("\n==============================================================");
        } while(anguloInicial <= 0 || anguloInicial >= 90);       
        
        //Tamanho do Alvo.
        do{
            System.out.print("\n\t    QUAL O TAMANHO DO ALVO [20m - 49m]: ");
            tamanhoAlvo = input.nextDouble();
            input.nextLine();
            System.out.println("\n==============================================================");
        } while(tamanhoAlvo < 20 || tamanhoAlvo >= 50);

        //Distância do Alvo.
        do{
            System.out.print("\n\t    QUAL A DISTÂNCIA DO ALVO [ > 0m ]: ");
            distanciaAlvo = input.nextDouble();
            input.nextLine();
        } while(distanciaAlvo <= 0);
        //==================== Solicitações ====================// fim
        
        
        //===================== Cálculos ======================// inicio
        //Conversão de ângulo para radianos.
        anguloInicial = Math.toRadians(anguloInicial);
        
        //Potêncialização do  seno do ângulo/radianos.
        double senoAnguloPotencia = (Math.sin(anguloInicial) * Math.sin(anguloInicial));
        
        //Potêncialização da velocidade inicial.
        double velocidadePotencia = (velocidadeInicial * velocidadeInicial);
        
        //Verificar se o projétil passou do alvo.
        double passou = distanciaAlvo + tamanhoAlvo;
        
        //Alcance horizontal do projétil.
        alcanceHorizontal = (Math.cos(anguloInicial) * Math.sin(anguloInicial) / aceleracao) * (2 * velocidadePotencia); 
        
        //Tempo do trajeto do projétil.
        tempoTrajeto = (2 * velocidadeInicial) * Math.sin(anguloInicial) / aceleracao;
        
        //Altura máxima do projétil.
        alturaMaxima = (velocidadePotencia * senoAnguloPotencia) / (2 * aceleracao);
        //==================== Cálculos ====================// fim

        
        //=================== Resultados ==================// inicio
        //Impressão de dados solicitados.
        System.out.println("\n========================= RESULTADOS =========================");
        System.out.println("\n\t   Alcance Horizontal = " + alcanceHorizontal);
	System.out.println("\t   Tempo de Trajeto   = " + tempoTrajeto);
	System.out.println("\t   Altura Máxima      = " + alturaMaxima);

        
	//Vertificar se acertou ou errou o alvo
	if(alcanceHorizontal < distanciaAlvo){
            System.out.println("\n\t  Errou, " + usuario + "! O disparo não alcançou o alvo");
	} else if (alcanceHorizontal > passou){
            System.out.println("\n\t   Errou, " + usuario + "! O disparo passou do alvo");
	}else System.out.println("\n\t  Parabéns " + usuario + ", você acertou o alvo");
	//==================== Resultados ====================// fim	
        
    }
}
