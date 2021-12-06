import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String arquivo = "C:\\Users\\gabriel villela\\OneDrive\\FACULDADE\\teste\\bomdia.txt";
	
		//jeito "Moderno" a partir do Java 7 é possível instanciar o file e buffe dentro do parametro do file exemplo....
		try (BufferedReader br = new BufferedReader (new FileReader(arquivo))) { 
			
			String linha = br.readLine(); //para ler a primeira linha
			
			while (linha != null) { //caso o ja esteja na útlima linha irá dá resultado de nulo, para ir lendo a próxima linha cria a condição while
				System.out.println(linha); //mostra a linha
				linha = br.readLine(); //lendo a próxima linha
			}	
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}