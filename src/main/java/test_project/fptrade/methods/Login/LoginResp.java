package test_project.fptrade.methods.Login;

import test_project.fptrade.APIHeaderRequest;

public class LoginResp {
    private APIHeaderRequest header;
    private LoginEnum errorCode;

    public APIHeaderRequest getHeader() {
        return header;
    }

    public LoginEnum getErrorCode() {
        return errorCode;
    }

    public LoginResp(APIHeaderRequest h, LoginEnum err) {
        header = h;
        errorCode = err;
    }
}
