package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService{
	@Override
	public void Sale(Game game, User user) {
		System.out.println(user.getFirstName() + " Adl� kullan�c� " + game.getGameName() + " Adl� oyunu sat�n ald�.");
	}

	@Override
	public void MultiSales(Game[] games, User user) {
		System.out.println(user.getFirstName() + " Adl� kullan�c�");
		for (Game game : games) {
			System.out.println(game.getGameName());
		}
		System.out.println("Oyunlar�n� sat�n ald�.");
		
	}

	@Override
	public void CampaignSale(Game game, Campaign campaign, User user) {
		float campaignPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
		System.out.println("Oyunun fiyat�: " + game.getPrice());
		System.out.println("Oyunun kampanyal� fiyat�: " + campaignPrice);
		System.out.println(user.getFirstName() + " Adl� kullan�c� " + campaign.getCampaignName() + " Kampanyas� ile " + 
				game.getGameName() + " Oyununu " + campaignPrice + " Fiyat�na sat�n ald�.");
	}
}
