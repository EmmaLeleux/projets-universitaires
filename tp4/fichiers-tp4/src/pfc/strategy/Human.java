package pfc.strategy;
import pfc.util.*;
import pfc.util.io.*;

public class Human implements Strategy{
	public Move choose(){
		System.out.println("Que voulez vous jouer?");
			String move=Input.readString();
			try {
			return Move.valueOf(move);}
			catch(java.lang.IllegalArgumentException e){
				System.out.println("Veuillez choisir ROCK, PAPER ou SCISORS");
				return null;
			}
		}}