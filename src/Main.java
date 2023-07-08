import br.com.dio.leandro.entities.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Mentoria mentoria1 = new Mentoria("Mentoria de Java Spring", "Descrição", LocalDate.now());
        System.out.println(mentoria1.toString());
        }
    }
