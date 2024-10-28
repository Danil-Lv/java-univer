import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    private final RequestProcessingService requestProcessingService;

    @Autowired
    public MyController(RequestProcessingService requestProcessingService) {
        this.requestProcessingService = requestProcessingService;
    }

    @PostMapping("/process")
    public Response processRequest(@RequestBody Request request) {
        return requestProcessingService.processRequest(request);
    }
}
