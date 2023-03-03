
public class Ex3{
	public static void main(String[] args) {
  
	Motor m1, m2;
	m1 = new Motor(5);
	m2 = m1;
	m2.setCapacitate(10);
	m1.tipareste();
	}
}

// programul va returna „Motor de capacitate 10” 