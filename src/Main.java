import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		User user = new User(1, "Emre Kaan", "Seylim", "12345123465", 2000);
		
		UserCheckService userCheckService = new MernisServiceAdapter();
		UserManager userManager = new UserManager(userCheckService);
		userManager.Add(user);
		
		System.out.println("----------------------------");
		Game game = new Game(1, "Fifa 21", 250.0f);
		
		GameManager gameManager = new GameManager();
		gameManager.Add(game);
		
		System.out.println("----------------------------");
		
		
		Campaign campaign = new Campaign(1, "Ramazan bayramý kampanyasý", "Ramazan bayramý boyunca oyunlarda %15 indirim", 15);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign);
		
		System.out.println("----------------------------");
		
		SalesManager salesManager = new SalesManager();
		salesManager.CampaignSale(game, campaign, user);

	}

}
