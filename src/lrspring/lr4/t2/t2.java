package lrspring.lr4.t2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SecondService {

    private static final Logger logger = LoggerFactory.getLogger(SecondService.class);

    public void process(Request request) {
        long elapsedTime = FirstService.getElapsedTimeMillis();
        logger.info("Время между Сервисом 1 и Сервисом 2: {} мс.", elapsedTime);
    }
}