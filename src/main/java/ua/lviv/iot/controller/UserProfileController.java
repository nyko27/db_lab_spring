package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.UserProfile;
import ua.lviv.iot.service.UserProfileService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/user_profile")
public class UserProfileController extends AbstractController<UserProfile, Integer> {

    @Autowired
    UserProfileService userProfileService;

    @Override
    public GeneralServiceInterface<UserProfile, Integer> getService() {
        return userProfileService;
    }

}