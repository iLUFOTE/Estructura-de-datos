package pila;
public class Delimitadores {
//Evalua si una cadena tiene los delimitadores correctos
public boolean
evaluacionDelimitadores(String cadena) {
Pila<String> pcaracteres = new Pila<String>();
int i = 0;
boolean masElementosPorLeer = true;
while (i<cadena.length() && masElementosPorLeer)
{
char car = cadena.charAt(i);
String s = charToString(car);
i++;
switch (car) 
{
//En caso de Apilar
case '(':{
pcaracteres.apilar(charToString(')'));
break;
}
case '[':{
pcaracteres.apilar(charToString(']'));
break;
}
case '{':{
pcaracteres.apilar(charToString('}'));
break;
}
case '/':{
if (siguienteEsAsterisco(cadena,i)) {
pcaracteres.apilar(charToString('/'));
i++; 
}
break;
}

}
}
}
