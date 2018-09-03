package height_fitting;

//import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
//		double[] Get_Result=Height_Fitting.height_fitting();
//		System.out.println("未知点正常高为："+Get_Result[0]+"，高程异常为："+Get_Result[1]+"。");
		
//		double[][] Know_Point_XY=new double [4][2];
//		double[] Know_Point_Height_GPS=new double[4];
//		double[] Know_Point_Height_Normal=new double[4];
//		double Get_Result=0;
//		double Unknow_Point_Height_GPS=0;
//		double[] Unknow_Coordinate=new double[2];
//		Scanner typing=new Scanner(System.in);
//		
//		Know_Point_XY[0][0]=3327859.856;
//		Know_Point_XY[0][1]=531268.661;
//		
//		Know_Point_XY[1][0]=3326760.543;
//		Know_Point_XY[1][1]=527083.853;
//		
//		Know_Point_XY[2][0]=3326359.348;
//		Know_Point_XY[2][1]=525642.885;
//		
//		Know_Point_XY[3][0]=3325878.505;
//		Know_Point_XY[3][1]=524612.029;
//		
//		Know_Point_Height_GPS[0]=33.024;
//		Know_Point_Height_GPS[1]=18.818;
//		Know_Point_Height_GPS[2]=20.116;
//		Know_Point_Height_GPS[3]=18.762;
//		
//		Know_Point_Height_Normal[0]=19.457;
//		Know_Point_Height_Normal[1]=5.39;
//		Know_Point_Height_Normal[2]=6.736;
//		Know_Point_Height_Normal[3]=5.407;
//		
//		for(;;)
//		{
//			System.out.println("输入位置点大地高");
//			Unknow_Point_Height_GPS=typing.nextDouble();
//			System.out.println("输入位置点坐标x");
//			Unknow_Coordinate[0]=typing.nextDouble();
//			System.out.println("输入位置点坐标y");
//			Unknow_Coordinate[1]=typing.nextDouble();
//			Get_Result=Height_Fitting_Plus.Plane_Height_Fitting(Know_Point_XY, Know_Point_Height_GPS, 
//					Know_Point_Height_Normal, Unknow_Point_Height_GPS,Unknow_Coordinate);
//			System.out.println("结果为："+Get_Result+"    输入0结束");
//			if(typing.nextInt()==0)
//			{
//				break;
//			}
//		}
//		typing.close();
		
		
		double[][] Know_Point_Inf= {{3327859.856,531268.661,33.024,19.457},{3326760.543,527083.853,18.818,5.39},
				{3326359.348,525642.885,20.116,6.736},{3325878.505,524612.029,18.762,5.407}};
		double[][] Unknow_Point_Inf= {{3320662.67,516397.502,20.713},{3321758.158,517464.673,18.832},
				{3322057.837,517984.629,19.84},{3322897.04,519439.964,19.933}};
		double[] Unknow_Point_Height_Normal=Height_Fitting_Plus2.Plane_Height_Fitting(Know_Point_Inf, Unknow_Point_Inf);
		for(int i=0;i<Unknow_Point_Inf.length;i++)
		{
			System.out.println(Unknow_Point_Height_Normal[i]);
		}
	}
}
