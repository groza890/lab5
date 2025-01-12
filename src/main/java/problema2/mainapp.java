package problema2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class mainapp {

    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/perecheNumere.json");
            mapper.writeValue(file, lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file = new File("src/main/resources/perecheNumere.json");
            ObjectMapper mapper = new ObjectMapper();
            List<PerecheNumere> lista = mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {
            });
            return lista;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> lista = citire();
        System.out.println(lista);

        for (PerecheNumere p : lista)
            System.out.println(p + " ");

        scriere(lista);
    }


}
