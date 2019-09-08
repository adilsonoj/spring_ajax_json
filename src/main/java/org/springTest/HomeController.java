package org.springTest;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class HomeController {
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }
	
	@RequestMapping(value="/dto", method = RequestMethod.POST)
	@ResponseBody
    public ObjetoDTO index(@RequestBody ObjetoDTO dto) {
        System.out.println(dto);
        return dto;
    }
	
	@RequestMapping(value="/lista", method = RequestMethod.POST)
	@ResponseBody
    public ArrayList<Objeto1> index(@RequestBody ArrayList<Objeto1> lista) {
        System.out.println(lista);
        return lista;
    }
	
	@RequestMapping(value="/obj", method = RequestMethod.POST)
	@ResponseBody
    public Objeto1 index(@RequestBody Objeto1 obj1) {
        System.out.println(obj1);
        return obj1;
    }
	
	//Não é possivel receber dois objetos por @RequestBody, por isso necessidade do DTO
	@RequestMapping(value="/obj1obj2", method = RequestMethod.POST)
	@ResponseBody
    public Objeto1 index( @RequestBody Objeto1 obj1,  Objeto2 obj2) {
        System.out.println(obj1);
        System.out.println(obj2);
        return obj1;
    }
	
	//recebe um objeto JSON porém não os converte para objeto JAVA
	@RequestMapping(value="/objectNode", method = RequestMethod.POST)
	@ResponseBody
    public void index( @RequestBody  ObjectNode objectNode) {
        System.out.println( objectNode.get("obj1"));
        System.out.println( objectNode.get("obj2"));
    }
}
