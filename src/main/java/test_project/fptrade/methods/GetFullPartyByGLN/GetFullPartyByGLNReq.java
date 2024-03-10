package test_project.fptrade.methods.GetFullPartyByGLN;
import test_project.fptrade.APIHeaderRequest;

public class GetFullPartyByGLNReq {
    private APIHeaderRequest header;
    private Long gln;

    public void setGln(Long gln) {
        this.gln = gln;
    }

    public void setHeader(APIHeaderRequest header) {
        this.header = header;
    }

    public APIHeaderRequest getHeader() {
        return header;
    }

    public Long getGln() {
        return gln;
    }

    public GetFullPartyByGLNReq(APIHeaderRequest h, Long gln) {
        header = h;
        this.gln = gln;
    }
}
