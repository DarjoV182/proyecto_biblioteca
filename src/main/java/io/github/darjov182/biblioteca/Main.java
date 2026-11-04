package io.github.darjov182.biblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }

}

class libro {
    private String name;
    private String autor;
    private int anio;
    private int isbn;

    public libro(String name, String autor, int anio, int isbn) {
        this.name = name;
        this.autor = autor;
        this.anio = anio;
        this.isbn = isbn;
    }

    public String getNombre() {
        return name;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnio() {
        return anio;
    }
    public int getIsbn() {
        return isbn;
    }



}