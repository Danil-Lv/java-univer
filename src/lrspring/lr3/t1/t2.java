package lrspring.lr3.t1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyServiceImpl.class);

    @Override
    public Response process(Request request) {
        logger.info("Обработка запроса: {}", request);

        // Логика обработки запроса
        Response response = new Response(request.getUid(), request.getOperationUid(), "ERP", "2000-01-01T00:00:00Z", "success", null, null);
        logger.info("Сформирован ответ: {}", response);

        return response;
    }
}