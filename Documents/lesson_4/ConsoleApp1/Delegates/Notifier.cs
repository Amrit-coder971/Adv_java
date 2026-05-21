using System;

namespace Delegates
{
    public delegate void NotifierUser(string message);
    internal class Notifier
    {
        public void run()
        {
            NotifierUser notifier = Notifiers.SendPushNotification;
            notifier += Notifiers.SendSMS;
            notifier += Notifiers.SendEmail;


            notifier("your order is ready");
        }
        
    }
    class Notifiers
    {
        public static void SendEmail(string message)
        {
            Console.WriteLine($"Email sent: {message}");
        }

        public static void SendSMS(string message)
        {
            Console.WriteLine($"SMS sent: {message}");
        }
        public static void SendPushNotification(string message)
        {
            Console.WriteLine($"Push notification sent: {message}");
        }
        

            
       
    }

}