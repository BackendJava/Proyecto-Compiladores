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
entero |
cadena |
real |
boleano |
si |
sino |
devolver |
entonces |
escribir |
leer |
verdadero |
falso |
and |
or |
incrementar |
decrementar |
hacer |
mientras |
desde |
clase |
propiedades |
metodos |
publico |
privado |
protegido |
instanciar |
extiende |
incluir |
constructor |
principal |
eliminar |
destructor |
cadenaAEntero |
cadenaAReal |
cadenaABoleano |
seno |
coseno |
tangente |
logaritmo |
raiz |
estatico |

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
