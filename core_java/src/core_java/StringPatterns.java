package core_java;

public class StringPatterns {
	public static void main(String args[]) {
		String name="Preeti";
		String namePatterns="[A-Z][a-z]{4,}";
		System.out.println(name.matches(namePatterns));
		
		String mobile="7482190928";
		String mobilePatterns="[7-9][0-9]{9}";
		System.out.println(mobile.matches(mobilePatterns));
		
		String mail="abc@mail.com";
		String mailPatterns="[a-z]+@mail.com";
		System.out.println(mail.matches(mailPatterns));
		
		
	}

}
