
public class PentagonoRegular {
int lado; //Variable

PentagonoRegular (int lado) //El constructor que asigna lado
{
this.lado = lado; 
}

int getLado() //Devuelve valor del atributo lado
{
	return lado;
}

void setLado (int lado)//Asigna valor de lado al atributo
{
	this.lado = lado;
}

int getPerimetro() //Devuelve el lado multiplicado por 5 para obtener el perimetro
{
	return (lado*5);
}

}
