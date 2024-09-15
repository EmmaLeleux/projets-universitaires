package pfc.strategy;
import pfc.util.*;

public class RandomStrat implements Strategy {
	public Move choose(){
		return Move.randomMove();
	}
}
