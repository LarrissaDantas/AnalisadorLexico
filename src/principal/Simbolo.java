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
public enum Simbolo {
	
	VAZIO("", "Cadeia vazia"),
	$("$", "Fim do arquivo"),
	OPERADO_SOMA("+", "Soma"),
	OPERADO_SUBTRACAO("-", "Subtração"),
	OPERADO_MULTIPLICACAO("*", "Multiplicação"),
	OPERADO_DIVISAO("/", "Divisão"),
	OPERADO_IGUALDADE("=", "Igualdade"),
	MAIOR_QUE(">", "Maior que"),
	MAIOR_IGUAL(">=", "Maio igual que"),
	MENOR_QUE("<", "Menor que"),
	MENOR_IGUAL("<=", "Menor igual que"),
	DIFERENTE("<>", "Diferente"),
	ATRIBUICAO(":=", "Atribuição"),
	DOIS_PONTOS(":", "Dois pontos"),
	PONTO_VIRGULA(";", "Ponto e vírgula"),
	VIRGULA(",", "Vírgula"),
	PONTO(".", "Ponto"),
	ABRE_PARENTESE("(", "Abre parentese"),
	FECHA_PARENTESE(")", "Fecha parentese"),
        ABRE_CHAVES("{", "Abre chaves"),
	FECHA_CHAVES("})", "Fecha chaves"),
	IDENTIFICADOR("", "Identificador"),
	INTEIRO("[0-9]", "Inteiro"),
	LITERAL("[a-zA-Z]", "Literal"),
	BREAK("break", "break"),
	CONST("const", "const"),
	CHAN("chan", "chan"),
	CONTINUE("continue", "continue"),
	DEFAULT("default", "defaul"),
	DEFER("defer", "defer"),
	FALLTHROUGHT("fallthrough", "fallthrough"),
	FUNC("func", "func"),
	GO("go", " go"),
	IF("if", "if"),
	GOTO("goto", "goto"),
	ELSE("else", "else"),
	IMPORT("import", "import"),
	INTERFACE("interface", "interface"),
	MAP("map", "map"),
	PACKAGE("package", "package"),
	RANGE("range", "range"),
	RETURN("return", "return"),
	SELECT("select", "select"),
	STRUCT("struct", "struct"),
	SWITCH("switch", "switch"),
	FOR("for", "For"),
	TYPE("type", "type"),
	CASE("case", "case"),
	COMENTARIO("Comentario", "Comentario"),
        FMTPRINTF("fmt.Printf", "Identificador"),
	ERROR("Caracter não identificado", "Erro");
        
        
	
	private String label;
	private String descricao;

	private Simbolo(String label, String descricao) {
		this.label = label;
		this.descricao = descricao;
	}
	
	public String getLabel() {
		return label;
	}

	public String getDescricao() {
		return descricao;
	}
}