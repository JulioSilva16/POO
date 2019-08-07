package br.univille.poo.programacaoestruturada.registro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HoraMinutoUtilTests {
	
	@Test
	public void acrescentaMinutos() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Hora e minutos sao iguais",10,h.minuto);
	}
	@Test
	public void acrescentaMinutoseHoras() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 55;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Hora ",11,h.hora);
		assertEquals("Minuto ",5,h.minuto);
	}
	
	@Test
	public void acrescentaMinutose2Horas() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 10;
		HoraMinutoUtil.acrescentaMinutos(h, 110);
		assertEquals("Hora ",12,h.hora);
		assertEquals("Minuto ",0,h.minuto);
	}
	@Test
	public void acrescentaMinutoseEVoltaPraMeiaNoite() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 23;
		h.minuto = 50;
		HoraMinutoUtil.acrescentaMinutos(h, 10);
		assertEquals("Hora ",0,h.hora);
		assertEquals("Minuto ",0,h.minuto);
	}
	@Test
	public void acrescentaMinutoseEVoltaPraMeiaNoiteE20Min() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 23;
		h.minuto = 50;
		HoraMinutoUtil.acrescentaMinutos(h, 30);
		assertEquals("Hora ",0,h.hora);
		assertEquals("Minuto ",20,h.minuto);
	}
	
	@Test
	public void acrescentaMinutosNegativos() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 20;
		HoraMinutoUtil.acrescentaMinutos(h, -10);
		assertEquals("Hora e minutos sao iguais",10,h.minuto);
	}
	@Test
	public void acrescentaMinutosNegativosEVoltaHora() {
		HoraMinuto h = new HoraMinuto();
		h.hora = 10;
		h.minuto = 20;
		HoraMinutoUtil.acrescentaMinutos(h, -40);
		assertEquals("Hora ",9,h.hora);
		assertEquals("Minuto ",40,h.minuto);
	}
	

}
