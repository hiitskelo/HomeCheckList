package matteo.ApiUtilities;

import matteo.Entities.ReqResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/home/")
public class HomeCheckListApiController {

    @GetMapping
    public ResponseEntity<String> testApi() {
        return ResponseEntity.ok("OK");
    }

    @GetMapping("/today")
    public ResponseEntity<ReqResponseModel> getTodaysRecap(){
        ReqResponseModel responseModel = null;

        return ResponseEntity.of(Optional.of(responseModel));
    }

}
