package es.studium.ejercicio1poo;

public class Principal
{

	public static void main(String[] args)
	{
		Raza raza1 = new Raza("Pastor Belga");
		Raza raza2 = new Raza("Fox Terrier");
		Raza raza3 = new Raza("Braco alemán");
		Raza raza4 = new Raza("Bichón maltés");
		Raza raza5 = new Raza("Dalmata");
		
		Perro perro1 = new Perro (raza1, 1.2f, 10, "marror");
		Perro perro2 = new Perro (raza2, 0.5f, 2, "marror");
		Perro perro3 = new Perro (raza2, 0.9f, 5, "marror");
		Perro perro4 = new Perro (raza2, 0.5f, 3, "marror");
		Perro perro5 = new Perro (raza2, 1.4f, 8, "marror");
		
		System.out.println("La raza del perro es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es: " + perro1.getTamanio() + ", su edad es de: " + perro1.getEdad() + "y su color es: " + perro1.getColor());
		System.out.println("La raza del perro es: " + perro2.getRaza().getNombreRaza() + ", su tamaño es: " + perro2.getTamanio() + ", su edad es de: " + perro2.getEdad() + "y su color es: " + perro2.getColor());
		System.out.println("La raza del perro es: " + perro3.getRaza().getNombreRaza() + ", su tamaño es: " + perro3.getTamanio() + ", su edad es de: " + perro3.getEdad() + "y su color es: " + perro3.getColor());
		System.out.println("La raza del perro es: " + perro4.getRaza().getNombreRaza() + ", su tamaño es: " + perro4.getTamanio() + ", su edad es de: " + perro4.getEdad() + "y su color es: " + perro4.getColor());
		System.out.println("La raza del perro es: " + perro5.getRaza().getNombreRaza() + ", su tamaño es: " + perro5.getTamanio() + ", su edad es de: " + perro5.getEdad() + "y su color es: " + perro5.getColor());
	}

}
