package food.delivery.domain;

import food.delivery.domain.OrderPlaced;
import food.delivery.domain.OderCanceled;
import food.delivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Oder_table")
@Data

public class Oder  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OderCanceled oderCanceled = new OderCanceled(this);
        oderCanceled.publishAfterCommit();

    }

    public static OderRepository repository(){
        OderRepository oderRepository = FrontApplication.applicationContext.getBean(OderRepository.class);
        return oderRepository;
    }






}
