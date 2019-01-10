package controller;

import java.util.HashMap;
import java.util.Map;

import model.FuncionarioModel;
import wsclient.RESTConnectionV3;

public class LoginController {
	
	public FuncionarioModel validarLogin(String login, String senha) {
		RESTConnectionV3 rest = new RESTConnectionV3();
		Map<String,Object> queryParams = new HashMap<String,Object>();
		queryParams.put("login", login);
		queryParams.put("senha", senha);
		String url = "http://localhost:8080/FuncionarioBack/api/login/validar";
		FuncionarioModel lista = (FuncionarioModel) rest.getObject(url, "GET", FuncionarioModel.class, null, queryParams);
		return lista;
		
	}

}
