using System;

namespace BankAccountManagementSystem
{
    class Program
    {
        static void Main(string[] args)
        {
            // var delegateExample = new Delegates.DelegateExample();
            // delegateExample.run();
            // Console.ReadKey();
            
            var notifier = new Delegates.Notifier();
            notifier.run();
            Console.ReadKey();
        }
    }
}