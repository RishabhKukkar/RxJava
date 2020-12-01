
package in.rxjavademo.model.master;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("statusMessage")
    @Expose
    private String statusMessage;
    @SerializedName("messageKey")
    @Expose
    private String messageKey;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("statusLevel")
    @Expose
    private String statusLevel;
    @SerializedName("uniqueId")
    @Expose
    private Object uniqueId;

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusLevel() {
        return statusLevel;
    }

    public void setStatusLevel(String statusLevel) {
        this.statusLevel = statusLevel;
    }

    public Object getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Object uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusMessage='" + statusMessage + '\'' +
                ", messageKey='" + messageKey + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", statusLevel='" + statusLevel + '\'' +
                ", uniqueId=" + uniqueId +
                '}';
    }
}
