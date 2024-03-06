package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;


public abstract class CalculadoraTarifas {
	public CalculadoraTarifas() {}

	public static final double IMPUESTO = 0.28;
	
	protected abstract int calcularCostoBase​(Vuelo vuelo,Cliente cliente);
	
	
	protected abstract double calcularPorcentajeDescuento​(Cliente cliente);
	
	public int calcularTarifa​(Vuelo vuelo,Cliente cliente) {
		int costoBase= calcularCostoBase​(vuelo, cliente);
		double porcentajeDescuento = calcularPorcentajeDescuento​(cliente);
		double costoConDescuento =costoBase *(1-porcentajeDescuento);
		int impuestos = calcularValorImpuestos​ (costoConDescuento);
		return (int) (costoConDescuento+impuestos);
		
		}
	
	protected int calcularValorImpuestos​(double costoBase) {
		return (int) Math.round(costoBase*IMPUESTO);}
	
}