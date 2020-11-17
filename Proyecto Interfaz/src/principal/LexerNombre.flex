package principal;
import static principal.Tokens.*;
%%
%class LexerNombre
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
LETRA=[A-Z]+
letra=[a-z]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
"\n" {return Linea;}
{espacio} {/*Ignore*/}


/*-------------------------------Clase-------------------------------*/

"clase"(" "){LETRA}(({letra}|{D}|"_"|{LETRA})*) {lexeme=yytext(); return IdentificadorClase;}
"clase"(" ")(({letra}|{D}|"_"|{LETRA}|"á"|"é"|"í"|"ó"|"ú")*) {lexeme=yytext(); return ErrorIdentificadorClase;}

/*------------------------------Funciones -----------------------------*/
/*FUNCIONES*/
("entero"|"real"|"cadena"|"boleano")(" ")({letra})(({letra}|{D}|"_"|{LETRA})*)("(")(")") {lexeme=yytext(); return IdentificadorFuncion;}
("entero"|"real"|"cadena"|"boleano")(" ")(({D}|"_"|.|"á"|"é"|"í"|"ó"|"ú")*)("(")(")") {lexeme=yytext(); return ErrorIdentificadorFuncion;}
{letra}(".")({letra}({L}|{D}|"_")*)("(")(")") {lexeme=yytext(); return IdentificadorFuncion;}
("entero"|"real"|"cadena"|"boleano")(" ")({letra})(({letra}|{D}|"_"|{LETRA})*)("(")("entero"|"real"|"cadena"|"boleano")(" ")({D}|{L}|"_")*(")") {lexeme=yytext(); return IdentificadorFuncion;}

/*------------------------------Variables -----------------------------*/
("entero")(" ")({L})(({L}|{D})*)(" ")("=")(" ")({D}+) {lexeme=yytext(); return IdentificadorVariable;}

("entero"|"real"|"cadena"|"boleano")(" ")({L})(({L}|{D})*) {lexeme=yytext(); return IdentificadorVariable;}
("entero"|"real"|"cadena"|"boleano")(" ")((({L}|{D})*)(",")(({L}|{D})*))* {lexeme=yytext(); return IdentificadorVariable;}
("entero"|"real"|"cadena"|"boleano")(" ")({L})(({L}|{D})*)(",")((({L}|{D})*))* {lexeme=yytext(); return IdentificadorVariable;}
("entero"|"real"|"cadena"|"boleano")(" ")({L})(({L}|{D})*)(","(({L}|{D})*))*"," {lexeme=yytext(); return ErrorIdentificadorVariable;}
("entero"|"real"|"cadena"|"boleano")(" ")({L})(({L}|{D}|.)*)(","(({L}|{D}|.)*))* {lexeme=yytext(); return ErrorIdentificadorVariable;}

("entero"|"real"|"cadena"|"boleano")(" ")({L})(({L}|{D}|"_")*) {lexeme=yytext(); return IdentificadorVariable;}
("entero"|"real"|"cadena"|"boleano")(" "){D}* {lexeme=yytext(); return ErrorIdentificadorVariable;}
("entero"|"real"|"cadena"|"boleano")(" ")({L}|"$"|"%")* {lexeme=yytext(); return ErrorIdentificadorVariable;}
/*-------------------------------Declaracion Variables ----------------------*/


 . {lexeme=yytext(); return ERROR;}

