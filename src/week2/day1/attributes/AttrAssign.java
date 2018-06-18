package week2.day1.attributes;

public class AttrAssign {

	public static void main(String[] args) {
		Attribute attr = new Attribute();
		attr.protectedAttribute = "protected";
		attr.publicAttribute = "public";
		
		System.out.println(attr.protectedAttribute + " " + attr.publicAttribute);
	}
}
