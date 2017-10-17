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
public class IdentificaToken {

	public Simbolo identifica(String str){
		
		if(str.trim().equalsIgnoreCase(Simbolo.VAZIO.getLabel()))
			return Simbolo.VAZIO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.$.getLabel()))
			return Simbolo.$;
		
		if(str.trim().equalsIgnoreCase(Simbolo.OPERADO_SOMA.getLabel()))
			return Simbolo.OPERADO_SOMA;
		
		if(str.trim().equalsIgnoreCase(Simbolo.OPERADO_SUBTRACAO.getLabel()))
			return Simbolo.OPERADO_SUBTRACAO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.OPERADO_MULTIPLICACAO.getLabel()))
			return Simbolo.OPERADO_MULTIPLICACAO;
		 
		if(str.trim().equalsIgnoreCase(Simbolo.OPERADO_DIVISAO.getLabel()))
			return Simbolo.OPERADO_DIVISAO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.OPERADO_IGUALDADE.getLabel()))
			return Simbolo.OPERADO_IGUALDADE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.MAIOR_QUE.getLabel()))
			return Simbolo.MAIOR_QUE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.MAIOR_IGUAL.getLabel()))
			return Simbolo.MAIOR_IGUAL;
		
		if(str.trim().equalsIgnoreCase(Simbolo.MENOR_QUE.getLabel()))
			return Simbolo.MENOR_QUE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.MENOR_IGUAL.getLabel()))
			return Simbolo.MENOR_IGUAL;
		
		if(str.trim().equalsIgnoreCase(Simbolo.DIFERENTE.getLabel()))
			return Simbolo.DIFERENTE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.ATRIBUICAO.getLabel()))
			return Simbolo.ATRIBUICAO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.DOIS_PONTOS.getLabel()))
			return Simbolo.DOIS_PONTOS;
		
		if(str.trim().equalsIgnoreCase(Simbolo.PONTO_VIRGULA.getLabel()))
			return Simbolo.PONTO_VIRGULA;
		
		if(str.trim().equalsIgnoreCase(Simbolo.VIRGULA.getLabel()))
			return Simbolo.VIRGULA;
		
		if(str.trim().equalsIgnoreCase(Simbolo.PONTO.getLabel()))
			return Simbolo.PONTO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.ABRE_PARENTESE.getLabel()))
			return Simbolo.ABRE_PARENTESE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.FECHA_PARENTESE.getLabel()))
			return Simbolo.FECHA_PARENTESE;
                
		if(str.trim().equalsIgnoreCase(Simbolo.ABRE_CHAVES.getLabel()))
			return Simbolo.ABRE_CHAVES;
		
		if(str.trim().equalsIgnoreCase(Simbolo.FECHA_CHAVES.getLabel()))
			return Simbolo.FECHA_CHAVES;
                
		if(str.matches("^[(*].*.[*)]$"))
			return Simbolo.COMENTARIO;
		
		
		//trata o valor inteiro
		if(str.matches("\\d{1,5}")){
			if (Math.abs(Integer.parseInt(str)) <= 32767)
				return Simbolo.INTEIRO;
			
			return Simbolo.ERROR;
		}
		
		if(str.matches("^\".*\"$")){
			if(str.length() < 256)
				return Simbolo.LITERAL;
			return Simbolo.ERROR;
		}
			
		
		if(str.trim().equalsIgnoreCase(Simbolo.LITERAL.getLabel()))
			return Simbolo.LITERAL;
		
		if(str.trim().equalsIgnoreCase(Simbolo.BREAK.getLabel()))
			return Simbolo.BREAK;
		
		if(str.trim().equalsIgnoreCase(Simbolo.CONST.getLabel()))
			return Simbolo.CONST;
		
		if(str.trim().equalsIgnoreCase(Simbolo.CHAN.getLabel()))
			return Simbolo.CHAN;
		
		if(str.trim().equalsIgnoreCase(Simbolo.CONTINUE.getLabel()))
			return Simbolo.CONTINUE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.DEFAULT.getLabel()))
			return Simbolo.DEFAULT;
		
		if(str.trim().equalsIgnoreCase(Simbolo.DEFER.getLabel()))
			return Simbolo.DEFER;
		
		if(str.trim().equalsIgnoreCase(Simbolo.FALLTHROUGHT.getLabel()))
			return Simbolo.FALLTHROUGHT;
		
		if(str.trim().equalsIgnoreCase(Simbolo.FUNC.getLabel()))
			return Simbolo.FUNC;
		
		if(str.trim().equalsIgnoreCase(Simbolo.GO.getLabel()))
			return Simbolo.GO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.IF.getLabel()))
			return Simbolo.IF;
		
		if(str.trim().equalsIgnoreCase(Simbolo.GOTO.getLabel()))
			return Simbolo.GOTO;
		
		if(str.trim().equalsIgnoreCase(Simbolo.ELSE.getLabel()))
			return Simbolo.ELSE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.IMPORT.getLabel()))
			return Simbolo.IMPORT;
		
		if(str.trim().equalsIgnoreCase(Simbolo.INTERFACE.getLabel()))
			return Simbolo.INTERFACE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.MAP.getLabel()))
			return Simbolo.MAP;
		
		if(str.trim().equalsIgnoreCase(Simbolo.PACKAGE.getLabel()))
			return Simbolo.PACKAGE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.RANGE.getLabel()))
			return Simbolo.RANGE;
		
		if(str.trim().equalsIgnoreCase(Simbolo.RETURN.getLabel()))
			return Simbolo.RETURN;
		
		if(str.trim().equalsIgnoreCase(Simbolo.SELECT.getLabel()))
			return Simbolo.SELECT;
		
		if(str.trim().equalsIgnoreCase(Simbolo.STRUCT.getLabel()))
			return Simbolo.STRUCT;
		
		if(str.trim().equalsIgnoreCase(Simbolo.SWITCH.getLabel()))
			return Simbolo.SWITCH;
		
		if(str.trim().equalsIgnoreCase(Simbolo.FOR.getLabel()))
			return Simbolo.FOR;
		
		if(str.trim().equalsIgnoreCase(Simbolo.TYPE.getLabel()))
			return Simbolo.TYPE;
                
                if(str.trim().equalsIgnoreCase(Simbolo.FMTPRINTF.getLabel()))
			return Simbolo.FMTPRINTF;
		
		if(str.trim().equalsIgnoreCase(Simbolo.CASE.getLabel()))
			return Simbolo.CASE;
                

		//[\\w]{1,30} = comeÃ§a com letra e permite no min 1 e max 30
		//[^\\s] = nÃ£o pode conter caracter em branco
		//[\\d]* = verifica se tem a existencia de 0 ou mais caracters 
		if(str.matches("^[a-zA-Z]{1}|^[a-zA-Z][^\\s][^\"]$|^[a-zA-Z]+[\\d]*[^\\s][^\"]$")){
			if(str.length()<30)
				return Simbolo.IDENTIFICADOR;
			else
				return Simbolo.ERROR;
		}
		
		return Simbolo.ERROR;
		
		
	}
	
}
