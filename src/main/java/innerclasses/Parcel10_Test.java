package innerclasses;
import static net.mindview.util.Print.*;


public class Parcel10_Test {
	class MyDestination implements Destination{
		private int cost;
		{
			cost =Math.round(101.395F);
			if(cost>100)
				System.out.println("Over Budget!");
		}
		private String label="Tasmania";
		public String readLabel() {return label;}
	};
	
	public Destination destination(){
		return new MyDestination();
	}
	
	public static void main(String[] args) {
			Parcel10_Test p = new Parcel10_Test();
		    Destination d = p.destination();
		    print(d.readLabel());
	}
}
