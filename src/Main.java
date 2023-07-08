import br.com.dio.leandro.entities.Bootcamp;
import br.com.dio.leandro.entities.Curso;
import br.com.dio.leandro.entities.Dev;
import br.com.dio.leandro.entities.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Mentoria mentoria1 = new Mentoria("Mentoria de Java Spring", "Descrição", LocalDate.now());
        System.out.println(mentoria1.toString());

        Curso curso1 = new Curso("Poo", "POO em java", 4.0);
        Curso curso2 = new Curso("Spring", "Desenvolvimento web em java", 16.0);

        Bootcamp bootcamp1 = new Bootcamp("Java Banco Pan", "Java Developer");
        bootcamp1.getConteudosList().add(curso1);
        bootcamp1.getConteudosList().add(curso2);
        bootcamp1.getConteudosList().add(mentoria1);


        Dev devLeandro = new Dev("Leandro");
        Dev devJoao = new Dev("Joao");

        devLeandro.progredir();
        System.out.println(devLeandro.calcularTotalXp());

        System.out.println(devLeandro.getConteudosInscritos());
        System.out.println(devJoao.getConteudosInscritos());

        devLeandro.inscreverBootcamp(bootcamp1);
        devJoao.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos Inscritos Leandro -> " + devLeandro.getConteudosInscritos());

        devLeandro.progredir();

        System.out.println("Conteudos Concluidos Leandro -> " + devLeandro.getConteudosConcluido());

        System.out.println("Conteudos Inscritos Leandro -> " + devLeandro.getConteudosInscritos());


        System.out.println(devLeandro.calcularTotalXp());



    }
    }
