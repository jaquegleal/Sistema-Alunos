package com.sistemaalunos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sistemaalunos.models.Aluno;
import com.sistemaalunos.repository.AlunoRepository;

@Controller
public class AlunoController{
	
	@Autowired
	private AlunoRepository alre;
	
	@RequestMapping(value="/cadastrarAluno", method=RequestMethod.GET)
	public String form() {
		return "formAluno";
		
	}
	
	@RequestMapping(value="/cadastrarAluno", method=RequestMethod.POST)
	public String form(Aluno aluno) {
		
		alre.save(aluno);
		
		return "redirect:/CadastrarAluno";
		
		
	}
	@RequestMapping("/alunos")
	public ModelAndView listaAlunos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Aluno> alunos = alre.findAll();
		mv.addObject("alunos", alunos);
		return mv;
		

		
	}
	
	
}
