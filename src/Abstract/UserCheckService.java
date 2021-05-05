package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserCheckService {
	boolean CheckIfRealUser(User user) throws RemoteException;

}
