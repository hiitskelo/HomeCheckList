package matteo.ApiUtilities;

import matteo.Entities.ReqResponseModel;
import matteo.Entities.TodayResponse;

public class HomeCheckListApiConsumer {

    public ReqResponseModel getTodayRecap() {
        TodayResponse today = new TodayResponse();
        return today;
    }
}
