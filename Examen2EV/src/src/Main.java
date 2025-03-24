package src;

public class Main {
	
	public static void main(String[] args) {
		
    SdC_Circulo circulo1 = new SdC_Circulo(1, 3, "Verde");
    SdC_Rectangulo rectangulo1 = new SdC_Rectangulo(1, 3, 3, "Rojo");

    // Calcular el area del rectangulo1
    double area1 = extractedCuadro(rectangulo1);

    // Calcula el area de circulo1
    double area2 = extractedCirculo(circulo1);

    // Diferencia entre areas
    double diferencia = extractedDiferencias(area1, area2);

    // Imprimir datos
    System.out.println("Cuadrado "+rectangulo1.toString());
    System.out.println("Circulo "+circulo1.toString());
    System.out.println("Diferencia entre areas: " + diferencia);
	}

	private static double extractedCirculo(SdC_Circulo circulo1) {
		double radio = circulo1.getRadio();
		double area2 = radio * Math.PI;
		System.out.println("Area del circulo 1: " + area2);
		return area2;
	}

	private static double extractedDiferencias(double area1, double area2) {
		double diferencia = area1 - area2;
		System.out.println("Diferencia entre areas: " + diferencia);
		return diferencia;
	}

	private static double extractedCuadro(SdC_Rectangulo rectangulo1) {
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area1 = ladoA * ladoB;
		System.out.println("Area del rectangulo 1: " + area1);
		return area1;
	}
}
