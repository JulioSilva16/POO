package br.univille.poo.programacaoestruturada.registro;

public class HoraMinutoUtil {
	

	public static void acrescentaMinutos(HoraMinuto h, int minutos) {
		h.minuto = h.minuto + minutos;
		
			while (h.minuto >= 60) {
				h.minuto = h.minuto - 60;
				acrescentaHoras(h, 1);		
			}			
	}
	public static void acrescentaHoras (HoraMinuto h, int horas) {
			h.hora = h.hora + horas;
		while (h.hora > 23) {				
				h.hora = h.hora - 24;				
			}
	}
}
