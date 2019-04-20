import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        String root="";
        File f=new File("C:\\Users\\Cyrano\\Documents\\employees.json");
        char veriler[]=new char [(int) f.length()];

        FileReader f2=new FileReader(f);
        f2.read(veriler);
        String okunan=new String(veriler);
        System.out.println(okunan);
        f2.close();

        org.json.JSONObject jsonFileObject = new org.json.JSONObject(okunan);
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<"+root+">"
                + org.json.XML.toString(jsonFileObject) + "</"+root+">";
        System.out.println(xml);

        File fw=new File("C:\\Users\\Cyrano\\Documents\\Output.xml");
        FileWriter yazdir=new FileWriter(fw);
        yazdir.write(xml);
        yazdir.close();

    }
}
