
public class Rectangulo {
	int base, altura;  //variables
	
	Rectangulo(int base, int altura) //El constructor que asigna base y altura
	{
		this.base=base;
		this.altura=altura;
	}
	
	int getAltura() //Devuelve valor del atributo altura
	{
		return altura;
	}

	void setAltura(int altura)//Asigna valor al atributo altura
	{
		this.altura=altura;
	}
	
	int getBase() //Devuelve valor del atributo base
	{
		return base;
	}
	void setBase(int base) //Asigna valor de base al atributo
	{
		this.base=base;
	}
	
	int getArea()  //Obtiene El area multiplicando base x altura
	{
		return (base*altura);
	}
	
	int getPerimetro()  //Obtiene el perimetro sumando base + altura y luego x 2
	{
		return ((base+altura)*2);
	}
	
	
}
