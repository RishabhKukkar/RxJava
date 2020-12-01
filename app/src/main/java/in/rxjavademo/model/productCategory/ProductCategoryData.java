
package in.rxjavademo.model.productCategory;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProductCategoryData {

    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("categoryPictureUrl")
    @Expose
    private String categoryPictureUrl;
    @SerializedName("categoryPictureFilepath")
    @Expose
    private String categoryPictureFilepath;
    @SerializedName("categoryIsActive")
    @Expose
    private Boolean categoryIsActive;
    @SerializedName("categoryLastUpdatedBy")
    @Expose
    private String categoryLastUpdatedBy;
    @SerializedName("categoryCreatedDate")
    @Expose
    private Object categoryCreatedDate;
    @SerializedName("productSubCategories")
    @Expose
    private List<ProductSubCategory> productSubCategories = null;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryPictureUrl() {
        return categoryPictureUrl;
    }

    public void setCategoryPictureUrl(String categoryPictureUrl) {
        this.categoryPictureUrl = categoryPictureUrl;
    }

    public String getCategoryPictureFilepath() {
        return categoryPictureFilepath;
    }

    public void setCategoryPictureFilepath(String categoryPictureFilepath) {
        this.categoryPictureFilepath = categoryPictureFilepath;
    }

    public Boolean getCategoryIsActive() {
        return categoryIsActive;
    }

    public void setCategoryIsActive(Boolean categoryIsActive) {
        this.categoryIsActive = categoryIsActive;
    }

    public String getCategoryLastUpdatedBy() {
        return categoryLastUpdatedBy;
    }

    public void setCategoryLastUpdatedBy(String categoryLastUpdatedBy) {
        this.categoryLastUpdatedBy = categoryLastUpdatedBy;
    }

    public Object getCategoryCreatedDate() {
        return categoryCreatedDate;
    }

    public void setCategoryCreatedDate(Object categoryCreatedDate) {
        this.categoryCreatedDate = categoryCreatedDate;
    }

    public List<ProductSubCategory> getProductSubCategories() {
        return productSubCategories;
    }

    public void setProductSubCategories(List<ProductSubCategory> productSubCategories) {
        this.productSubCategories = productSubCategories;
    }

    @Override
    public String toString() {
        return "ProductCategoryData{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryPictureUrl='" + categoryPictureUrl + '\'' +
                ", categoryPictureFilepath='" + categoryPictureFilepath + '\'' +
                ", categoryIsActive=" + categoryIsActive +
                ", categoryLastUpdatedBy='" + categoryLastUpdatedBy + '\'' +
                ", categoryCreatedDate=" + categoryCreatedDate +
                ", productSubCategories=" + productSubCategories +
                '}';
    }
}
