package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Timer {

    private Long nanoTime = System.nanoTime();
//@Autowired
    public Long getTime() {
        return nanoTime;
    }
}
