
package in.rxjavademo.model.master;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnitMaster {

    @SerializedName("unitId")
    @Expose
    private Integer unitId;
    @SerializedName("unitName")
    @Expose
    private String unitName;
    @SerializedName("unitIsActive")
    @Expose
    private Boolean unitIsActive;
    @SerializedName("unitLastUpdatedBy")
    @Expose
    private String unitLastUpdatedBy;
    @SerializedName("unitCreatedDate")
    @Expose
    private Object unitCreatedDate;
    @SerializedName("unitLastUpdatedDate")
    @Expose
    private Object unitLastUpdatedDate;

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Boolean getUnitIsActive() {
        return unitIsActive;
    }

    public void setUnitIsActive(Boolean unitIsActive) {
        this.unitIsActive = unitIsActive;
    }

    public String getUnitLastUpdatedBy() {
        return unitLastUpdatedBy;
    }

    public void setUnitLastUpdatedBy(String unitLastUpdatedBy) {
        this.unitLastUpdatedBy = unitLastUpdatedBy;
    }

    public Object getUnitCreatedDate() {
        return unitCreatedDate;
    }

    public void setUnitCreatedDate(Object unitCreatedDate) {
        this.unitCreatedDate = unitCreatedDate;
    }

    public Object getUnitLastUpdatedDate() {
        return unitLastUpdatedDate;
    }

    public void setUnitLastUpdatedDate(Object unitLastUpdatedDate) {
        this.unitLastUpdatedDate = unitLastUpdatedDate;
    }

    @Override
    public String toString() {
        return "UnitMaster{" +
                "unitId=" + unitId +
                ", unitName='" + unitName + '\'' +
                ", unitIsActive=" + unitIsActive +
                ", unitLastUpdatedBy='" + unitLastUpdatedBy + '\'' +
                ", unitCreatedDate=" + unitCreatedDate +
                ", unitLastUpdatedDate=" + unitLastUpdatedDate +
                '}';
    }
}
