
package in.rxjavademo.model.product;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductQuantityPricing {

    @SerializedName("pqpId")
    @Expose
    private Integer pqpId;
    @SerializedName("pqpProductId")
    @Expose
    private Integer pqpProductId;
    @SerializedName("pqpQuantity")
    @Expose
    private Float pqpQuantity;
    @SerializedName("pqpPrice")
    @Expose
    private Float pqpPrice;
    @SerializedName("pqpOfferedPrice")
    @Expose
    private Float pqpOfferedPrice;
    @SerializedName("pqpLastUpdatedBy")
    @Expose
    private Object pqpLastUpdatedBy;
    @SerializedName("pqpCreatedDate")
    @Expose
    private Object pqpCreatedDate;
    @SerializedName("pqpLastUpdatedDate")
    @Expose
    private String pqpLastUpdatedDate;
    @SerializedName("stockStore")
    @Expose
    private List<Object> stockStore = null;

    public Integer getPqpId() {
        return pqpId;
    }

    public void setPqpId(Integer pqpId) {
        this.pqpId = pqpId;
    }

    public Integer getPqpProductId() {
        return pqpProductId;
    }

    public void setPqpProductId(Integer pqpProductId) {
        this.pqpProductId = pqpProductId;
    }

    public Float getPqpQuantity() {
        return pqpQuantity;
    }

    public void setPqpQuantity(Float pqpQuantity) {
        this.pqpQuantity = pqpQuantity;
    }

    public Float getPqpPrice() {
        return pqpPrice;
    }

    public void setPqpPrice(Float pqpPrice) {
        this.pqpPrice = pqpPrice;
    }

    public Float getPqpOfferedPrice() {
        return pqpOfferedPrice;
    }

    public void setPqpOfferedPrice(Float pqpOfferedPrice) {
        this.pqpOfferedPrice = pqpOfferedPrice;
    }

    public Object getPqpLastUpdatedBy() {
        return pqpLastUpdatedBy;
    }

    public void setPqpLastUpdatedBy(Object pqpLastUpdatedBy) {
        this.pqpLastUpdatedBy = pqpLastUpdatedBy;
    }

    public Object getPqpCreatedDate() {
        return pqpCreatedDate;
    }

    public void setPqpCreatedDate(Object pqpCreatedDate) {
        this.pqpCreatedDate = pqpCreatedDate;
    }

    public String getPqpLastUpdatedDate() {
        return pqpLastUpdatedDate;
    }

    public void setPqpLastUpdatedDate(String pqpLastUpdatedDate) {
        this.pqpLastUpdatedDate = pqpLastUpdatedDate;
    }

    public List<Object> getStockStore() {
        return stockStore;
    }

    public void setStockStore(List<Object> stockStore) {
        this.stockStore = stockStore;
    }

    @Override
    public String toString() {
        return "ProductQuantityPricing{" +
                "pqpId=" + pqpId +
                ", pqpProductId=" + pqpProductId +
                ", pqpQuantity=" + pqpQuantity +
                ", pqpPrice=" + pqpPrice +
                ", pqpOfferedPrice=" + pqpOfferedPrice +
                ", pqpLastUpdatedBy=" + pqpLastUpdatedBy +
                ", pqpCreatedDate=" + pqpCreatedDate +
                ", pqpLastUpdatedDate='" + pqpLastUpdatedDate + '\'' +
                ", stockStore=" + stockStore +
                '}';
    }
}
