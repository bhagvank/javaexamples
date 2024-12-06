

public class ExpressionPerformanceExample
{

  public static void main(String[] args)
  {
     int i=2;
    long timeinnanos1 = System.nanoTime();
	int op1 = 0;
	for(int j=0; j< 1000000000; j++)
	{
      op1 +=  2 * i * i;
    }
	long timeinnanos2 = System.nanoTime();
	System.out.println("Time taken for op1 :"+ (timeinnanos2-timeinnanos1)+ " nanos");
	
	long timeinnanos3 = System.nanoTime();
	int op2 = 0;
	for(int k=0; k< 1000000000; k++)
	{
      op2 +=  2 * (i * i);
    }
	long timeinnanos4 = System.nanoTime();
	System.out.println("Time taken for op2 :"+ (timeinnanos4-timeinnanos3)+ " nanos");
  
  }

}