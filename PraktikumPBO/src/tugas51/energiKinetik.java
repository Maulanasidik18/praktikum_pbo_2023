package tugas51;

public class energiKinetik {
	    private int massa;
	    private int kecepatan;

	    public energiKinetik(int massa, int kecepatan) {
	        this.massa = massa;
	        this.kecepatan = kecepatan;
	    }

	    public int getMassa() {
	        return massa;
	    }

	    public void setMassa(int massa) {
	        this.massa = massa;
	    }

	    public int getKecepatan() {
	        return kecepatan;
	    }

	    public void setKecepatan(int kecepatan) {
	        this.kecepatan = kecepatan;
	    }

	    public double energiKinetik() {
	        double kineticEnergy = 0.5 * massa * kecepatan * kecepatan;
	        return kineticEnergy;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        energiKinetik object = new energiKinetik(5, 10); // Mass = 5, Velocity = 10
	        double kineticEnergy = object.energiKinetik();
	        System.out.println("Kinetic Energy: " + kineticEnergy);
	    }
	}
