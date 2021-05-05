package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName() + " Oyunu eklendi.");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() + " Oyun bilgileri güncellendi.");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getGameName() + " Oyunu silindi.");
		
	}

}
