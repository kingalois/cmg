package at.muehleder.friedmanng.data;

public class TestMainClass {

	public static void main(String[] args) {
		GraveOwner owner = new GraveOwner();
		owner.setFirstName("Jonas");
		
		GraveOwner ownername = new GraveOwner();
		ownername.setFamilyName("M�hleder");
				
		
		System.out.println(owner.getFirstName());
		System.out.println(ownername.getFamilyName());
	}

}
