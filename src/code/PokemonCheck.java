package code;

public class PokemonCheck {

	public static void main(String[] args) {
		
		Pokemon a = new Pokemon(54, "psyduck", 8, 196, 64);
		Pokemon b = new Pokemon(54, "psyduck", 8, 196, 64);
		
		System.out.println("Are Pokemon 1 and Pokemon 2 equal?");
		System.out.println(a.equals(b));
		
		// Checks the equals and the matching hashCodes
		System.out.println("The hash code for a: " + a.hashCode());
		System.out.println("The hash code for b: " + b.hashCode());
		System.out.println("Hash codes match: " + (a.hashCode() == b.hashCode()));
		
		// Change the base experience and then check for equals()
		b.setBaseExperience(529);
		
		System.out.println("\nAfter changing the base experience: ");
		System.out.println(a.equals(b));
		
		// Calls all the getters 
		System.out.println("\nTesting all getters: ");
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getHeightDm());
		System.out.println(a.getWeightHg());
		System.out.println(a.getBaseExperience());
		
		a.setId(574);
		a.setName("gothita");
		a.setHeightDm(4);
		a.setWeightHg(58);
		a.setBaseExperience(58);
		
		System.out.println("\nUsing setters: ");
		System.out.println(a);
		
		System.out.println("Testing the equals with null: ");
		System.out.println(a.equals(null));
		
		System.out.println("Testing the equals with String: ");
		System.out.println(a.equals("psyduck"));
		
		//Testing invalid inputs
		System.out.println("\nTesting the invalid inputs: ");
		int oldHeight = a.getHeightDm();
		a.setHeightDm(-2);
		
		System.out.println("Height before: " + oldHeight);
		System.out.println("Height after: " + a.getHeightDm());
		System.out.println("Invalid height ignored: " + (oldHeight == a.getHeightDm()));
		
		
		int oldWeight = a.getWeightHg();
		a.setWeightHg(-5);
		
		System.out.println("Weight before: " + oldWeight);
		System.out.println("Weight after: " + a.getWeightHg());
		System.out.println("Invalid weight ignored: " + (oldWeight == a.getWeightHg()));
		
		int oldId = a.getId();
		a.setId(-67);
		System.out.println("Invalid id ignored: " + (oldId == a.getId()));
		
		String oldName = a.getName();
		a.setName(null);
		System.out.println("null ignored: " + (oldName.equals(a.getName())));
		a.setName("");
		System.out.println("empty ignored: " + (oldName.equals(a.getName())));
		a.setName("   ");
		System.out.println("blank ignored: " + (oldName.equals(a.getName())));
		
		int oldExp = a.getBaseExperience();
		a.setBaseExperience(-10);
		System.out.println("Invalid base experience ignored: " + (oldExp == a.getBaseExperience()));
		
		// Renaming an object does not change a key already stored in the hash table, 
		// so name setters are tested on objects that are not in the table.
		System.out.println("\nTesting name setters (separate test objects): ");
		Pokemon m = new Pokemon(574, "gothita", 4, 58, 58);
		Pokemon n = new Pokemon(52, "meowth", 4, 42, 58);
		
		System.out.println("\nm before: " + m.getName());
		m.setName("charmander");
		System.out.println("m after:  " + m.getName());
		System.out.println("m name changed: " + m.getName().equals("charmander"));

		System.out.println("n before: " + n.getName());
		n.setName("ivysaur");
		System.out.println("n after:  " + n.getName());
		System.out.println("n name changed: " + n.getName().equals("ivysaur"));
	}
}