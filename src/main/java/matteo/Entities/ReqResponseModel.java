package matteo.Entities;

public abstract class ReqResponseModel {
    private String request;
    private String exitCode;
    private String responseBody; //JSON of response that then will be read in the browser
}
