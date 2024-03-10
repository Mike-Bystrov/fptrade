package test_project.fptrade.methods.GetFullPartyByGLN;

import test_project.fptrade.APIHeaderRequest;
import test_project.fptrade.model.Party;

public class GetFullPartyByGLNResp {
    private APIHeaderRequest header;
    private Party fullparty;
    private GetPartyByGLNEnum errorCode;

    public void setHeader(APIHeaderRequest header) {
        this.header = header;
    }

    public void setErrorCode(GetPartyByGLNEnum errorCode) {
        this.errorCode = errorCode;
    }

    public void setFullparty(Party fullparty) {
        this.fullparty = fullparty;
    }

    public APIHeaderRequest getHeader() {
        return header;
    }

    public GetPartyByGLNEnum getErrorCode() {
        return errorCode;
    }

    public Party getFullparty() {
        return fullparty;
    }

    public GetFullPartyByGLNResp(APIHeaderRequest h, Party p, GetPartyByGLNEnum err) {
        header = h;
        fullparty = p;
        errorCode = err;
    }
}
