package src;

public class SdC_Circulo {
	private int id;
	private double Radio;
	private String Color;
	
	public SdC_Circulo(int id, double radio, String color) {
		super();
		this.id = id;
		Radio = radio;
		Color = color;
	}

	public SdC_Circulo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRadio() {
		return Radio;
	}

	public void setRadio(double radio) {
		Radio = radio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "SdC_Circulo [id=" + id + ", Radio=" + Radio + ", Color=" + Color + "]";
	}

}
