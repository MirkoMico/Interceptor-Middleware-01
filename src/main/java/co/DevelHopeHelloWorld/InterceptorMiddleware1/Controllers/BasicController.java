package co.DevelHopeHelloWorld.InterceptorMiddleware1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/time")
public class BasicController {
    Date date=new Date();

    @GetMapping
    public Date getDate(){
        System.out.println(date);

        return date;
    }
}
