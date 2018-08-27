package com.anncode.amazonviewer;

public class Main {

	public static void main(String[] args) {

		showMenu();

	}

	public static void showMenu() {

		int exit = 0;

		do {

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");

			// Leer la respuesta del usuario
			int response = 1;
			switch (response) {
			case 0:
				System.out.println("0. Exit");
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			default:
				break;
			}

		} while (exit != 0);
	}

	public static void showMovies() {

		int series = 2;
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
		} while (series != 2);

	}

	public static void showSeries() {

		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
		} while (exit != 0);

	}

	public static void showChapters() {

	}

	public static void showBooks() {

	}

	public static void showMagazines() {

	}
}
