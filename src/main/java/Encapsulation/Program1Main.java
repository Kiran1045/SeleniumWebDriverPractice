package Encapsulation;

public class Program1Main {

	public static void main(String[] args) {
		Program1 prog = new Program1();
		prog.setId(1234);
		prog.setName("NameisName");
		prog.setSec('C');
		System.out.println(prog.getId());
		System.out.println(prog.getName());
		System.out.println(prog.getSec());
		

	}

}
