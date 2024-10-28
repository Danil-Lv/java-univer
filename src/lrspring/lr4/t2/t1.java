package lrspring.lr4.t2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class FirstService {

    private static final Logger logger = LoggerFactory.getLogger(FirstService.class);

    private Instant startTime;

    @Override
    public void modifySource(Request request, String newSource) {
        startTime = Instant.now();
        request.setSource(newSource);
        logger.info("Сервис 1 получил запрос: {}", request);
    }

    public long getElapsedTimeMillis() {
        if (startTime == null) {
            return 0;
        }
        Instant endTime = Instant.now();
        return Duration.between(startTime, endTime).toMillis();
    }
}