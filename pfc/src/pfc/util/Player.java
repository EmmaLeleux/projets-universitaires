package pfc.util;
import pfc.strategy.*;
import pfc.util.*;


public class Player {
	
	private int points;
	private Strategy strat;
	
	public player(Strategy s){
		this.points=0;
		this.strat=s;} 
		
	public int getPoint(){
			return this.points;}
			
	public Strategy getStrat(){
		return this.strat;}
	
	public void addPoint(int nbPoint){
		this.points+=nbPoint;}
	
	public void zeroPoint(){
		this.points=0;}
	
	public void setStrat(Strategy nouvStrat){
		this.strat=nouvStrat;}
	
	public Move chooseMove(){
		return this.strat.choose();}
		
	
	
	
}

