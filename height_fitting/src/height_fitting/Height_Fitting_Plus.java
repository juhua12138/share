package height_fitting;

public class Height_Fitting_Plus
{
	/**
	 * �������ܣ�
	 * ������ڵ���3����ĸ�˹�������Ϣ��ͨ��ƽ���������ض���������ߣ�
	 * 
	 * ���������
	 * double[][] Know_Coordinate����֪�����꣬�����̶�Ϊ2����������ڵ���3,ÿ�и�ʽ[x,y]
	 * double[] Know_Point_Height_GPS����֪���ظ�
	 * double[] Know_Point_Height_Normal����֪��������
	 * double Unknow_Point_Height_GPS��δ֪���ظ�
	 * double[] Unknow_Coordinate��λ�õ����꣬[x,y]
	 * 
	 * �����
	 * double Unknow_Point_Height_Normal:λ�õ�������
	 */
	
	public static double Plane_Height_Fitting(double[][] Know_Coordinate, double[] Know_Point_Height_GPS,
			double[] Know_Point_Height_Normal, double Unknow_Point_Height_GPS, double[] Unknow_Coordinate)
	{
		int Point_Number = Know_Coordinate.length;
		double[][] Know_Point_XY = new double[Point_Number][3];
		for (int i = 0; i < Point_Number; i++)
		{
			Know_Point_XY[i][0] = 1;
			Know_Point_XY[i][1] = Know_Coordinate[i][0];
			Know_Point_XY[i][2] = Know_Coordinate[i][1];
		}
		double[][] pass0 = MatrixOperation.getA_T(Know_Point_XY);
		double[][] pass1 = MatrixOperation.multiplyAB(pass0, Know_Point_XY);
		double[][] pass2 = MatrixOperation.multiplyAB(MatrixOperation.getN(pass1),MatrixOperation.getA_T(Know_Point_XY));
		double[] pass3 = MatrixOperation.minusArry(Know_Point_Height_GPS, Know_Point_Height_Normal);
		double[] Optimal_Parameters = MatrixOperation.multiplyAB(pass2, pass3);
		double[] Unknow_Point_XY = new double[3];
		Unknow_Point_XY[0] = 1;
		Unknow_Point_XY[1] = Unknow_Coordinate[0];
		Unknow_Point_XY[2] = Unknow_Coordinate[1];
		double Unknow_Point_Height_Normal = 0;
		double Unknow_Height_Unnormal = 0;
		Unknow_Height_Unnormal = Unknow_Point_XY[0] * Optimal_Parameters[0] + Unknow_Point_XY[1] * Optimal_Parameters[1]
				+ Unknow_Point_XY[2] * Optimal_Parameters[2];
		Unknow_Point_Height_Normal = Unknow_Point_Height_GPS - Unknow_Height_Unnormal;
		return Unknow_Point_Height_Normal;
	}

}
