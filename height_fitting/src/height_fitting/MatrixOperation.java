package height_fitting;

public class MatrixOperation {


		public static double getHL(double[][] data)
		{
			double total = 0;
			int num = data.length;
			double[] nums = new double[num];
			System.out.println(data.length+" "+data[0].length);
			if (data.length != data[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				if (data.length == 2)
				{
					return data[0][0] * data[1][1] - data[0][1] * data[1][0];
				}
				for (int i = 0; i < num; i++)
				{
					if (i % 2 == 0)
					{
						nums[i] = data[0][i] * getHL(getDY(data, 1, i + 1));
					} else
					{   
						System.out.println("this si");
						nums[i] = -data[0][i] * getHL(getDY(data, 1, i + 1));
					}
				}
				for (int i = 0; i < num; i++)
				{
					total += nums[i];
				}
				// System.out.println("total=" + total);
			}
			return total;
		}

		public static float getHL(float[][] data)
		{
			float total = 0;
			int num = data.length;
			float[] nums = new float[num];
			if (data.length != data[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				if (data.length == 2)
				{
					return data[0][0] * data[1][1] - data[0][1] * data[1][0];
				}
				for (int i = 0; i < num; i++)
				{
					if (i % 2 == 0)
					{
						nums[i] = data[0][i] * getHL(getDY(data, 1, i + 1));
					} else
					{
						nums[i] = -data[0][i] * getHL(getDY(data, 1, i + 1));
					}
				}
				for (int i = 0; i < num; i++)
				{
					total += nums[i];
				}
				// System.out.println("total=" + total);
			}
			return total;
		}

		public static int getHL(int[][] data)
		{
			int total = 0;
			int num = data.length;
			int[] nums = new int[num];
			if (data.length != data[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				if (data.length == 2)
				{
					return data[0][0] * data[1][1] - data[0][1] * data[1][0];
				}
				for (int i = 0; i < num; i++)
				{
					if (i % 2 == 0)
					{
						nums[i] = data[0][i] * getHL(getDY(data, 1, i + 1));
					} else
					{
						nums[i] = -data[0][i] * getHL(getDY(data, 1, i + 1));
					}
				}
				for (int i = 0; i < num; i++)
				{
					total += nums[i];
				}
				// System.out.println("total=" + total);
			}
			return total;
		}
		public static double[][] getDY(double[][] data, int h, int v)
		{
			int H = data.length;
			int V = data[0].length;
			double[][] newData = new double[H - 1][V - 1];
			if (H != V)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < newData.length; i++)
				{

					if (i < h - 1)
					{
						for (int j = 0; j < newData[i].length; j++)
						{
							if (j < v - 1)
							{
								newData[i][j] = data[i][j];
							} else
							{
								newData[i][j] = data[i][j + 1];
							}
						}
					} else
					{
						for (int j = 0; j < newData[i].length; j++)
						{
							if (j < v - 1)
							{
								newData[i][j] = data[i + 1][j];
							} else
							{
								newData[i][j] = data[i + 1][j + 1];
							}
						}
					}
				}
			}
			return newData;
		}

		public static float[][] getDY(float[][] data, int h, int v)
		{
			int H = data.length;
			int V = data[0].length;
			float[][] newData = new float[H - 1][V - 1];
			if (H != V)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < newData.length; i++)
				{

					if (i < h - 1)
					{
						for (int j = 0; j < newData[i].length; j++)
						{
							if (j < v - 1)
							{
								newData[i][j] = data[i][j];
							} else
							{
								newData[i][j] = data[i][j + 1];
							}
						}
					} else
					{
						for (int j = 0; j < newData[i].length; j++)
						{
							if (j < v - 1)
							{
								newData[i][j] = data[i + 1][j];
							} else
							{
								newData[i][j] = data[i + 1][j + 1];
							}
						}
					}
				}
			}
			return newData;
		}

		public static int[][] getDY(int[][] data, int h, int v)
		{
			int H = data.length;
			int V = data[0].length;
			int[][] newData = new int[H - 1][V - 1];
			if (H != V)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < newData.length; i++)
				{

					if (i < h - 1)
					{
						for (int j = 0; j < newData[i].length; j++)
						{
							if (j < v - 1)
							{
								newData[i][j] = data[i][j];
							} else
							{
								newData[i][j] = data[i][j + 1];
							}
						}
					} else
					{
						for (int j = 0; j < newData[i].length; j++)
						{
							if (j < v - 1)
							{
								newData[i][j] = data[i + 1][j];
							} else
							{
								newData[i][j] = data[i + 1][j + 1];
							}
						}
					}
				}
			}
			return newData;
		}

		// ////////////////////////////////////////////////////////////////////////////////////
		public static double[][] getN(double[][] data)
		{	
			
			
			double[][] newData = new double[data.length][data.length];
			
			if(data.length==2&&data[0].length==2)
			{
				// when size is 2X2
				newData=getN2m2(data);
			       
			}else{
		
			if (data.length != data[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			}
			double A = getHL(data); //
			System.out.println("A Gethl");
			for (int i = 0; i < data.length; i++)
			{
				for (int j = 0; j < data.length; j++)
				{
					double num;
					if ((i + j) % 2 == 0)
					{
						System.out.println("B Gethl"+i+" "+j);
						num = getHL(getDY(data, i + 1, j + 1));
					} else
					{
						System.out.println("C Gethl");
						num = -getHL(getDY(data, i + 1, j + 1));
					}

					newData[i][j] = num / A;
				}
			}
			
			newData = getA_T(newData); 
							
			}
		
			return newData;
		}
		
		
		/**
		 * @author Ze Li
		 * @param data size is 2x2 is the suplementary of the original funcation for N operation
		 * @return the matrix
		 */
		public static double[][] getN2m2(double[][] data)
		{
			
			double[][] newmatrix=new double[2][2];
			newmatrix[0][0]=data[1][1];
			newmatrix[0][1]=-1*data[1][0];
			newmatrix[1][0]=-1*data[0][1];
			newmatrix[1][1]=1*data[0][0];
			
			return multiplyAb(1/(data[0][0]*data[1][1]-data[1][0]*data[0][1]),newmatrix);
			
		}

		public static float[][] getN(float[][] data)
		{
			float[][] newData = new float[data.length][data.length];
			if (data.length != data[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			}
			float A = getHL(data); //
			for (int i = 0; i < data.length; i++)
			{
				for (int j = 0; j < data.length; j++)
				{
					float num;
					if ((i + j) % 2 == 0)
					{
						num = getHL(getDY(data, i + 1, j + 1));
					} else
					{
						num = -getHL(getDY(data, i + 1, j + 1));
					}

					newData[i][j] = num / A;
				}
			}
			newData = getA_T(newData); //
			return newData;
		}

		public static float[][] getN(int[][] data)
		{
			float[][] newData = new float[data.length][data.length];
			if (data.length != data[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			}
			float A = getHL(data); // 
			for (int i = 0; i < data.length; i++)
			{
				for (int j = 0; j < data.length; j++)
				{
					float num;
					if ((i + j) % 2 == 0)
					{
						num = getHL(getDY(data, i + 1, j + 1));
					} else
					{
						num = -getHL(getDY(data, i + 1, j + 1));
					}

					newData[i][j] = num / A;
				}
			}
			newData = getA_T(newData); // 
			return newData;
		}

		// //////////////////////////////////////////////////////////////////////////
		public static double[][] getA_T(double[][] A)
		{
			int h = A.length; // 4
			int v = A[0].length; // 3
			double[][] A_T = new double[v][h];
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < v; j++)
				{
					A_T[j][i] = A[i][j];
				}
			}
			return A_T;
		}

		public static float[][] getA_T(float[][] A)
		{
			int h = A.length;
			int v = A[0].length;
			float[][] A_T = new float[v][h];
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < v; j++)
				{
					A_T[j][i] = A[i][j];
				}
			}
			return A_T;
		}

		public static int[][] getA_T(int[][] A)
		{
			int h = A.length;
			int v = A[0].length;
			int[][] A_T = new int[v][h];
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < v; j++)
				{
					A_T[j][i] = A[i][j];
				}
			}
			return A_T;
		}

		// //////////////////////////////////////////////////////////////////////////////////
		public static double[][] multiplyAB(double[][] matrixA, double[][] matrixB)
		{
			double[][] matrixAB = new double[matrixA.length][matrixB[0].length];

			if (matrixA[0].length != matrixB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					for (int j = 0; j < matrixB[0].length; j++)
					{
						double sum = 0;
						for (int k = 0; k < matrixB.length; k++)
						{
							sum = sum + matrixA[i][k] * matrixB[k][j];
						}
						matrixAB[i][j] = sum;
					}
				}
			}

			return matrixAB;
		}

		public static float[][] multiplyAB(float[][] matrixA, float[][] matrixB)
		{
			float[][] matrixAB = new float[matrixA.length][matrixB[0].length];

			if (matrixA[0].length != matrixB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					for (int j = 0; j < matrixB[0].length; j++)
					{
						float sum = 0;
						for (int k = 0; k < matrixB.length; k++)
						{
							sum = sum + matrixA[i][k] * matrixB[k][j];
						}
						matrixAB[i][j] = sum;
					}
				}
			}

			return matrixAB;
		}

		public static float[][] multiplyAB(int[][] matrixA, float[][] matrixB)
		{
			float[][] matrixAB = new float[matrixA.length][matrixB[0].length];
			if (matrixA[0].length != matrixB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					for (int j = 0; j < matrixB[0].length; j++)
					{
						float sum = 0;
						for (int k = 0; k < matrixB.length; k++)
						{
							sum = sum + matrixA[i][k] * matrixB[k][j];
						}
						matrixAB[i][j] = sum;
					}
				}
			}
			return matrixAB;
		}

		public static float[][] multiplyAB(float[][] matrixA, int[][] matrixB)
		{
			float[][] matrixAB = new float[matrixA.length][matrixB[0].length];
			if (matrixA[0].length != matrixB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					for (int j = 0; j < matrixB[0].length; j++)
					{
						float sum = 0;
						for (int k = 0; k < matrixB.length; k++)
						{
							sum = sum + matrixA[i][k] * matrixB[k][j];
						}
						matrixAB[i][j] = sum;
					}
				}
			}
			return matrixAB;
		}

		public static double[][] multiplyAB(double[][] matrixA, int[][] matrixB)
		{
			double[][] matrixAB = new double[matrixA.length][matrixB[0].length];
			if (matrixA[0].length != matrixB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					for (int j = 0; j < matrixB[0].length; j++)
					{
						double sum = 0;
						for (int k = 0; k < matrixB.length; k++)
						{
							sum = sum + matrixA[i][k] * matrixB[k][j];
						}
						matrixAB[i][j] = sum;
					}
				}
			}
			return matrixAB;
		}

		public static int[][] multiplyAB(int[][] matrixA, int[][] matrixB)
		{
			int[][] matrixAB = new int[matrixA.length][matrixB[0].length];
			if (matrixA[0].length != matrixB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					for (int j = 0; j < matrixB[0].length; j++)
					{
						int sum = 0;
						for (int k = 0; k < matrixB.length; k++)
						{
							sum = sum + matrixA[i][k] * matrixB[k][j];
						}
						matrixAB[i][j] = sum;
					}
				}
			}
			return matrixAB;
		}

		public static double[] multiplyAB(double[][] matrixA, double[] arryB)
		{
			double[] matrixAB = new double[matrixA.length];

			if (matrixA[0].length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					double sum = 0;
					for (int j = 0; j < matrixA[0].length; j++)
					{
						sum = sum + matrixA[i][j] * arryB[j];
					}
					matrixAB[i] = sum;
				}
			}

			return matrixAB;
		}

		public static float[] multiplyAB(float[][] matrixA, float[] arryB) 
		{
			float[] matrixAB = new float[matrixA.length];

			if (matrixA[0].length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					float sum = 0;
					for (int j = 0; j < matrixA[0].length; j++)
					{
						sum = sum + matrixA[i][j] * arryB[j];
					}
					matrixAB[i] = sum;
				}
			}

			return matrixAB;
		}

		public static double[] multiplyAB(double[][] matrixA, float[] arryB)
		{
			double[] matrixAB = new double[matrixA.length];

			if (matrixA[0].length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < matrixA.length; i++)
				{
					double sum = 0;
					for (int j = 0; j < matrixA[0].length; j++)
					{
						sum = sum + matrixA[i][j] * arryB[j];
					}
					matrixAB[i] = sum;
				}
			}

			return matrixAB;
		}

		// /////////////////////////////////////////////////////////////////////////////
		public static double[][] multiplyAb(double a, double[][] A)
		{
			double[][] aA = new double[A.length][A[0].length];

			for (int i = 0; i < A.length; i++)
			{
				for (int j = 0; j < A[0].length; j++)
				{
					aA[i][j] = a * A[i][j];
				}
			}

			return aA;
		}
		
		

		public static float[][] multiplyAb(float a, float[][] A)
		{
			float[][] aA = new float[A.length][A[0].length];

			for (int i = 0; i < A.length; i++)
			{
				for (int j = 0; j < A[0].length; j++)
				{
					aA[i][j] = a * A[i][j];
				}
			}

			return aA;
		}

		public static float[][] multiplyAb(int a, float[][] A)
		{
			float[][] aA = new float[A.length][A[0].length];

			for (int i = 0; i < A.length; i++)
			{
				for (int j = 0; j < A[0].length; j++)
				{
					aA[i][j] = a * A[i][j];
				}
			}

			return aA;
		}

		public static int[][] multiplyAb(int a, int[][] A)
		{
			int[][] aA = new int[A.length][A[0].length];
			for (int i = 0; i < A.length; i++)
			{
				for (int j = 0; j < A[0].length; j++)
				{
					aA[i][j] = a * A[i][j];
				}
			}
			return aA;
		}

		public static float[][] multiplyAb(float a, int[][] A)
		{
			float[][] aA = new float[A.length][A[0].length];
			for (int i = 0; i < A.length; i++)
			{
				for (int j = 0; j < A[0].length; j++)
				{
					aA[i][j] = a * A[i][j];
				}
			}
			return aA;
		}

		public static double[] multiplyAb(double a, double[] Arry)
		{
			double[] aA = new double[Arry.length];

			for (int i = 0; i < Arry.length; i++)
			{
				aA[i] = a * Arry[i];
			}

			return aA;
		}
		
		public static float[] multiplyAb(float a, float[] Arry)
		{
			float[] aA = new float[Arry.length];

			for (int i = 0; i < Arry.length; i++)
			{
				aA[i] = a * Arry[i];
			}

			return aA;
		}

		// ////////////////////////////////////////////////////////////////////////////
		public static int[][] addAB(int[][] A, int[][] B)
		{
			int[][] ABadd = new int[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABadd[i][j] = A[i][j] + B[i][j];
					}
				}
			}
			return ABadd;
		}

		public static float[][] addAB(float[][] A, float[][] B)
		{
			float[][] ABadd = new float[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABadd[i][j] = A[i][j] + B[i][j];
					}
				}
			}
			return ABadd;
		}

		public static double[][] addAB(double[][] A, double[][] B)
		{
			double[][] ABadd = new double[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABadd[i][j] = A[i][j] + B[i][j];
					}
				}
			}
			return ABadd;
		}

		public static float[][] addAB(int[][] A, float[][] B)
		{
			float[][] ABadd = new float[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABadd[i][j] = A[i][j] + B[i][j];
					}
				}
			}
			return ABadd;
		}

		public static double[][] addAB(int[][] A, double[][] B)
		{
			double[][] ABadd = new double[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABadd[i][j] = A[i][j] + B[i][j];
					}
				}
			}
			return ABadd;
		}

		public static float[][] addAB(float[][] A, int[][] B)
		{
			float[][] ABadd = new float[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABadd[i][j] = A[i][j] + B[i][j];
					}
				}
			}
			return ABadd;
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////
		public static double[] addArry(double[] arryA, double[] arryB)
		{
			double[] addArry = new double[arryA.length];
			if (arryA.length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < arryA.length; i++)
				{
					addArry[i] = arryA[i] + arryB[i];
				}
			}
			return addArry;
		}

		public static float[] addArry(float[] arryA, float[] arryB)
		{
			float[] addArry = new float[arryA.length];
			if (arryA.length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < arryA.length; i++)
				{
					addArry[i] = arryA[i] + arryB[i];
				}
			}
			return addArry;
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////
	/*	public static double[] normArry(double[] arryA)
		{
			double[] normArry = new double[arryA.length];
			double norm = Math.sqrt(Statistics.sumOfSquare(arryA));
			if (norm == 0)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < arryA.length; i++)
				{
					normArry[i] = arryA[i] / norm;
				}
			}
			return normArry;
		}
		
		
		public static float[] normArry(float[] arryA)
		{
			float[] normArry = new float[arryA.length];
			float norm = (float) Math.sqrt(Statistics.sumOfSquare(arryA));
			if (norm == 0)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < arryA.length; i++)
				{
					normArry[i] = arryA[i] / norm;
				}
			}
			return normArry;
		}
*/
		// ////////////////////////////////////////////////////////////////////////////
		public static int[][] minusAB(int[][] A, int[][] B)
		{
			int[][] ABminus = new int[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABminus[i][j] = A[i][j] - B[i][j];
					}
				}
			}
			return ABminus;
		}

		public static float[][] minusAB(float[][] A, int[][] B)
		{
			float[][] ABminus = new float[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABminus[i][j] = A[i][j] - B[i][j];
					}
				}
			}
			return ABminus;
		}

		public static float[][] minusAB(float[][] A, float[][] B)
		{
			float[][] ABminus = new float[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABminus[i][j] = A[i][j] - B[i][j];
					}
				}
			}
			return ABminus;
		}

		public static double[][] minusAB(double[][] A, double[][] B)
		{
			double[][] ABminus = new double[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABminus[i][j] = A[i][j] - B[i][j];
					}
				}
			}
			return ABminus;
		}

		public static float[][] minusAB(int[][] A, float[][] B)
		{
			float[][] ABminus = new float[A.length][A[0].length];
			if (A.length != B.length || A[0].length != B[0].length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < A.length; i++)
				{
					for (int j = 0; j < A.length; j++)
					{
						ABminus[i][j] = A[i][j] - B[i][j];
					}
				}
			}
			return ABminus;
		}

		public static float[] minusArry(float[] arryA, float[] arryB)
		{
			float[] arryMinus = new float[arryA.length];
			if (arryA.length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < arryA.length; i++)
				{
					arryMinus[i] = arryA[i] - arryB[i];
				}
			}
			return arryMinus;
		}

		public static double[] minusArry(double[] arryA, double[] arryB)
		{
			double[] arryMinus = new double[arryA.length];
			if (arryA.length != arryB.length)
			{
				System.out.println("MatrixOperate");
				System.exit(0);
			} else
			{
				for (int i = 0; i < arryA.length; i++)
				{
					arryMinus[i] = arryA[i] - arryB[i];
				}
			}
			return arryMinus;
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////
		public static int[][] getDiag(int[] A)
		{
			int[][] B = new int[A.length][A.length];
			for (int i = 0; i < A.length; i++)
			{
				B[i][i] = A[i];
			}
			return B;
		}

		public static float[][] getDiag(float[] A)
		{
			float[][] B = new float[A.length][A.length];
			for (int i = 0; i < A.length; i++)
			{
				B[i][i] = A[i];
			}
			return B;
		}

		public static double[][] getDiag(double[] A)
		{
			double[][] B = new double[A.length][A.length];
			for (int i = 0; i < A.length; i++)
			{
				B[i][i] = A[i];
			}
			return B;
		}

		public static int[][] getDiag(int a, int n)
		{
			int[][] B = new int[n][n];
			for (int i = 0; i < n; i++)
			{
				B[i][i] = a;
			}
			return B;
		}

		public static float[][] getDiag(float a, int n)
		{
			float[][] B = new float[n][n];
			for (int i = 0; i < n; i++)
			{
				B[i][i] = a;
			}
			return B;
		}

		public static double[][] getDiag(double a, int n)
		{
			double[][] B = new double[n][n];
			for (int i = 0; i < n; i++)
			{
				B[i][i] = a;
			}
			return B;
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////
		public static int[] copyRowArry(int row, int[][] A)
		{
			int[] oneRow = new int[A[0].length]; //
			for (int i = 0; i < A[0].length; i++)
			{
				oneRow[i] = A[row - 1][i];
			}
			return oneRow;
		}

		public static float[] copyRowArry(int row, float[][] A)
		{
			float[] oneRow = new float[A[0].length];
			for (int i = 0; i < A[0].length; i++)
			{
				oneRow[i] = A[row - 1][i];
			}
			return oneRow;
		}

		public static double[] copyRowArry(int row, double[][] A)
		{
			double[] oneRow = new double[A[0].length];
			for (int i = 0; i < A[0].length; i++)
			{
				oneRow[i] = A[row - 1][i];
			}
			return oneRow;
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////
		public static int[] copyLineArry(int[][] A, int line)
		{
			int[] oneRow = new int[A.length];
			for (int i = 0; i < A.length; i++)
			{
				oneRow[i] = A[i][line - 1];
			}
			return oneRow;
		}

		public static float[] copyLineArry(float[][] A, int line)
		{
			float[] oneRow = new float[A.length];
			for (int i = 0; i < A.length; i++)
			{
				oneRow[i] = A[i][line - 1];
			}
			return oneRow;
		}

		public static double[] copyLineArry(double[][] A, int line)
		{
			double[] oneRow = new double[A.length];
			for (int i = 0; i < A.length; i++)
			{
				oneRow[i] = A[i][line - 1];
			}
			return oneRow;
		}

	}


