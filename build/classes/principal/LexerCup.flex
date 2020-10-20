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
/* Espacios en blanco */
{espacio} {/*Ignore*/}
/* Tipo de dato Entero*/
entero {return new Symbol(sym.Entero, yychar, yyline, yytext());}

/* Tipo de dato Cadena*/
cadena {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Tipo de dato Real*/
real {return new Symbol(sym.Real, yychar, yyline, yytext());}

/* Tipo de dato Boleano*/
boleano {return new Symbol(sym.Boleano, yychar, yyline, yytext());}

/* Tipo de dato Si*/
si {return new Symbol(sym.Si, yychar, yyline, yytext());}

/* Tipo de dato Sino*/
sino {return new Symbol(sym.Sino, yychar, yyline, yytext());}

/* Tipo de dato Devolver*/
devolver {return new Symbol(sym.Devolver, yychar, yyline, yytext());}

/*Tipo de dato Clase*/
principal {return new Symbol(sym.Principal, yychar, yyline, yytext());}


"(" {return new Symbol(sym.Pabrir, yychar, yyline, yytext());}
")" {return new Symbol(sym.Pcerrar, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"()" {return new Symbol(sym.DobleP, yychar, yyline, yytext());}

/*-------------------------------Comentarios-------------------------------*/

"//"({D}|{L}|" ")* {return new Symbol(sym.Comentario, yychar, yyline, yytext());}
"/*"({D}|{L}|" "|"\n")*"*/" {return new Symbol(sym.ComentarioG, yychar, yyline, yytext());}


/*---------------------------------------------------------------------------*/

/*-------------------------------Errores------------------------------------*/
 
/*---------------------------------------------------------------------------*/


{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
({D}|"$"|"#"|"+"|"-"|"*"|"/"|"!"|"("|")"|"%"|"&"|"<"|">"|"."|","|":"|";"|"{"|"}"|"´"|"¿"|"¡"|"?")*({L}|{D})* {return new Symbol(sym.ErrorVariable, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
 . {return new Symbol(sym.Error, yychar, yyline, yytext());}

