import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader=new BufferedReader(new FileReader("english-turkish.csv"));

        //hashmapimizi oluşturduk
        HashMap<String,String> dictionary=new HashMap<String,String>();
        //dictionary.put(dosya[1],dosya[2])
        //dictionary.put(key,value)
        HashMap<String,String> dictionaryValue=new HashMap<String,String>();
        String line;

        while((line=reader.readLine()) !=null){
            String[] mean= line.split(",",2);
            dictionary.put(mean[0],mean[1] );
            dictionaryValue.put(mean[1],mean[0]);
        }

        Scanner forWordScan =new Scanner(System.in);

        String word;
        while(true){

            System.out.println("kelimeyi arat");
            word= forWordScan.nextLine().toLowerCase();

            if(dictionary.containsKey(word)){
                System.out.println(dictionary.get(word));

            } else if (dictionary.containsValue(word)) {
                System.out.println(dictionaryValue.get(word));
            }else {
                System.out.println("kelime bulunamadı");
            }
        }


    }
}
