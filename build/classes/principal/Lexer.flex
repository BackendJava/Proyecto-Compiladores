package principal;
import static principal.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
"\n" {return Linea;}

/* Tipo de dato Entero*/
(entero) {lexeme=yytext(); return Entero;}

/* Tipo de dato Cadena*/
(cadena) {lexeme=yytext(); return Cadena;}

/* Tipo de dato Real*/
(real) {lexeme=yytext(); return Real;}

/* Tipo de dato Boleano*/
(boleano) {lexeme=yytext(); return Boleano;}

/* Tipo de dato Si*/
(si) {lexeme=yytext(); return Si;}

/* Tipo de dato Sino*/
(sino) {lexeme=yytext(); return Sino;}

/* Tipo de dato Devolver*/
(devolver) {lexeme=yytext(); return Devolver;}

/* Tipo de dato Entonces*/
(entonces) {lexeme=yytext(); return Entonces;}

/* Tipo de dato Escribir*/
(escribir) {lexeme=yytext(); return Escribir;}

/* Tipo de dato Leer*/
(leer) {lexeme=yytext(); return Leer;}

/* Tipo de dato Verdadero*/
(verdadero) {lexeme=yytext(); return Verdadero;}

/* Tipo de dato Falso*/
(falso) {lexeme=yytext(); return Falso;}

/* Tipo de dato And*/
(and) {lexeme=yytext(); return And;}

/* Tipo de dato Or*/
(or) {lexeme=yytext(); return Or;}

/* Tipo de dato Incrementar*/
(incrementar) {lexeme=yytext(); return Incrementar;}

/* Tipo de dato Decrementar*/
(decrementar) {lexeme=yytext(); return Decrementar;}

/* Tipo de dato Hacer*/
(hacer) {lexeme=yytext(); return Hacer;}

/* Tipo de dato Mientras*/
(mientras) {lexeme=yytext(); return Mientras;}

/* Tipo de dato Desde*/
(desde) {lexeme=yytext(); return Desde;}

/* Tipo de dato Clase*/
(clase) {lexeme=yytext(); return Clase;}

/* Tipo de dato Propiedades*/
(propiedades) {lexeme=yytext(); return Propiedades;}

/* Tipo de dato Metodos*/
(metodos) {lexeme=yytext(); return Metodos;}

/* Tipo de dato Publico*/
(publico) {lexeme=yytext(); return Publico;}

/* Tipo de dato Privado*/
(privado) {lexeme=yytext(); return Privado;}

/* Tipo de dato Protegido*/
(protegido) {lexeme=yytext(); return Protegido;}

/* Tipo de dato Instanciar*/
(instanciar) {lexeme=yytext(); return Instanciar;}

/* Tipo de dato Extiende*/
(extiende) {lexeme=yytext(); return Extiende;}

/* Tipo de dato Incluir*/
(incluir) {lexeme=yytext(); return Incluir;}

/* Tipo de dato Constructor*/
(constructor) {lexeme=yytext(); return Constructor;}

/* Tipo de dato Principal*/
(principal) {lexeme=yytext(); return Principal;}

/* Tipo de dato Eliminar*/
(eliminar) {lexeme=yytext(); return Eliminar;}

/* Tipo de dato Destructor*/
(destructor) {lexeme=yytext(); return Destructor;}

/* Tipo de dato CadenaAEntero*/
(cadenaAEntero) {lexeme=yytext(); return CadenaAEntero;}

/* Tipo de dato CadenaAReal*/
(cadenaAReal) {lexeme=yytext(); return CadenaAReal;}

/* Tipo de dato CadenaABoleano*/
(cadenaABoleano) {lexeme=yytext(); return CadenaABoleano;}

/* Tipo de dato Seno*/
(seno) {lexeme=yytext(); return Seno;}

/* Tipo de dato Coseno*/
(coseno) {lexeme=yytext(); return Coseno;}

/* Tipo de dato Tangente*/
(tangente) {lexeme=yytext(); return Tangente;}

/* Tipo de dato Logaritmo*/
(logaritmo) {lexeme=yytext(); return Logaritmo;}

/* Tipo de dato Raiz*/
(raiz) {lexeme=yytext(); return Raiz;}

/* Tipo de dato Estatico*/
(estatico) {lexeme=yytext(); return Estatico;}


/*Tipo de dato Desde*/
(desde) {lexeme=yytext(); return Desde;}

desde {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}
"%" {lexeme=yytext(); return Modulo;}
"^" {lexeme=yytext(); return Exponencial;}
"(" {lexeme=yytext(); return Pabrir;}
")" {lexeme=yytext(); return Pcerrar;}
"==" {lexeme=yytext(); return Igualque;}
"++" {lexeme=yytext(); return Masmas;}
"--" {lexeme=yytext(); return Menosmenos;}
"<" {lexeme=yytext(); return Menorque;}
">" {lexeme=yytext(); return Mayorque;}
"," {lexeme=yytext(); return Coma;}
";" {lexeme=yytext(); return Puntocoma;}
"!=" {lexeme=yytext(); return Distintoque;}
"." {lexeme=yytext(); return Punto;}


/*-------------------------------Comentarios-------------------------------*/

"//"({D}|{L}|" ")* {lexeme=yytext(); return Comentario;}
"/*"({D}|{L}|" "|"\n")*"*/" {lexeme=yytext(); return ComentarioG;}


/*---------------------------------------------------------------------------*/

/*-------------------------------Errores------------------------------------*/
//("%"|"$")*({L}|{D})* {lexeme=yytext(); return ErrorVariable;}

/*---------------------------------------------------------------------------*/


{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

{D}* {lexeme=yytext(); return Numero;}
("-"{D}*)|({D}*) {lexeme=yytext(); return Numero;}
("-"{D}*"."{D}*)|({D}*"."{D}*) {lexeme=yytext(); return Real;}
({D}|"$"|"#"|"+"|"-"|"*"|"/"|"!"|"("|")"|"%"|"&"|"<"|">"|"."|","|":"|";"|"{"|"}"|"´"|"¿"|"¡"|"?")*({L}|{D})* {lexeme=yytext(); return ErrorVariable;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {lexeme=yytext(); return ERROR;}
