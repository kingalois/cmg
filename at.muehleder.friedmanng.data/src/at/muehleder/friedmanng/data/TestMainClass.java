package at.muehleder.friedmanng.data;

public class TestMainClass {

	public static void main(String[] args) {
		GraveOwner owner = new GraveOwner();
		owner.setFirstName("Jonas");
		
		GraveOwner ownerFlo = new GraveOwner();
		ownerFlo.setFirstName("Flo");
		
		GraveOwner ownername = new GraveOwner();
		ownername.setFamilyName("M�hleder");
				
		
		System.out.println(owner.getFirstName());
		System.out.println(owner.getFamilyName());
	}

}
