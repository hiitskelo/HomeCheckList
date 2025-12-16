package matteo.Entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class TodayResponse extends ReqResponseModel {
    private LocalDate today = LocalDate.now();
    private final List<CalendarEvent> events = new ArrayList<>();


}
