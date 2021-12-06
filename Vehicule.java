
public abstract class Vehicule {
	private String brand;
	private int kilometers;
	 public Vehicule  (String brand1, int kilometers1){
		 this.brand =brand;
		 this.kilometers =0;
	 }

public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

public  abstract String doStuff();
}
