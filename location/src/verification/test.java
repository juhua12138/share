package verification;

//import java.util.Scanner;

import location.*;

public class test 
{
	public static void main(String args[])
	{
//		double[] a=CoordinateTransform.Transverse_Mercator(0.88139127, 0.00872665, 6377563.396, 299.32496, 0.8552113, -0.03490659, 400000.00, -100000.00, 0.9996012717);
//		double[] b=CoordinateTransform.SouthOrientatedTransverseMercator(0.88139127, 0.00872665, 6377563.396, 299.32496, 0.8552113, -0.03490659, 400000.00, -100000.00, 0.9996012717);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]+b[i]);
//		}
		
		double[][] Know_Point_Inf= {{3327859.856,531268.661,33.024,19.457},{3326760.543,527083.853,18.818,5.39},
				{3326359.348,525642.885,20.116,6.736},{3325878.505,524612.029,18.762,5.407}};
		double[][] Unknow_Point_Inf= {{3320662.67,516397.502,20.713},{3321758.158,517464.673,18.832},
				{3322057.837,517984.629,19.84},{3322897.04,519439.964,19.933}};
		double[] Unknow_Point_Height_Normal=HeightFitting.Plane_Height_Fitting(Know_Point_Inf, Unknow_Point_Inf);
		for(int i=0;i<Unknow_Point_Inf.length;i++)
		{
			System.out.println(Unknow_Point_Height_Normal[i]);
		}
		
//		double[] a=CoordinateTransform.WebMercatot(0.425542460, -1.751147016, 6378137.0, 298.2572236, 0, 0, 0, 0, 2);
//		for(int i=0;i<a.length;i++)
//			{
//				System.out.println(a[i]);
//			}
		
	}
}
