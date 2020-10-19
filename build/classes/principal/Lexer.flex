package principal;
import static principal.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%

/* Tipo de dato Entero*/
(entero) {return Entero;}

/* Tipo de dato Cadena*/
(cadena) {return Cadena;}

/* Tipo de dato Real*/
(real) {return Real;}

/* Tipo de dato Boleano*/
(boleano) {return Boleano;}

/* Tipo de dato Si*/
(si) {return Si;}

/* Tipo de dato Sino*/
(sino) {return Sino;}

/* Tipo de dato Devolver*/
(devolver) {return Devolver;}

/* Tipo de dato Entonces*/
(entonces) {return Entonces;}

/* Tipo de dato Escribir*/
(escribir) {return Escribir;}

/* Tipo de dato Leer*/
(leer) {return Leer;}

/* Tipo de dato Verdadero*/
(verdadero) {return Verdadero;}

/* Tipo de dato Falso*/
(falso) {return Falso;}

/* Tipo de dato And*/
(and) {return And;}

/* Tipo de dato Or*/
(or) {return Or;}

/* Tipo de dato Incrementar*/
(incrementar) {return Incrementar;}

/* Tipo de dato Decrementar*/
(decrementar) {return Decrementar;}

/* Tipo de dato Hacer*/
(hacer) {return Hacer;}

/* Tipo de dato Mientras*/
(mientras) {return Mientras;}

/* Tipo de dato Desde*/
(desde) {return Desde;}

/* Tipo de dato Clase*/
(clase) {return Clase;}

/* Tipo de dato Propiedades*/
(propiedades) {return Propiedades;}

/* Tipo de dato Metodos*/
(metodos) {return Metodos;}

/* Tipo de dato Publico*/
(publico) {return Publico;}

/* Tipo de dato Privado*/
(privado) {return Privado;}

/* Tipo de dato Protegido*/
(protegido) {return Protegido;}

/* Tipo de dato Instanciar*/
(instanciar) {return Instanciar;}

/* Tipo de dato Extiende*/
(extiende) {return Extiende;}

/* Tipo de dato Incluir*/
(incluir) {return Incluir;}

/* Tipo de dato Constructor*/
(constructor) {return Constructor;}

/* Tipo de dato Principal*/
(principal) {return Principal;}

/* Tipo de dato Eliminar*/
(eliminar) {return Eliminar;}

/* Tipo de dato Destructor*/
(destructor) {return Destructor;}

/* Tipo de dato CadenaAEntero*/
(cadenaAEntero) {return CadenaAEntero;}

/* Tipo de dato CadenaAReal*/
(cadenaAReal) {return CadenaAReal;}

/* Tipo de dato CadenaABoleano*/
(cadenaABoleano) {return CadenaABoleano;}

/* Tipo de dato Seno*/
(seno) {return Seno;}

/* Tipo de dato Coseno*/
(coseno) {return Coseno;}

/* Tipo de dato Tangente*/
(tangente) {return Tangente;}

/* Tipo de dato Logaritmo*/
(logaritmo) {return Logaritmo;}

/* Tipo de dato Raiz*/
(raiz) {return Raiz;}

/* Tipo de dato Estatico*/
(estatico) {return Estatico;}



desde {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"%" {return Modulo;}
"^" {return Exponencial;}
"(" {return Pabrir;}
")" {return Pcerrar;}
"==" {return Igualque;}
"++" {return Masmas;}
"--" {return Menosmenos;}
"<" {return Menorque;}
">" {return Mayorque;}
"," {return Coma;}
";" {return Puntocoma;}
"!=" {return Distintoque;}
"." {return Punto;}


/*-------------------------------Comentarios-------------------------------*/

"//"({D}|{L}|" ")* {lexeme=yytext(); return Comentario;}
"/*"({D}|{L}|" "|"\n")*"*/" {lexeme=yytext(); return ComentarioG;}


/*---------------------------------------------------------------------------*/

/*-------------------------------Errores------------------------------------*/
//("%"|"$")*({L}|{D})* {lexeme=yytext(); return ErrorVariable;}
/*---------------------------------------------------------------------------*/


{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
({D}|"$"|"#"|"+"|"-"|"*"|"/"|"!"|"("|")"|"%"|"&"|"<"|">"|"."|","|":"|";"|"{"|"}"|"´"|"¿"|"¡"|"?")*({L}|{D})* {lexeme=yytext(); return ErrorVariable;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
