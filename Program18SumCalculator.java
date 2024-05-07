public class Program18SumCalculator {

    public static void main(String[] args)
    {
        Program18SumCalculator calculator = new Program18SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionalResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }




    double firstNumber, secondNumber;

    public double getFirstNumber()
    {
        return firstNumber;
    }
    public double getSecondNumber()
    {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber=secondNumber;
    }
    public double getAdditionalResult()
    {
        return getFirstNumber()+getSecondNumber();
    }
    public double  getSubtractionResult()
    {
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult()
    {
        return getFirstNumber()*getSecondNumber();
    }
    public double  getDivisionResult()
    {
        double x = getSecondNumber();
        if(x==0)
        {
            return 0;

        }
        else {
            return getFirstNumber() / getSecondNumber();
        }
    }



}
