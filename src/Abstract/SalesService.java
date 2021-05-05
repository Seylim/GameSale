package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SalesService {
	void Sale(Game game, User user);
	void MultiSales(Game[] games, User user);
	void CampaignSale(Game game, Campaign campaign, User user);

}
