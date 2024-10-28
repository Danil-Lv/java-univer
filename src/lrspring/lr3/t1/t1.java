package lrspring.lr3.t1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @PostMapping("/process-request")
    @ResponseStatus(HttpStatus.OK)
    public Response processRequest(@Valid @RequestBody Request request) {
        logger.info("Получен запрос: {}", request);

        // Логика обработки запроса
        Response response = new Response(request.getUid(), request.getOperationUid(), "ERP", "2000-01-01T00:00:00Z", "success", null, null);
        logger.info("Сформирован ответ: {}", response);

        return response;
    }
}