package practise_project_Part1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

//import practise_project_Part1.jh_outside_class.jh_inside_unstatic_class;

//import java.nio.channels.NonWritableChannelException;

//import practise_project_Part1.strcounter;

//import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

//import java.util.Scanner;

class Ver
{
	int ver1;
	static int ver2;
	String ver3;
	static String ver4;
	public int ver5=5;
	public  Ver(int a,String b) 
	{
		this.ver1=a;
		this.ver3=b;
	}
}

class Ver2 extends Ver
{
	public int ver5=7;
	public Ver2(int a,String b,int c)
	{
		super(a, b);
		this.ver5=c;
	}
}

class test
{
	int a=88;
	public void tex() 
	{
		System.out.println("father");
	}
}

class test1 extends test
{
	int a=12;
	int b=super.a;
	int c=a;
	public void tex()
	{
		System.out.println("son");
	}
}

class soup
{
	static int a=9;
	static
	{
		a=1;
	}
}

class strcounter
{
	static String[] mk;
	static int inside_class_use=8998;
	static int input_counter(String... ml)
	{
		int counter=0;
		mk=ml;
		counter=ml.length;
		return counter;
	}
	static void bl()
	{
		for (String m:mk)
		{
			System.out.println(m);
		}
	}
}

//class loop    ��Ҫ�ڷ����ڲ����Լ��ſ��Ա���ѭ������
//{
//	loop l=new loop();
//}


//class hard_dish
//{
//	public String str="tiger penis";
//	public hard_dish(String str) 
//	{
//		this.str=str;
//	}
//	public String order()
//	{
////		System.out.println(str);
//		return str;
//	}
//}

class jh_outside_class
{	
	private int jh_outside_int=0;
	public jh_inside_unstatic_class jhic=new jh_inside_unstatic_class();
	
	public class jh_inside_unstatic_class
	{
		public jh_inside_unstatic_class ()
		{}
		
		public jh_inside_unstatic_class (String penis)
		{
			System.out.println(penis);
		}
		
		public int jh_inside_int=0;
		
		public void jh_inside_outside_compare(jh_outside_class jo)
		{
			System.out.println("�������"+jo.toString());
			System.out.println("���ط���"+jh_outside_class.this.toString());
			if(jo.equals(jh_outside_class.this))//�ò���Ϊ�ⲿ��Ķ���
			{
				System.out.println("��ͷ");
			}
			else
			{
				System.out.println("����ͷ");
			}
		}
	}
	
	public void jh_outside_method()
	{
		jh_inside_unstatic_class jhic=new jh_inside_unstatic_class();
		System.out.println("��"+jhic.jh_inside_int);
		System.out.println("��"+jh_outside_int);
	}
	
	public void cock()
	{
		System.out.println("�Ǿ�̬�ڲ��෽������cock�ٺٺ�"+strcounter.inside_class_use);
	}
}

class son_jh_inside_class extends jh_outside_class.jh_inside_unstatic_class
{
	public son_jh_inside_class(String penis,jh_outside_class otc)
	{
		otc.super(penis);
	}
	
//	public void son_compare(jh_outside_class out)
//	{
//		if(out.equals(jh_outside_class.this))//-------------------------�ô����������Ƿ����ʹ����ν�ĶԸ�����ⲿ�������
//		{
//			System.out.println("��ͷ");
//		}
//		else
//		{
//			System.out.println("����ͷ");
//		}
//	}
}

abstract class father_has_noname_son
{
	//public int a=0;
	
	public void b()
	{
		System.out.println("���ķ���");
	}
	
	public abstract void c();
}

interface lam
{
	public static String interface_name="žžž";
	public abstract void object_function(String a);
	default void class_function()
	{
		System.out.println("�ӿ�����Ϊ��"+interface_name);
	}
}

class lam_class implements lam
{
	public lam_class(String a)
	{
		System.out.println("��ķ��ɻ��У�"+a);
	}
	public void object_function(String a)
	{
		System.out.println(a);
	}
}

enum Number
{
	NUMBER1(1),NUMBER2(2),NUMBER3(3);
	
	final int NUMBER_number;
	
	private Number (int a)
	{
		NUMBER_number=a;
	}
	
	public void print()
	{
		System.out.println(NUMBER_number);
		System.out.println(this.toString());
	}
}

