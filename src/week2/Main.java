package week2;
public class Main {
	public static void main(String[] args){
		Lamp lamp = new Lamp();

		//It switches and prints the setting 100 times.

		for (int i = 0; i < 100; i++){
			lamp.switchSetting();
			System.out.println(lamp.getSetting());
		}
	}

}
