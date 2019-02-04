class Tamagotchi {

//INICIO DOS ATRIBUTOS
int comida = 10;
int energia = 20;
int limpeza = 15;
int diamante = 0;
int idade = 0;
	
	//ATUALIZACAO DOS DADOS QUANDO O TAMAGOTCHI BRINCA
	void Brincar (){
   
    energia -= 2;
    comida -= 1;
    limpeza -= 3;
    idade += 1;
    diamante +=1;

	}

	//ATUALIZACAO DOS DADOS QUANDO O TAMAGOTCHI COME
	void Comer (){

	energia -= 1;
	limpeza -= 1;
	comida += 4;
	idade += 1;

	}

	//ATUALIZACAO DOS DADOS QUANDO O TAMAGOTCHI DORME
	void Dormir(){

		comida -= 1;
		idade = idade + (20 - energia);
		energia = (20 - energia) + energia;
		
	}

	//ATUALIZACAO DOS DADOS QUANDO O TAMAGOTCHI TOMA BANHO
	void Banho(){

		comida -= 1;
		energia -= 3;
		idade += 2;
		limpeza = (15 - limpeza) + limpeza;
	}
}