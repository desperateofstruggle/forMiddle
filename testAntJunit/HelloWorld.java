public class HelloWorld {
   public String Hello(){
       return "Hello World!";
   }
   public static void main(String [] args){
       HelloWorld helloworld = new HelloWorld();
       System.out.println(helloworld.Hello());
   }
}