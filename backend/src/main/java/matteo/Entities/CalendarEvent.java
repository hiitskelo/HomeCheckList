package matteo.Entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class CalendarEvent {
    private String eventName;
    private LocalDate eventDate;
    private EventCategory eventCategory;
}
