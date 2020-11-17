package principal;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

%}
%%  
/* tabulador */
"    " {return new Symbol(sym.Tabulador, yychar, yyline, yytext());}
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Tipo de dato Si*/
si {return new Symbol(sym.Si, yychar, yyline, yytext());}

/* Tipo de dato Sino*/
sino {return new Symbol(sym.Sino, yychar, yyline, yytext());}

/* Tipo de dato Devolver*/
devolver {return new Symbol(sym.Devolver, yychar, yyline, yytext());}

/*Tipo de dato Pricipal*/
principal {return new Symbol(sym.Principal, yychar, yyline, yytext());}

/*Tipo de dato Clase*/
clase {return new Symbol(sym.Clase, yychar, yyline, yytext());}

/* Tipos de datos */
( boleano | real | entero | cadena ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}



"(" {return new Symbol(sym.Pabrir, yychar, yyline, yytext());}
")" {return new Symbol(sym.Pcerrar, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"()" {return new Symbol(sym.DobleP, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
