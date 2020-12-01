
package in.rxjavademo.model.productCategory;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.rxjavademo.model.master.Status;

public class ProductCategoriesResponse {

    @SerializedName("validation")
    @Expose
    private Boolean validation;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<ProductCategoryData> data = null;
    @SerializedName("totalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("pageNumber")
    @Expose
    private Object pageNumber;

    public Boolean getValidation() {
        return validation;
    }

    public void setValidation(Boolean validation) {
        this.validation = validation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ProductCategoryData> getData() {
        return data;
    }

    public void setData(List<ProductCategoryData> data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Object getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Object pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "ProductCategoriesResponse{" +
                "validation=" + validation +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", totalCount=" + totalCount +
                ", success=" + success +
                ", status=" + status +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
