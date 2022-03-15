import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    for(int i=0;i<=100;i++)
      {
        if(i%2==0)
          System.out.print(i+ " ");
      }
     System.out.println(" ");
    
    //Dodatkowe zadanie
    System.out.print("Podaj liczbe: ");
    Scanner wpisz = new Scanner(System.in);
      int liczba;
      liczba = wpisz.nextInt();
      if(liczba%2==0)
      {
        System.out.println("Twoja liczba jest parzysta");
      }  
      else
      {
        System.out.println("Twoja liczba nie jest parzysta");
      }
    
  
    } 
}