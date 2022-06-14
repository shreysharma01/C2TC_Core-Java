
public class KnowledgeCheck {
	String name;
	public static void main(String[] args) {
		KnowledgeCheck c1 = new KnowledgeCheck();
		c1.name = "C2TC";
	    KnowledgeCheck c2 = c1;
		c1 = null;
		System.out.println(c2.name);
		KnowledgeCheck c3 = new KnowledgeCheck();
		c3.name = "C2TC";
		System.out.println(c3.name);		
	}

}
