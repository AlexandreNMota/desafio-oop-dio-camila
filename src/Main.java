import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("descrição do curso JAVA");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JAVASCRIPT");
        curso2.setDescricao("descrição do curso JAVASCRIPT");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição da mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("JAVA DIO");
        bootcamp.setDescricao("Bootcamp da DIO para JAVA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev alexandre = new Dev();
        alexandre.setNome("Alexandre");
        alexandre.inscreverBootcamp(bootcamp);
        Dev pedro = new Dev();
        pedro.setNome("Pedro");
        pedro.inscreverBootcamp(bootcamp);



        alexandre.progredir();
        alexandre.progredir();
        System.out.println(alexandre.getConteudosInscritos());
        System.out.println(alexandre.getConteudosConcluidos());


        System.out.println(pedro.getConteudosInscritos());
        System.out.println(pedro.getConteudosConcluidos());

        pedro.progredir();
        System.out.println(alexandre.calcularTotalXp());
        System.out.println(pedro.calcularTotalXp());



    }
}
