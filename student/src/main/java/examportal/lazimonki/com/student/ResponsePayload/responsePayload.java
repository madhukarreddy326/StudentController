package examportal.lazimonki.com.student.ResponsePayload;

import java.util.HashMap;

/**
 * responsePayload
 */
public class responsePayload {

    private String status;
    private String errors;
    private HashMap<String,Object> payload;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public HashMap<String, Object> getPayload() {
        return payload;
    }

    public void setPayload(HashMap<String, Object> payload) {
        this.payload = payload;
    }

    public responsePayload(String status, String errors, HashMap<String, Object> payload) {
        this.status = status;
        this.errors = errors;
        this.payload = payload;
    }

    

    

    
}