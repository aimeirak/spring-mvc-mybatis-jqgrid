package rw.register.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import rw.register.Models.User;
import rw.register.Repositories.userRepository;

@Service
public class userServices {
	@Autowired private userRepository userRepo;
	@Autowired private BCryptPasswordEncoder encoder;
    public List<User> getAllUsers(){
    	return userRepo.findAll();
    } 
    public void save(User user){
    	user.setPassword(encoder.encode(user.getPassword()));
    	 userRepo.insert(user);
    }
    
    public User getUserbyid(String mobile,String password){
    	
//    	user.setPassword(encoder.encode(user.getPassword()));
    	String passWordCome = password;
    	String mobilephone =mobile;
    	 User userOne = userRepo.selectByPhone(mobilephone);
    	 return  userOne;
    }
}
