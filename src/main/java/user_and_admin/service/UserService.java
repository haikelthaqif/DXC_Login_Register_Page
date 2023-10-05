package user_and_admin.service;

import user_and_admin.DTO.UserDTO;
import user_and_admin.model.User;

public interface UserService {

    User save (UserDTO userDTO);
}
