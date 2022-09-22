package mikezgarcia.bediscussion2.controller;

import lombok.RequiredArgsConstructor;
import mikezgarcia.bediscussion2.dto.UserDTO;
import mikezgarcia.bediscussion2.model.UserRequest;
import mikezgarcia.bediscussion2.service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UsersController {

    private final UsersService usersService;

    @PutMapping("/signup")
    public UserDTO registerUsers(@RequestBody UserRequest userRequest){
            return usersService.registerUser(userRequest);
        }


    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return usersService.getAllUsers();
    }
}
