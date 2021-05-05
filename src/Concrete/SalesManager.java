package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService{
	@Override
	public void Sale(Game game, User user) {
		System.out.println(user.getFirstName() + " Adlý kullanýcý " + game.getGameName() + " Adlý oyunu satýn aldý.");
	}

	@Override
	public void MultiSales(Game[] games, User user) {
		System.out.println(user.getFirstName() + " Adlý kullanýcý");
		for (Game game : games) {
			System.out.println(game.getGameName());
		}
		System.out.println("Oyunlarýný satýn aldý.");
		
	}

	@Override
	public void CampaignSale(Game game, Campaign campaign, User user) {
		float campaignPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
		System.out.println("Oyunun fiyatý: " + game.getPrice());
		System.out.println("Oyunun kampanyalý fiyatý: " + campaignPrice);
		System.out.println(user.getFirstName() + " Adlý kullanýcý " + campaign.getCampaignName() + " Kampanyasý ile " + 
				game.getGameName() + " Oyununu " + campaignPrice + " Fiyatýna satýn aldý.");
	}
}
