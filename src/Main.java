

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("C:\\json.txt")) {
            byte[] buf = new byte[file.available()];
            file.read(buf);
            String text = new String(buf);

            Gson gson = new GsonBuilder().create();
            ContactsOfePerson contact = gson.fromJson(text, ContactsOfePerson.class);

            System.out.println(contact);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}