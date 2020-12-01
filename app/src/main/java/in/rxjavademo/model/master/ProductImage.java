
package in.rxjavademo.model.master;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductImage {

    @SerializedName("imageId")
    @Expose
    private Integer imageId;
    @SerializedName("imageProductId")
    @Expose
    private Integer imageProductId;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("imageCreatedDate")
    @Expose
    private Object imageCreatedDate;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getImageProductId() {
        return imageProductId;
    }

    public void setImageProductId(Integer imageProductId) {
        this.imageProductId = imageProductId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getImageCreatedDate() {
        return imageCreatedDate;
    }

    public void setImageCreatedDate(Object imageCreatedDate) {
        this.imageCreatedDate = imageCreatedDate;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "imageId=" + imageId +
                ", imageProductId=" + imageProductId +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageCreatedDate=" + imageCreatedDate +
                '}';
    }
}
