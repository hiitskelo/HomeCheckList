package matteo.ApiUtilities;

import com.mongodb.client.MongoCollection;
import matteo.Entities.CalendarEvent;
import matteo.Entities.EventCategory;
import matteo.Entities.ReqResponseModel;
import matteo.Entities.TodayResponse;
import matteo.basics.BasicConsumer;
import matteo.basics.ResponseUtils;
import org.bson.Document;

import java.time.LocalDate;

import static com.mongodb.client.model.Filters.*;

public class HomeCheckListApiConsumer extends BasicConsumer {

    public ReqResponseModel getTodayRecap() {
        TodayResponse today = new TodayResponse();
        MongoCollection<Document> collection = getConnection().getCollection("calendar");
        for (Document d : collection.find(eq("eventDate", today.getToday().toString()))) {
            CalendarEvent c = new CalendarEvent();
            c.setEventCategory(EventCategory.valueOf(d.get("eventCategory", String.class)));
            c.setEventDate(LocalDate.parse(d.get("eventDate", String.class)));
            c.setEventName(d.get("eventName", String.class));
            today.getEvents().add(c);
        }
        today.setResponseBody(ResponseUtils.toJson(today.getEvents()));
        return today;
    }
}
