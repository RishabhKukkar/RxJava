
package in.rxjavademo.model.productCategory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductSubCategory {

    @SerializedName("subCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("subCategoryMasterId")
    @Expose
    private Integer subCategoryMasterId;
    @SerializedName("subCategoryName")
    @Expose
    private String subCategoryName;
    @SerializedName("subCategoryPictureUrl")
    @Expose
    private String subCategoryPictureUrl;
    @SerializedName("subCategoryPictureFilepath")
    @Expose
    private String subCategoryPictureFilepath;
    @SerializedName("subCategoryIsActive")
    @Expose
    private Boolean subCategoryIsActive;
    @SerializedName("subCategoryLastUpdatedBy")
    @Expose
    private String subCategoryLastUpdatedBy;
    @SerializedName("subCategoryCreatedDate")
    @Expose
    private String subCategoryCreatedDate;
    @SerializedName("subCategoryLastUpdatedDate")
    @Expose
    private Object subCategoryLastUpdatedDate;

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Integer getSubCategoryMasterId() {
        return subCategoryMasterId;
    }

    public void setSubCategoryMasterId(Integer subCategoryMasterId) {
        this.subCategoryMasterId = subCategoryMasterId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryPictureUrl() {
        return subCategoryPictureUrl;
    }

    public void setSubCategoryPictureUrl(String subCategoryPictureUrl) {
        this.subCategoryPictureUrl = subCategoryPictureUrl;
    }

    public String getSubCategoryPictureFilepath() {
        return subCategoryPictureFilepath;
    }

    public void setSubCategoryPictureFilepath(String subCategoryPictureFilepath) {
        this.subCategoryPictureFilepath = subCategoryPictureFilepath;
    }

    public Boolean getSubCategoryIsActive() {
        return subCategoryIsActive;
    }

    public void setSubCategoryIsActive(Boolean subCategoryIsActive) {
        this.subCategoryIsActive = subCategoryIsActive;
    }

    public String getSubCategoryLastUpdatedBy() {
        return subCategoryLastUpdatedBy;
    }

    public void setSubCategoryLastUpdatedBy(String subCategoryLastUpdatedBy) {
        this.subCategoryLastUpdatedBy = subCategoryLastUpdatedBy;
    }

    public String getSubCategoryCreatedDate() {
        return subCategoryCreatedDate;
    }

    public void setSubCategoryCreatedDate(String subCategoryCreatedDate) {
        this.subCategoryCreatedDate = subCategoryCreatedDate;
    }

    public Object getSubCategoryLastUpdatedDate() {
        return subCategoryLastUpdatedDate;
    }

    public void setSubCategoryLastUpdatedDate(Object subCategoryLastUpdatedDate) {
        this.subCategoryLastUpdatedDate = subCategoryLastUpdatedDate;
    }

    @Override
    public String toString() {
        return "ProductSubCategory{" +
                "subCategoryId=" + subCategoryId +
                ", subCategoryMasterId=" + subCategoryMasterId +
                ", subCategoryName='" + subCategoryName + '\'' +
                ", subCategoryPictureUrl='" + subCategoryPictureUrl + '\'' +
                ", subCategoryPictureFilepath='" + subCategoryPictureFilepath + '\'' +
                ", subCategoryIsActive=" + subCategoryIsActive +
                ", subCategoryLastUpdatedBy='" + subCategoryLastUpdatedBy + '\'' +
                ", subCategoryCreatedDate='" + subCategoryCreatedDate + '\'' +
                ", subCategoryLastUpdatedDate=" + subCategoryLastUpdatedDate +
                '}';
    }
}