enum dick
{
	bigdick(100),mediumdick(10),smalldick(1),nodick(0);
	private int dick_size;
	private dick(int a)
	{
		this.dick_size=a;
	}
	public void print()
	{
		switch(this)
		{
		case bigdick:
			System.out.println("��ϲ�㣬��ܴ󣡣�������Ȼ��"+this.dick_size+"����");break;
		case mediumdick:
			System.out.println("���аɣ�ƽ��ˮƽ����"+this.dick_size+"����");break;
		case smalldick:
			System.out.println("�ǳ����ҵĸ����㣬���С����������ֻ��"+this.dick_size+"����");break;
		default:System.out.println("�Բ�����û�á��Ǿ�"+this.dick_size+"����");
		}
		System.out.println(dick_size);//ʵ����Ա��ֱ�����������Ҫ�ж�ö��ʵ��
	}
}

interface measure
{
	public void mainfunction();
}

enum penis implements measure
{
	longpenis()
	{
		public void mainfunction()
		{
			System.out.println("��");
		}
	},
	shortpenis()
	{
		public void mainfunction()
		{
			System.out.println("��");
		}
	},
	mediumpenis()
	{
		public void mainfunction()
		{
			System.out.println("��");
		}
	},
	nonepenis()
	{
		public void mainfunction()
		{
			System.out.println("û");
		}
	};
}

