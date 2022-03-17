package br.com.dio.desafio.dominio;


import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descricao curso Java");
		curso1.setCargaHoraria(8);
		
        Curso curso2 = new Curso();
		
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria ();
		
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp ();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Decrição Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("------------------------------------");
		
		Dev devRodrigo = new Dev ();
		devRodrigo.setNome("Rodrigo");
		devRodrigo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Rodrigo:" + devRodrigo.getConteudosInscritos());
		devRodrigo.progredir();
		System.out.println("Conteudos Concluidos de Rodrigo:" + devRodrigo.getConteudosConcluidos());
		
		System.out.println("------------------------------------");
		
		Dev devJefferson = new Dev ();
		devJefferson.setNome("Jefferson");
		devJefferson.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Jefferson:" + devJefferson.getConteudosInscritos());
		devJefferson.progredir();
		System.out.println("Conteudos Concluidos de Jefferson:" + devJefferson.getConteudosConcluidos());
		
	}

	

}
