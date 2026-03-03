package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java da DIO");
        curso1.setDescricao("Descrição do curso de JAVA");
        curso1.setCargaHoraria(38);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript da DIO");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(15);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria do java");
        mentoria.setData(LocalDate.now());


       /*
        System.out.println(curso1);
        System.out.println("-----------------------");
        System.out.println(curso2);
        System.out.println("-----------------------");
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp java para desenvolvedores");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos:" + devMarcos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + devMarcos.getConteudosConcluidos());
        System.out.println("XP: "+ devMarcos.calcularXp());

        System.out.println("---------------------------------------");

        Dev devMaria = new Dev();
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.setNome("Maria");
        System.out.println("Conteúdos Inscritos:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:" + devMaria.getConteudosConcluidos());
        System.out.println("XP: "+ devMaria.calcularXp());



    }


    }

