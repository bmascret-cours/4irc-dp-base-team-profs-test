package zzClassesPourAtelier3.strategy;


import java.util.HashMap;
import java.util.Map;

/**
 * @author francoiseperrin
 *
 */
public class MovementStrategyFactory {

	static String chemin = "model.pieceStrategy.MovementStrategy.";		// TODO - TO  CUSTOMISE //

	/**
	 * private pour ne pas instancier d'objets
	 */
	private MovementStrategyFactory() {

	}
	private static Map<String, MovementStrategy> mapStrategy = new HashMap<String, MovementStrategy>();

	static {	
		mapStrategy.put("Tour", TourMovementStrategy.newInstance());
		mapStrategy.put("Cavalier", CavalierMovementStrategy.newInstance());
		mapStrategy.put("Fou",  FouMovementStrategy.newInstance());
		mapStrategy.put("Reine", ReineMovementStrategy.newInstance());
		mapStrategy.put("Roi", RoiMovementStrategy.newInstance());
		mapStrategy.put("PionBlanc", PionBlancMovementStrategy.newInstance());
		mapStrategy.put("PionNoir", PionNoirMovementStrategy.newInstance());	
	}


	public static MovementStrategy getMovementStrategy(String pieceType){
		
		return mapStrategy.get(pieceType);		
	}


	/**
	 * Test unitaires
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MovementStrategyFactory.getMovementStrategy("PionNoir"));
	}

	

}