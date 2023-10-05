package user_and_admin.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user_and_admin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername (String username);


}
