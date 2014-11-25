package week2.hotel;
public class Password {
	public static final String INITIAL = "K0ekjes";
	private String password;
	public Password(){
		this.password = Password.INITIAL;
	}
	public static boolean acceptable(String suggestion){
		return (suggestion.length() >= 6 && !(suggestion.contains(" ")));

	}
	public boolean setWord(String oldpass, String newpass){
		if (oldpass == this.password && Password.acceptable(newpass)){
			this.password = newpass;
			return true;
		} else {
			return false;
		}
	}
	//@ pure;
	public boolean testWord(String test){
		return (test.equals(this.password));
	}

}
