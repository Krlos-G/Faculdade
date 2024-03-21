import java.io.*;

public class Ready {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\T33162\\OneDrive\\Documentos\\Cods\\redi");

        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else
            System.out.println("Arquivo existente");

        try {
            FileWriter fw = new FileWriter(arquivo, true);
            fw.write("Film: baloon in the heard of Ryan\n");
            fw.write("Film: The baseball bat of the Matheus\n");
            fw.write("Film: Carlos' fantastic colorful world");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            System.out.print("Filmes: [");
            while (br.ready()) {
                String linha = br.readLine();
                System.out.print(linha + " ");
            }
            System.out.println("]");
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
