package height_fitting;

public class Height_Fitting_Plus2
{
	public static double[] Plane_Height_Fitting(double[][] Know_Point_Information,double[][] Unknow_Point_Information)
	{
		/**
		 * 方法功能：
		 * GPS高程异常拟合方法——平面拟合法，输入大于等于3个点的高斯坐标等信息，通过平面拟合求出特定点的正常高；
		 * 
		 * 输入参数：
		 * Know_Point_Information[][]：已知点信息，每行为一个已知点信息（分别为高斯坐标x、y，大地高H，正常高h），行数大于等于3，列数为4。
		 * Unknow_Poing_Information[][]：未知点信息，每行为一未知点信息（分别为高斯坐标x、y，大地高H），行数任意，列数为3。
		 * 
		 * 输出：
		 * Unknow_Point_Height_Normal[]：未知点正常高h。
		 * */
		
		int Know_Point_Number = Know_Point_Information.length;
		double[][] Know_Point_XY = new double[Know_Point_Number][3];
		double[] Know_Point_Height_GPS=new double[Know_Point_Number];
		double[] Know_Point_Height_Normal=new double[Know_Point_Number];
		for (int i = 0; i < Know_Point_Number; i++)
		{
			Know_Point_XY[i][0] = 1;
			Know_Point_XY[i][1] = Know_Point_Information[i][0];
			Know_Point_XY[i][2] = Know_Point_Information[i][1];
			Know_Point_Height_GPS[i]=Know_Point_Information[i][2];
			Know_Point_Height_Normal[i]=Know_Point_Information[i][3];
		}
		double[][] pass0 = MatrixOperation.getA_T(Know_Point_XY);
		double[][] pass1 = MatrixOperation.multiplyAB(pass0, Know_Point_XY);
		double[][] pass2 = MatrixOperation.multiplyAB(MatrixOperation.getN(pass1),MatrixOperation.getA_T(Know_Point_XY));
		double[] pass3 = MatrixOperation.minusArry(Know_Point_Height_GPS, Know_Point_Height_Normal);
		double[] Optimal_Parameters = MatrixOperation.multiplyAB(pass2, pass3);
		int Unknow_Point_Number=Unknow_Point_Information.length;
		double[][] Unknow_Point_XY = new double[Unknow_Point_Number][3];
		double[] Unknow_Point_Height_GPS=new double[Unknow_Point_Number];
		double[] Unknow_Point_Height_Normal=new double[Unknow_Point_Number];
		for(int i=0;i<Unknow_Point_Number;i++)
		{
			Unknow_Point_XY[i][0]=1;
			Unknow_Point_XY[i][1]=Unknow_Point_Information[i][0];
			Unknow_Point_XY[i][2]=Unknow_Point_Information[i][1];
			Unknow_Point_Height_GPS[i]=Unknow_Point_Information[i][2];
		}
		double Unknow_Height_Unnormal[]=MatrixOperation.multiplyAB(Unknow_Point_XY, Optimal_Parameters);
		for(int i=0;i<Unknow_Point_Number;i++)
		{
			Unknow_Point_Height_Normal[i]=Unknow_Point_Height_GPS[i]-Unknow_Height_Unnormal[i];
		}
		return Unknow_Point_Height_Normal;
	}
}
