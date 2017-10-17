/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author LelaScarlet
 */
public class Token {

	private String token;
	private Simbolo simbolo;

	public Token(String token, Simbolo simbolo) {
		super();
		this.token = token;
		this.simbolo = simbolo;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Simbolo getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(Simbolo simbolo) {
		this.simbolo = simbolo;
	}
	public String[] toArray(){
		return new String[]{getSimbolo().ordinal() + "", getToken(), getSimbolo().getDescricao()};
	}
}
