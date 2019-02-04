import java.util.Scanner;

class Tamagotchi_vt{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Tamagotchi bichoVirtual = new Tamagotchi();

			//MENU QUE INICIA O JOGO
			System.out.println("----------------------------------");
			System.out.println("| E:20 / F:10 / L:15 / D:0 / I:0 |");
			System.out.println("----------------------------------");
			System.out.println("|   Bem vindo ao tamagotchi!     |");
			System.out.println("----------------------------------");
			System.out.println("|  Vamos comecar a brincar?      |");
			System.out.println("|   para brincar tecle 1         |");
			System.out.println("----------------------------------");
			int acao = sc.nextInt(); 

		if (acao == 1){

			bichoVirtual.Brincar();	

			//MENU DE ACOES DO JOGO
			System.out.println("-------------------------------------");
			System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
			System.out.println("-------------------------------------");
			System.out.println("|1 - Comer                           |");
			System.out.println("|2 - Dormir                          |");
			System.out.println("|3 - Tomar Banho                     |");
			System.out.println("|4 - Brincar                         |");
			System.out.println("-------------------------------------");
			int op = sc.nextInt();

			//LEITOR DE ACAO DO JOGO
			do{	
			 	op = sc.nextInt();

			//ALIMENTAR TAMAGOTCHI
			if(op == 1){

				bichoVirtual.Comer();

			System.out.println("-------------------------------------");
			System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
			System.out.println("-------------------------------------");

				if(bichoVirtual.comida == 10){

					bichoVirtual.comida = bichoVirtual.comida+0;

			System.out.println("-------------------------------------");
			System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
			System.out.println("-------------------------------------");
				}

			} 

			//ACAO DE DORMIR
			if (op == 2){

				if(bichoVirtual.energia <= 15){

				bichoVirtual.Dormir();

			System.out.println("-------------------------------------");
			System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
			System.out.println("-------------------------------------");

				} else {

					System.out.println("Seu bichinho ainda possui muita energia!");
				}

			} 

			//TOMAR BANHO
			if (op == 3){

				bichoVirtual.Banho();

			System.out.println("-------------------------------------");
			System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
			System.out.println("-------------------------------------");

			}	
			//BRINCAR
			if (op == 4){

				bichoVirtual.Brincar();

			System.out.println("-------------------------------------");
			System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
			System.out.println("-------------------------------------");

			}
			//CASO EM QUE O TAMAGOTCHI MORRE
			if(bichoVirtual.energia == 0 || bichoVirtual.comida == 0|| bichoVirtual.limpeza==0){

				System.out.println("TAMAGOTCHI MORREU!");
				break;
			}

			//AVISO QUE O TAMAGOTCHI ESTA SEM ENERGIA
			if (bichoVirtual.energia <= 3){

				System.out.println("-------------------------------------");
				System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
				System.out.println("-------------------------------------");

				System.out.println("ENERGIA BAIXA. TAMAGOTCHI PRECISA DORMIR!");

			}

			//AVISO QUE O TAMAGOTCHI ESTA COM FOME
			if (bichoVirtual.comida <= 3){

				System.out.println("-------------------------------------");
				System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
				System.out.println("-------------------------------------");

				System.out.println("COMIDA BAIXA. TAMAGOTCHI PRECISA COMER!");

			}

			//AVISO QUE O TAMAGOTCHI ESTA SUJO
			if (bichoVirtual.limpeza <= 3){

				System.out.println("-------------------------------------");
				System.out.println("|E: " + bichoVirtual.energia + "/20 F: "+bichoVirtual.comida+"/10 L: "+bichoVirtual.limpeza+"/15 D: "+bichoVirtual.diamante+ " I: "+bichoVirtual.idade+ "|");
				System.out.println("-------------------------------------");

				System.out.println("TAMAGOTCHI ESTA SUJO. PRECISA TOMAR BANHO!");

			}

		}while(op !=5);
			
		}
	 
	}	
}