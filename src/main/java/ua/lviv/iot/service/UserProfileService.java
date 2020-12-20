package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.UserProfile;
import ua.lviv.iot.repository.UserProfileRepository;

@Service
public class UserProfileService extends AbstractService<UserProfile, Integer> {
    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public JpaRepository<UserProfile, Integer> getRepository() {
        return userProfileRepository;
    }

}