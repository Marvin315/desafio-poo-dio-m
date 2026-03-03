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

        System.out.println(curso1);
        System.out.println("-----------------------");
        System.out.println(curso2);
        System.out.println("-----------------------");
        System.out.println(mentoria);




    }


    }

