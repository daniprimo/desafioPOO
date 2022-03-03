import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(7);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria Java");
        mentoria1.setData(LocalDate.now());


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Develooper");
        bootcamp.setDescricao("Descrição do Develooper Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootCamp(bootcamp);
        System.out.println(devDaniel.getNome()+" esta inscrito nos conteudos "+ devDaniel.getConteudosInscritos());
        System.out.println("*****");
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println(devDaniel.getNome()+" concluiu os seguintes conteudos "+ devDaniel.getConteudosInscritos());
        System.out.println(devDaniel.getNome()+" esta ainda cursando os seguintes conteudos "+ devDaniel.getConteudosConcluidos());
        System.out.println("XP: "+ devDaniel.calcularTotalXp());

        System.out.println("*****");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootCamp(bootcamp);
        System.out.println(devPedro.getNome()+" esta inscrito nos conteudos "+ devPedro.getConteudosInscritos());
        System.out.println("*****");
        devPedro.progredir();
        System.out.println(devDaniel.getNome()+" concluiu os seguintes conteudos "+ devDaniel.getConteudosInscritos());
        System.out.println(devDaniel.getNome()+" esta ainda cursando os seguintes conteudos "+ devDaniel.getConteudosConcluidos());
        System.out.println("XP: "+ devPedro.calcularTotalXp());




    }
}
