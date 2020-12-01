
package in.rxjavademo.model.product;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import in.rxjavademo.model.master.ProductImage;
import in.rxjavademo.model.master.UnitMaster;

public class ProductDetails {

    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("productUnitId")
    @Expose
    private Integer productUnitId;
    @SerializedName("productSubCategoryId")
    @Expose
    private Integer productSubCategoryId;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("productDescription")
    @Expose
    private String productDescription;
    @SerializedName("productAvailableQuantity")
    @Expose
    private Integer productAvailableQuantity;
    @SerializedName("productPictureUrl")
    @Expose
    private String productPictureUrl;
    @SerializedName("productPictureFilepath")
    @Expose
    private String productPictureFilepath;
    @SerializedName("productRating")
    @Expose
    private Object productRating;
    @SerializedName("productBuyingPrice")
    @Expose
    private Integer productBuyingPrice;
    @SerializedName("productSellingPrice")
    @Expose
    private Integer productSellingPrice;
    @SerializedName("productOfferPrice")
    @Expose
    private Integer productOfferPrice;
    @SerializedName("productIsActive")
    @Expose
    private Boolean productIsActive;
    @SerializedName("productLastUpdatedBy")
    @Expose
    private String productLastUpdatedBy;
    @SerializedName("productCreatedDate")
    @Expose
    private Object productCreatedDate;
    @SerializedName("productLastUpdatedDate")
    @Expose
    private Object productLastUpdatedDate;
    @SerializedName("unitMaster")
    @Expose
    private UnitMaster unitMaster;
    @SerializedName("productQuantityPricing")
    @Expose
    private List<ProductQuantityPricing> productQuantityPricing = null;
    @SerializedName("productImages")
    @Expose
    private List<ProductImage> productImages = null;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductUnitId() {
        return productUnitId;
    }

    public void setProductUnitId(Integer productUnitId) {
        this.productUnitId = productUnitId;
    }

    public Integer getProductSubCategoryId() {
        return productSubCategoryId;
    }

    public void setProductSubCategoryId(Integer productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductAvailableQuantity() {
        return productAvailableQuantity;
    }

    public void setProductAvailableQuantity(Integer productAvailableQuantity) {
        this.productAvailableQuantity = productAvailableQuantity;
    }

    public String getProductPictureUrl() {
        return productPictureUrl;
    }

    public void setProductPictureUrl(String productPictureUrl) {
        this.productPictureUrl = productPictureUrl;
    }

    public String getProductPictureFilepath() {
        return productPictureFilepath;
    }

    public void setProductPictureFilepath(String productPictureFilepath) {
        this.productPictureFilepath = productPictureFilepath;
    }

    public Object getProductRating() {
        return productRating;
    }

    public void setProductRating(Object productRating) {
        this.productRating = productRating;
    }

    public Integer getProductBuyingPrice() {
        return productBuyingPrice;
    }

    public void setProductBuyingPrice(Integer productBuyingPrice) {
        this.productBuyingPrice = productBuyingPrice;
    }

    public Integer getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(Integer productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

    public Integer getProductOfferPrice() {
        return productOfferPrice;
    }

    public void setProductOfferPrice(Integer productOfferPrice) {
        this.productOfferPrice = productOfferPrice;
    }

    public Boolean getProductIsActive() {
        return productIsActive;
    }

    public void setProductIsActive(Boolean productIsActive) {
        this.productIsActive = productIsActive;
    }

    public String getProductLastUpdatedBy() {
        return productLastUpdatedBy;
    }

    public void setProductLastUpdatedBy(String productLastUpdatedBy) {
        this.productLastUpdatedBy = productLastUpdatedBy;
    }

    public Object getProductCreatedDate() {
        return productCreatedDate;
    }

    public void setProductCreatedDate(Object productCreatedDate) {
        this.productCreatedDate = productCreatedDate;
    }

    public Object getProductLastUpdatedDate() {
        return productLastUpdatedDate;
    }

    public void setProductLastUpdatedDate(Object productLastUpdatedDate) {
        this.productLastUpdatedDate = productLastUpdatedDate;
    }

    public UnitMaster getUnitMaster() {
        return unitMaster;
    }

    public void setUnitMaster(UnitMaster unitMaster) {
        this.unitMaster = unitMaster;
    }

    public List<ProductQuantityPricing> getProductQuantityPricing() {
        return productQuantityPricing;
    }

    public void setProductQuantityPricing(List<ProductQuantityPricing> productQuantityPricing) {
        this.productQuantityPricing = productQuantityPricing;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productId=" + productId +
                ", productUnitId=" + productUnitId +
                ", productSubCategoryId=" + productSubCategoryId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productAvailableQuantity=" + productAvailableQuantity +
                ", productPictureUrl='" + productPictureUrl + '\'' +
                ", productPictureFilepath='" + productPictureFilepath + '\'' +
                ", productRating=" + productRating +
                ", productBuyingPrice=" + productBuyingPrice +
                ", productSellingPrice=" + productSellingPrice +
                ", productOfferPrice=" + productOfferPrice +
                ", productIsActive=" + productIsActive +
                ", productLastUpdatedBy='" + productLastUpdatedBy + '\'' +
                ", productCreatedDate=" + productCreatedDate +
                ", productLastUpdatedDate=" + productLastUpdatedDate +
                ", unitMaster=" + unitMaster +
                ", productQuantityPricing=" + productQuantityPricing +
                ", productImages=" + productImages +
                '}';
    }
}
