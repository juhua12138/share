package height_fitting;

//import java.awt.Point;
import java.util.Scanner;

//import javax.naming.spi.DirStateFactory.Result;

public class Height_Fitting 
{

	public static double[] height_fitting() 
	{
		int Point_Number=0;
		Scanner typing=new Scanner(System.in);
//		System.out.println("输入高程拟合已知点点数：");
//		Point_Number=typing.nextInt();
		Point_Number=4;
		
		double[][] Know_Point_XY=new double[Point_Number][3];
		double[] Know_Point_Height_GPS=new double[Point_Number];
		double[] Know_Point_Height_Normal=new double[Point_Number];
//		for(int i=0;i<Point_Number;i++)
//		{
//			Know_Point_XY[i][0]=1;
//			System.out.println("输入已知点"+(i+1)+"x坐标：");
//			Know_Point_XY[i][1]=typing.nextDouble();
//			System.out.println("输入已知点"+(i+1)+"y坐标：");
//			Know_Point_XY[i][2]=typing.nextDouble();
//			System.out.println("输入已知点"+(i+1)+"大地高：");
//			Know_Point_Height_GPS[i]=typing.nextDouble();
//			System.out.println("输入已知点"+(i+1)+"正常高：");
//			Know_Point_Height_Normal[i]=typing.nextDouble();
//		}
		Know_Point_XY[0][0]=1;
		Know_Point_XY[0][1]=3327859.856;
		Know_Point_XY[0][2]=531268.661;
		
		
		Know_Point_XY[1][0]=1;
		Know_Point_XY[1][1]=3326760.543;
		Know_Point_XY[1][2]=527083.853;
		
		Know_Point_XY[2][0]=1;
		Know_Point_XY[2][1]=3326359.348;
		Know_Point_XY[2][2]=525642.885;
		
		Know_Point_XY[3][0]=1;
		Know_Point_XY[3][1]=3325878.505;
		Know_Point_XY[3][2]=524612.029;
		
		Know_Point_Height_GPS[0]=33.024;
		Know_Point_Height_GPS[1]=18.818;
		Know_Point_Height_GPS[2]=20.116;
		Know_Point_Height_GPS[3]=18.762;
		
		Know_Point_Height_Normal[0]=19.457;
		Know_Point_Height_Normal[1]=5.39;
		Know_Point_Height_Normal[2]=6.736;
		Know_Point_Height_Normal[3]=5.407;
		
		double[][] pass0=MatrixOperation.getA_T(Know_Point_XY);
		double[][] pass1=MatrixOperation.multiplyAB(pass0, Know_Point_XY);
		double[][] pass2=MatrixOperation.multiplyAB(MatrixOperation.getN(pass1), MatrixOperation.getA_T(Know_Point_XY));
		double[] pass3=MatrixOperation.minusArry(Know_Point_Height_GPS, Know_Point_Height_Normal);
		double[] Optimal_Parameters=MatrixOperation.multiplyAB(pass2,pass3);
		double[] Unknow_Point_XY=new double[3];
		Unknow_Point_XY[0]=1;
		double Unknow_Point_Height_GPS=0;
		double Unknow_Point_Height_Normal=0;
		double Unknow_Height_Unnormal=0;
		for(;;)
		{
			System.out.println("输入未知点x坐标：");
			Unknow_Point_XY[1]=typing.nextDouble();
			System.out.println("输入未知点y坐标：");
			Unknow_Point_XY[2]=typing.nextDouble();
			System.out.println("输入未知点大地高：");
			Unknow_Point_Height_GPS=typing.nextDouble();
			Unknow_Height_Unnormal=Unknow_Point_XY[0]*Optimal_Parameters[0]+Unknow_Point_XY[1]*Optimal_Parameters[1]+Unknow_Point_XY[2]*Optimal_Parameters[2];
			Unknow_Point_Height_Normal=Unknow_Point_Height_GPS-Unknow_Height_Unnormal;
			System.out.println("未知点正常高为："+Unknow_Point_Height_Normal+"，高程异常为："+Unknow_Height_Unnormal+"。");
			System.out.println("输入1结束计算,否则输入0继续计算：");
			int pass =typing.nextInt();
			if (1!=pass&& 0!=pass)
			{
				System.out.println("去你妈的给老子老实按要求输入");
			}
			else
			{
				if(1==pass)
				{
					continue;
				}
				else
				{
					break;
				}
			}
		}
		typing.close();
		double[] Height_Fitting_Result= {0,0};
		Height_Fitting_Result[0]=Unknow_Point_Height_Normal;
		Height_Fitting_Result[1]=Unknow_Height_Unnormal;
		return Height_Fitting_Result;
	}
}
