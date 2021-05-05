package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	private UserCheckService _userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		_userCheckService = userCheckService;
	}
	
	@Override
	public void Add(User user) throws RemoteException{
		if (_userCheckService.CheckIfRealUser(user)) {
			System.out.println(user.getFirstName() + " Adlý kullanýcý kaydedildi.");
		}else {
			System.out.println("Kullanýcý bilgileri geçerli deðil.");
		}
		
		
	}

	@Override
	public void Update(User user) {
		System.out.println(user.getFirstName() + " Adlý kullanýcý bilgileri güncellendi.");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName() + " Adlý kullanýcý silindi.");
		
	}

}
