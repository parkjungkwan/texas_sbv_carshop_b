package texas.sbv.car.user;

import org.springframework.stereotype.Component;

@Component
public interface UserService{
    void withDrawl(String userid);
    User update(User user);
}
