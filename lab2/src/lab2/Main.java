package lab2;

public class Main {
	public static void main(String args[]) {
		Problem pb = new Problem();
		//declar componentele problemei
		Source s1 = new Source();
		s1.setName("S1");
		s1.setType(SourceType.FACTORY);
		Source s2 = new Source();
		s2.setName("S2");
		s2.setType(SourceType.WAREHOUSE);
		Source s3 = new Source();
		s3.setName("S3");
		s3.setType(SourceType.WAREHOUSE);
		Destination d1 = new Destination();
		d1.setName("D1");
		Destination d2 = new Destination();
		d2.setName("D2");
		Destination d3 = new Destination();
		d3.setName("D3");
		pb.addSource(s1, 10);
		pb.addSource(s2, 35);
		pb.addSource(s3, 25);
		pb.addDestination(d1, 20);
		pb.addDestination(d2, 25);
		pb.addDestination(d3, 25);
		pb.addCost(0, 0, 2);
		pb.addCost(0, 1, 3);
		pb.addCost(0, 2, 1);
		pb.addCost(1, 0, 5);
		pb.addCost(1, 1, 4);
		pb.addCost(1, 2, 8);
		pb.addCost(2, 0, 5);
		pb.addCost(2, 1, 6);
		pb.addCost(2, 2, 8);
		//afisez problema
		System.out.print(pb.toString());

	}
}
