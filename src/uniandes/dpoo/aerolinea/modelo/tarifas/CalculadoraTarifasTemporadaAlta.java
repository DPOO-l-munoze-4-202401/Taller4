package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas
{
	protected final int COSTO_POR_KM = 1000;

	public CalculadoraTarifasTemporadaAlta() {}
	
	@Override
	public int calcularCostoBase​(Vuelo vuelo,Cliente cliente) {		
		return 0;}
	
	@Override
	public double calcularPorcentajeDescuento​(Cliente cliente) {
		return 0;}


}