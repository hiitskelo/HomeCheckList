package matteo;

import matteo.ApiUtilities.HomeCheckListApiController;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(new HomeCheckListApiController().getTodaysRecap().toString());
    }
}
