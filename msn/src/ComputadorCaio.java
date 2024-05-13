public class ComputadorCaio {
   public static void main(String[] args) {
      MSNMessenger msn = new MSNMessenger();
      msn.receberMensagem();
      msn.enviarMensagem();

      System.out.println("MSN");

      FacebookMessenger facebook = new FacebookMessenger();
      facebook.receberMensagem();
      facebook.enviarMensagem();

      System.out.println("Facebook");

      TelegramMessenger telegram = new TelegramMessenger();
      telegram.receberMensagem();
      telegram.enviarMensagem();

      System.out.println("Telegram");
   }
   
    
}
