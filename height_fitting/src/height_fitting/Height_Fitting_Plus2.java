package height_fitting;

public class Height_Fitting_Plus2
{
	public static double[] Plane_Height_Fitting(double[][] Know_Point_Information,double[][] Unknow_Point_Information)
	{
		/**
		 * �������ܣ�
		 * GPS�߳��쳣��Ϸ�������ƽ����Ϸ���������ڵ���3����ĸ�˹�������Ϣ��ͨ��ƽ���������ض���������ߣ�
		 * 
		 * ���������
		 * Know_Point_Information[][]����֪����Ϣ��ÿ��Ϊһ����֪����Ϣ���ֱ�Ϊ��˹����x��y����ظ�H��������h�����������ڵ���3������Ϊ4��
		 * Unknow_Poing_Information[][]��δ֪����Ϣ��ÿ��Ϊһδ֪����Ϣ���ֱ�Ϊ��˹����x��y����ظ�H�����������⣬����Ϊ3��
		 * 
		 * �����
		 * Unknow_Point_Height_Normal[]��δ֪��������h��
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
