package example;
import java.io.IOException;
import java.util.Scanner;
import example.util.io.*;
import example.util.*;
import example.*;

public class Game{
	
	/*Constructeur de la classe Game*/
	/**
	 * let's us play the battleship's game.
	 * @param s: a Sea which represents the game board*/
	public Game(Sea s){
		try{
		s.display(false);
		while (s.getTotalLifePoints()!=0){
			System.out.println("abscisse de la case à toucher :");
			int abs= Input.readInt();
			System.out.println("ordonée de la case à toucher :");
			int ord= Input.readInt();
			Position p= new Position(abs,ord);
			Answer a=s.shoot(p);
			s.display(false);}
			System.out.println("La partie est gagnée, bien joué!");
			}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Cette case n'existe pas, il faut en sélectionner une autre");
			new Game(s);}
		catch (java.io.IOException e){
			System.out.println("l'ordonée et l'abscisse doivent être des entiers!");}}
		
	public static void main(String[] args){
		Sea s=new Sea(10,10);
		Ship s1=new Ship(3);
		Ship s2=new Ship(4);
		Ship s3=new Ship(5);
		Position p1= new Position(2,7);
		Position p2= new Position(5,3);
		Position p3= new Position(5,1);
		s.addShipHorizontally(s1,p1);
		s.addShipVertically(s2,p2);
		s.addShipHorizontally(s3,p3);
		new Game(s);

		}
		
	}
