package ch05;

public class Ex5_23_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel p =new Parcel();
		Parcel.Contents C = p.new Contents(33);
		Parcel.Destination d =p.new Destination("ɽ����ͬ");
		//Destination d = new Dest ination(��ɽ��̫ԭ");
		p. setValue(C,d); 
		p. ship();
        p. testShip();
	}
}

class Parcel{
	private Contents C;
	private Destination d;
	private int contentsCount =0;
	class Contents{
		private int i;
			Contents(int i){
					this.i=i;
					contentsCount++;
				}


				int value(){
						return i;
				}
		}
class Destination{
private String label;
Destination( String whereTo){
	label =whereTo;
}

String readLabel() {
return label;
}
}

void setValue( Contents c ,Destination d){
this.C=c;
this.d=d;
}
void ship() {
System.out.println("����"+C.value()+"��"+d.label);
}
public void testShip() {
C = new Contents(22);
d=new Destination("ɽ��̫ԭ");
		ship();
}
}
