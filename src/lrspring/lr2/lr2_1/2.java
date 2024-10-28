package lrspring.lr2.lr2_1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyController {

    @PostMapping("/process-request")
    @ResponseStatus(HttpStatus.OK)
    public Response processRequest(@Valid @RequestBody Request request) {
        // Здесь идет обработка запроса
        System.out.println("Запрос успешно обработан");

        // Возвращаем ответ
        return new Response(request.getUid(), request.getOperationUid(), "ERP", "2000-01-01T00:00:00Z", "success", null, null);
    }
}