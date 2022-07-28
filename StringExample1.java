class StringExample1
{
	public static void main(String[] args)
	{
		String str = "      Anudip      ";
		int length = str.length();
		System.out.println("Length of String:"+length);
		System.out.println("letter at index position 2:"+str.charAt(2));
		System.out.println("index position of letter:"+str.indexOf('d'));
		System.out.println("contains method:"+str.contains("dip"));
		System.out.println("contains method:"+str.contains("is"));
		System.out.println("Lower Case:"+str.toLowerCase());
		System.out.println("Upper Case:"+str.toUpperCase());
		System.out.println("substring method:"+str.substring(3,5));
		System.out.println("replace method:"+str.replace('i','e'));
		System.out.println("equals method:"+str.equals("anudip"));
		System.out.println("equalsIgnoreCase method:"+str.equalsIgnoreCase("Hello"));
		System.out.println("equalsIgnoreCase method:"+str.equalsIgnoreCase("anudip"));
		System.out.println("trim method:"+str.trim());
	}
}