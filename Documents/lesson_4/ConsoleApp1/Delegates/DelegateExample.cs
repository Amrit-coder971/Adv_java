using System;

namespace Delegates
{
    public delegate int ArithmeticOperation(int x, int y);
    internal class DelegateExample
    {
        public void run()
        { 
            //delegate instantiation
            ArithmeticOperation del1 = new ArithmeticOperation(ArithmeticClass.Add);
            ArithmeticOperation del2 = ArithmeticClass.Add;

            //multicast delegate (adding multiple methods )
            del1 += ArithmeticClass.Subtract;
            del1 += ArithmeticClass.Multiply;
            
            //removing  method 
           del1 -= ArithmeticClass.Subtract;

            int sum = del1(20, 10);
            int sum1 = del2.Invoke(30, 10);

        }
    }

    class ArithmeticClass{
        public static int Add(int a, int b)
        {
            var output = a + b;
            Console.WriteLine("Addition Result: " + output);
            return output;
        }

        public static int Subtract(int a, int b)
        {
            var output = a - b;
            Console.WriteLine("Subtraction Result: " + output);

            return output;
        }
        public static int Multiply(int a, int b)
        {
            var output = a * b;
            Console.WriteLine("Multiplication Result: " + output);
            return output;
        }

       
      
    }
}