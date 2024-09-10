package JavaPractice;

public class EncapsulationMain {

	public static void main(String[] args) {
		EncapsulationExample encap= new EncapsulationExample();
		encap.setid(300);
		encap.setname("shivan");
		encap.setsalary(400.54);
		System.out.println(encap.getid());
		System.out.println(encap.getname());
		System.out.println(encap.getsalary());
	
	}

}