//-------------------------------------�ָ���------------------------------------------------------
public class Practice_No1   //------------��������
{
//	private static String str="take it out!!!";
//	private String str2="blow it up!!!";
//	
//	public static void main(String[] arge)
//	{
//		Ver v=new Ver();
//		//Scanner p=new Scanner(System.in);
//		//String chars =p.nextLine();
//		System.out.println("1"+v.ver1+"2"+Ver.ver2+"3"+v.ver3+"4"+Ver.ver4);
//		str="hhhsnfhhhf";
//		System.out.println(str.length());
//	}
	
//	public class Ver3 extends java.lang.Object
//	{
//		public void printf()
//		{
//			System.out.println("find declaration of java.lang.Object");
//		}
//	}
	
	
	public static void main(String[] arge) throws Exception /*throws FileNotFoundException*/
	{
		for(String a:arge)
		{
			System.out.println(a);
		}
		{
			Ver2 v2=new Ver2(1,"dddd",3);
//			System.out.println("ver5"+v2.ver5);
			System.out.println("ver1:"+v2.ver1+"\nver3:"+v2.ver3+"\nver5:"+v2.ver5);
//			Ver v1=new Ver(1, "throw me one!!!");
//			System.out.println(v1.ver1+v1.ver3);
			test t=new test1();
			System.out.println(t.a);//��Ķ�̬�����ڷ����ϣ��������ڳ�Ա������,�����ڸ���
			t.tex();
			test1 t1=(test1)t;
			System.out.println("super  "+t1.b);
			System.out.println("xiangzao  "+t1.c);
			System.out.println("�����a���"+soup.a);
		}
		
		{
			String cheary="4.555";
			double chea=Double.parseDouble(cheary);//��DoubleΪ��
			System.out.println(chea);
			double chea2=new Double(cheary);//�Զ�װ��//��DoubleΪ������
			System.out.println(chea2);
			String bl=String.valueOf(false);
			System.out.println(bl);
//			String out=hard_dish.order("beef");
			
			Integer a=6;
			System.out.println((a>5.0));
			Integer b=6;
			System.out.println((a==b));
			
			System.out.println(Integer.parseUnsignedInt("56660")+"  plus  "+Integer.toUnsignedString(56666));
			System.out.println(Integer.compareUnsigned(52, 5));
			System.out.println(Long.divideUnsigned(555, 5));
			System.out.println(Integer.remainderUnsigned(555, 4));
			System.out.println(Integer.parseUnsignedInt("ab", 16));
		}
		
		{
			Ver2 v2=new Ver2(2,"cccc",99);
			Ver2 v1=new Ver2(2,"cccc",99);
			Ver v3=new Ver(2,"cccc");
			test t1=new test();
			System.out.println("ver1:"+v2.ver1+"\nver3:"+v2.ver3+"\nver5:"+v2.ver5);
			System.out.println(v2);
			System.out.println(v2.equals(v1));
			System.out.println(v2.equals(v3));
			System.out.println(v2.equals(t1));
			//System.out.println((v2==t1));
		}
		
		{
			System.out.println("�����ַ�������"+strcounter.input_counter("111","baba","cock"));
			strcounter.bl();
		}
		
//		{���ڲ������Լ�������ѭ��
//			loop x=new loop();
//			System.out.println(x.toString());
//			System.out.println(x.l.toString());
//			
//		}
		
		{
			jh_outside_class jhoc=new jh_outside_class();
			jhoc.jh_outside_method();
//			jh_inside_unstatic_class jhic=jhoc.jhic;//���ܸ���ֵ��ô���ⲿ����Ӧ�ñ������������
			System.out.println("����"+jhoc.jhic);
			jhoc.cock();
			jhoc.jhic.jh_inside_outside_compare(jhoc);
			
			System.out.println("��������һ��");
			jh_outside_class.jh_inside_unstatic_class jhic=jhoc.new jh_inside_unstatic_class();
			jhic.jh_inside_outside_compare(jhoc);
//			System.out.println("����");
//			System.out.println("kaka"+jhic.jh_outside_class.this);//�ⲿ�����������ڲ�����󱣴�ļ������ⲿ����󣿣���
			
			System.out.println("������������");
			jh_outside_class.jh_inside_unstatic_class jhoic=new jh_outside_class().new jh_inside_unstatic_class();
			jhoic.jh_inside_outside_compare(jhoc);//��Ϊ�ô�δ�����ⲿ�����
			
			System.out.println("������������");
			jh_outside_class jhoc2=new jh_outside_class();
			son_jh_inside_class sjic=new son_jh_inside_class("dick", jhoc2);
			sjic.jh_inside_outside_compare(jhoc2);
			
			father_has_noname_son fS;//�����ڲ���
			int e=0;
			fS=new father_has_noname_son()
			{
				public void b()
				{
					System.out.println("����");
					System.out.println("�����ǵ��ǣ�");
					super.b();
					System.out.println(e);//�ô��Զ���e��Ϊfinal
				}
				public void c()
				{
					System.out.println("���س��󷽷�");
				}
//				public void d()//--------------����д�·�������Ϊ�·���������Ҫ���ñ���ǿ������ת�����������ඨ���ڶ��Ժ���ʧ
//				{
//					System.out.println("�·���");
//				}
			};
			//e=1;
			fS.b();
			fS.c();
		}
		
		{
			Number Enum_n1_1=Number.NUMBER1;
			Number Enum_n1_2=Number.valueOf(Number.class, "NUMBER1");
			Enum_n1_1.print();
			Enum_n1_2.print();
			
			Number Enum_n2=Number.NUMBER2;
			Number Enum_n3=Number.NUMBER3;
			System.out.println("2��3��ǰ��"+Enum_n2.compareTo(Enum_n3));
			System.out.println("2��1�ĺ���"+Enum_n2.compareTo(Enum_n1_1));
			System.out.println("2��2��ͬ��"+Enum_n2.compareTo(Enum_n2));
		}
		
		{
			lam L= (a)->
			{
				System.out.println(a);
			};
			L.object_function("�����飬�����飡");
			L.class_function();
			
			lam_class lc=new lam_class("��");
			lc.class_function();
			lc.object_function("��ķʵ����һ������");
			
			dick d1=dick.valueOf(dick.class, "bigdick");
			d1.print();
			dick d2=dick.smalldick;
			d2.print();
			
			penis p1=penis.longpenis;
			System.out.println(p1.toString());
			System.out.println(p1.name());
			p1.mainfunction();
			penis p2=penis.valueOf(penis.class,"shortpenis");
			System.out.println(p2.toString());
			System.out.println(p2.name());
			p2.mainfunction();
		}
		
		{
			String[] buffer=new String[100];
//			File a=new File("F:\\JH_java_SE_workspace\\practise_project\\ddd.txt");
			File a=new File("ddd.txt");
			Scanner keyboard =new Scanner(a);
			System.out.println(a);
			keyboard.useDelimiter("\n");
			int i=0;
			while(keyboard.hasNextLine())
			{
				if(i==100)
				{
					i=0;
				}
				buffer[i]=keyboard.nextLine();
				System.out.println(buffer[i]);
				i++;
			}
			keyboard.close();
			
			System.out.println("������bufferedreader��ȡ");
			FileReader fr1=new FileReader("ddd.txt");
			BufferedReader bf1=new BufferedReader(fr1);
			i=0;
			buffer=new String[100];
			do
			{
				buffer[i]=bf1.readLine();
				System.out.println(buffer[i]);//���null
			}
			while(buffer[i]!=null);
			bf1.close();
//			fr1.close();
			
//			Scanner kb=new Scanner(System.in);
//			for(i=0;i<10;i++)
//			{
//				System.out.println(kb.nextLine());
//			}
//			kb.close();
		}
		
		{
			
		}
	}
}

