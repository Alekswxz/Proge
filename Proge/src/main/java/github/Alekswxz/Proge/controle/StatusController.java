package github.Alekswxz.Proge.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    /**
     * @return
     */
    @GetMapping(path = "/demo/status")
    public String check() {
        return "OOOOIIII!!!";

    }
}
