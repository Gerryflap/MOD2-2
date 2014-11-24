package week2;

public class Lamp {
	//@ private invariant setting >= 0 && setting <= 3;
	private Setting setting;
	public enum Setting {OFF, LOW, MEDIUM, HIGH};
	
	//The lamp starts at the off state.
	public Lamp() {
		this.setting = Setting.OFF;
	}

	//This setting is the modulo of this setting + 1. This results in it changing the setting to 0,1,2,3 and than back to 0.
	/*@ ensures \old(getSetting()) == 3?getSetting() == 0:getSetting() == \old(getSetting())+1;
	 */
	public void switchSetting() {
		switch(this.setting){
			case OFF:
				this.setting = Setting.LOW;
				break;
			case LOW:
				this.setting = Setting.MEDIUM;
				break;
			case MEDIUM:
				this.setting = Setting.HIGH;
				break;
			case HIGH:
				this.setting = Setting.OFF;
				break;
			default:
				this.setting = Setting.OFF;
				break;
				
			}
		}


	//Method getSetting returns the current state of the lamp
	//@pure;
	public Setting getSetting() {
		return this.setting;
	}
}

