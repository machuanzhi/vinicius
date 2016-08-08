package com.smk.pay.order.exception;

/**
 * Created by 马传志 on 2016/8/1.
 */
public class ManagerService extends Exception {

    public ManagerService() {
        super();
    }

    public ManagerService(String message) {
        super(message);
    }

    public ManagerService(String message, Throwable cause) {
        super(message, cause);
    }

    public ManagerService(Throwable cause) {
        super(cause);
    }

    public ManagerService(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
