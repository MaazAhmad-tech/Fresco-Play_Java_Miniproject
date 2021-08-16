import java.io.*;
import java.util.Random;
import java.util.Scanner;

// Write your code below.
//
class EncryptDecryptFile{

    public  EncryptDecryptFile(){}


    public void writeDecryptionFile(String message) throws IOException{
        String encryptFilename = FileSolution.filepath + "DecryptionFile.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(encryptFilename));
        writer.write(message);
        writer.close();
    }

    public String readEncryptionFile() throws IOException{
        String decryptFilename = FileSolution.filepath + "EncryptionFile.txt";
        BufferedReader reader = new BufferedReader(new FileReader(decryptFilename));
        String messageFromFile = reader.readLine();
        reader.close();
        return messageFromFile;
    }
}

public class FileSolution {
    public static String filepath = System.getenv("OUTPUT_PATH").substring(0, System.getenv("OUTPUT_PATH").lastIndexOf("\\") + 1);

    private static String generateString()
    {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder generatedString = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            char c = chars[random.nextInt(chars.length)];
            generatedString.append(c);
        }
        return generatedString.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        try{
            EncryptDecryptFile f = new EncryptDecryptFile ();

            String encryptFilename = FileSolution.filepath + "EncryptionFile.txt";
            String generatedString = generateString();
            BufferedWriter writer = new BufferedWriter(new FileWriter(encryptFilename));
            writer.write(generatedString);
            writer.close();

            if(f.readEncryptionFile().equals(generatedString))
            {
                f.writeDecryptionFile(message);

                String decryptFilename = FileSolution.filepath + "DecryptionFile.txt";
                BufferedReader reader = new BufferedReader(new FileReader(decryptFilename));
                String messageFromFile = reader.readLine();
                reader.close();

                System.out.println(messageFromFile);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}