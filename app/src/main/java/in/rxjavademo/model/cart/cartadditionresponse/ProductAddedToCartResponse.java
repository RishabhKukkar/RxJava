package in.rxjavademo.model.cart.cartadditionresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.rxjavademo.model.master.Status;

public class ProductAddedToCartResponse {

    @SerializedName("validation")
    @Expose
    private Boolean validation;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private ProductAddedToCartData productAddedToCartData;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductAddedToCartResponse() {
    }

    /**
     * 
     * @param pageNumber
     * @param productAddedToCartData
     * @param success
     * @param message
     * @param totalCount
     * @param validation
     * @param status
     */
    public ProductAddedToCartResponse(Boolean validation, String message, ProductAddedToCartData productAddedToCartData, Integer totalCount, Boolean success, Status status, Object pageNumber) {
        super();
        this.validation = validation;
        this.message = message;
        this.productAddedToCartData = productAddedToCartData;
        this.totalCount = totalCount;
        this.success = success;
        this.status = status;
        this.pageNumber = pageNumber;
    }

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

    public ProductAddedToCartData getProductAddedToCartData() {
        return productAddedToCartData;
    }

    public void setProductAddedToCartData(ProductAddedToCartData productAddedToCartData) {
        this.productAddedToCartData = productAddedToCartData;
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
        return "ProductAddedToCartResponse{" +
                "validation=" + validation +
                ", message='" + message + '\'' +
                ", productAddedToCartData=" + productAddedToCartData +
                ", totalCount=" + totalCount +
                ", success=" + success +
                ", status=" + status +
                ", pageNumber=" + pageNumber +
                '}';
    }
}