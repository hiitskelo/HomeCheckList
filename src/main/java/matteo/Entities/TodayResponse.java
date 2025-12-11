package matteo.Entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class TodayResponse extends ReqResponseModel {
    private LocalDate today = LocalDate.now();


}
