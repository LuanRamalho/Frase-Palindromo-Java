import java.util.Scanner;

public class FrasePalindromo 
{

    public static void main(String[] args) 
    {
        
        Scanner entrada = new Scanner(System.in);
        String entradaNormal = ""; //armazena entrada
        String entradaInvertida = ""; //armazena entrada invertida

        System.out.println("Digite palavras, frases ou valores numéricos: ");
        entradaNormal = entrada.nextLine();

        //inverte a entrada
        for(int i = entradaNormal.length() -1; i >= 0; --i)
        {
          entradaInvertida += entradaNormal.charAt(i);
        }
	
        //compara a entrada normal e invertida, ignorando letras maiúsculas ou minúsculas 	
         if (entradaNormal.equalsIgnoreCase(entradaInvertida))
          System.out.println("Palíndromo!");
               else
                System.out.println("Não é Palíndromo!");

    }
    
}
