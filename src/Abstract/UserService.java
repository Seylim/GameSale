package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserService {
	
	void Add(User user) throws RemoteException;
	void Update(User user);
	void Delete(User user);

}
