package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OderCanceled extends AbstractEvent {

    private Long id;

    public OderCanceled(Oder aggregate){
        super(aggregate);
    }
    public OderCanceled(){
        super();
    }
}
