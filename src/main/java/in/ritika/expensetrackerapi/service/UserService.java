package in.ritika.expensetrackerapi.service;

import in.ritika.expensetrackerapi.entity.User;
import in.ritika.expensetrackerapi.entity.UserModel;

public interface UserService {
    
    User createUser(UserModel user);

    User readUser(Long id);

    User updateUser(UserModel user, Long id);

    void deleteUser(Long id);
}
