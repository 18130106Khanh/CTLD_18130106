package Lab2;

public class TowerOfHaNoi {
	public static void moveTower(int disk, char source, char dest, char spare) {
		if (disk == 0) {
			System.out.println("Di chuyển từ Source: " + source + " Sang Dest " + dest);
			
		} else {
			moveTower(disk - 1, source, spare, dest); // step 1
			System.out.println("Di chuyển từ Source: " + source + " Sang Dest " + dest); // step 2
			moveTower(disk-1, spare, dest, source); // step 3
		}
		
		return;
	}
	public static void main(String[] args) {
		TowerOfHaNoi t = new TowerOfHaNoi();
		int disk =3;
//		System.out.println(t.moveTower(disk, 'A', 'B', 'C'));
		moveTower(disk, 'A', 'B', 'C');
	}

}
