package uz.nt.emailservice.clients;

import dto.ResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import uz.nt.emailservice.dto.UsersDto;

import java.util.List;

//@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping
    ResponseDto<List<UsersDto>> getUsers();
}