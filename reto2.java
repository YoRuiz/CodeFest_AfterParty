package Codefest_AfterParty;

import java.time.Period;
import java.util.Date;

public class reto2 {
	public static void main(String args[]){
		laFuncion(23,59,59, 365);
	}
	public static void laFuncion(int horas, int minutos, int segundos, int dias){
		Date periodo = new Date();
		periodo.setSeconds(segundos);
		periodo.setMinutes(minutos);
		periodo.setHours(horas);
		int resultado =0;
		while(!(periodo.getHours()!=0 && periodo.getMinutes()!=0 && periodo.getSeconds()!=0)){
			switch(periodo.toString().charAt(11)){
			case 0:
				resultado+=6;
				break;
			case 1:
				resultado+=2;
				break;
			case 2:
				resultado+=5;
				break;
			case 3:
				resultado+=5;
				break;
			case 4:
				resultado+=4;
				break;
			case 5:
				resultado+=5;
				break;
			case 6:
				resultado+=6;
				break;
			case 7:
				resultado+=3;
				break;
			case 8:
				resultado+=7;
				break;
			case 9:
				resultado+=6;
				break;
			}
			switch(periodo.toString().charAt(12)){
			case 0:
				resultado+=6;
				break;
			case 1:
				resultado+=2;
				break;
			case 2:
				resultado+=5;
				break;
			case 3:
				resultado+=5;
				break;
			case 4:
				resultado+=4;
				break;
			case 5:
				resultado+=5;
				break;
			case 6:
				resultado+=6;
				break;
			case 7:
				resultado+=3;
				break;
			case 8:
				resultado+=7;
				break;
			case 9:
				resultado+=6;
				break;
			}
			switch(periodo.toString().charAt(14)){
			case 0:
				resultado+=6;
				break;
			case 1:
				resultado+=2;
				break;
			case 2:
				resultado+=5;
				break;
			case 3:
				resultado+=5;
				break;
			case 4:
				resultado+=4;
				break;
			case 5:
				resultado+=5;
				break;
			case 6:
				resultado+=6;
				break;
			case 7:
				resultado+=3;
				break;
			case 8:
				resultado+=7;
				break;
			case 9:
				resultado+=6;
				break;
			}
			switch(periodo.toString().charAt(15)){
			case 0:
				resultado+=6;
				break;
			case 1:
				resultado+=2;
				break;
			case 2:
				resultado+=5;
				break;
			case 3:
				resultado+=5;
				break;
			case 4:
				resultado+=4;
				break;
			case 5:
				resultado+=5;
				break;
			case 6:
				resultado+=6;
				break;
			case 7:
				resultado+=3;
				break;
			case 8:
				resultado+=7;
				break;
			case 9:
				resultado+=6;
				break;
			}
			switch(periodo.toString().charAt(17)){
			case 0:
				resultado+=6;
				break;
			case 1:
				resultado+=2;
				break;
			case 2:
				resultado+=5;
				break;
			case 3:
				resultado+=5;
				break;
			case 4:
				resultado+=4;
				break;
			case 5:
				resultado+=5;
				break;
			case 6:
				resultado+=6;
				break;
			case 7:
				resultado+=3;
				break;
			case 8:
				resultado+=7;
				break;
			case 9:
				resultado+=6;
				break;
			}
			switch(periodo.toString().charAt(18)){
			case 0:
				resultado+=6;
				break;
			case 1:
				resultado+=2;
				break;
			case 2:
				resultado+=5;
				break;
			case 3:
				resultado+=5;
				break;
			case 4:
				resultado+=4;
				break;
			case 5:
				resultado+=5;
				break;
			case 6:
				resultado+=6;
				break;
			case 7:
				resultado+=3;
				break;
			case 8:
				resultado+=7;
				break;
			case 9:
				resultado+=6;
				break;
			}
			periodo.setSeconds(periodo.getSeconds()-1);
		}
		if(dias==0){
			dias=1;
		}
		System.out.println(resultado*dias);
	}
}
