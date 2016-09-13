package chapter01;

public class variabletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		long a=12;
		byte b=20;
		double c=3.14;
		float d=3.14f;
		boolean e=true;
		String f="hi";
		char aa='a';
		
		System.out.println(aa);
		System.out.println(f);
		System.out.println(e);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(i);
		System.out.println(a);
		//reference type(참조형)
		circle cc=new circle();
		cc.radius=5;
		cc.area=5*5*3.14;
		
		System.out.println(cc.area);
		
		String s=new String("hhhhhh");
		System.out.println(s);
		
		String ss="asdasd";//위에 new String()이랑 똑같음
		System.out.println(ss);
		
		char abc='a';
		char abc1=73;
		System.out.println(abc);
		System.out.println(abc1);
		
	}

}
