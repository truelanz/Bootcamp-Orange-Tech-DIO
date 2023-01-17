package edu.truelanz.desafio1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso MySQL");
        curso2.setDescricao("descrição curso MySQL");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTruelanz = new Dev();
        devTruelanz.setNome("LaNz");
        devTruelanz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos truelanz " + devTruelanz.getConteudosInscritos());

        devTruelanz.progredir();
        devTruelanz.progredir();
        devTruelanz.progredir();
        System.out.println("\n...");

        System.out.println("Conteudos Inscritos truelanz " + devTruelanz.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos truelanz " + devTruelanz.getConteudosConcluidos());
        System.out.println("XP: " + devTruelanz.calcularTotalXp());
        
        System.out.println("-------------------------------------------------------");
        
        Dev devPedro = new Dev();
        devPedro.setNome("Joao");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João " + devPedro.getConteudosInscritos());
        
        /* devPedro.progredir();
        devPedro.progredir(); */
        System.out.println("\n...");
        
        System.out.println("Conteudos Inscritos João " + devPedro.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos João " + devTruelanz.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
        
    }
    
}
