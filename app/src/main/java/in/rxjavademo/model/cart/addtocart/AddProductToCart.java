package in.rxjavademo.model.cart.addtocart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddProductToCart {

    @SerializedName("cartUserId")
    @Expose
    private Integer cartUserId;
    @SerializedName("cartProductQuantityPricingId")
    @Expose
    private Integer cartProductQuantityPricingId;
    @SerializedName("cartItemQuantity")
    @Expose
    private Integer cartItemQuantity;
    @SerializedName("cartTotalPrice")
    @Expose
    private Integer cartTotalPrice;
    @SerializedName("cartLastUpdatedBy")
    @Expose
    private String cartLastUpdatedBy;
    @SerializedName("cartIsProdFromOffer")
    @Expose
    private Boolean cartIsProdFromOffer;


    public AddProductToCart() {
    }

    public AddProductToCart(Integer cartUserId, Integer cartProductQuantityPricingId, Integer cartItemQuantity, Integer cartTotalPrice, String cartLastUpdatedBy, Boolean cartIsProdFromOffer) {
        super();
        this.cartUserId = cartUserId;
        this.cartProductQuantityPricingId = cartProductQuantityPricingId;
        this.cartItemQuantity = cartItemQuantity;
        this.cartTotalPrice = cartTotalPrice;
        this.cartLastUpdatedBy = cartLastUpdatedBy;
        this.cartIsProdFromOffer = cartIsProdFromOffer;
    }

    public Integer getCartUserId() {
        return cartUserId;
    }

    public void setCartUserId(Integer cartUserId) {
        this.cartUserId = cartUserId;
    }

    public Integer getCartProductQuantityPricingId() {
        return cartProductQuantityPricingId;
    }

    public void setCartProductQuantityPricingId(Integer cartProductQuantityPricingId) {
        this.cartProductQuantityPricingId = cartProductQuantityPricingId;
    }

    public Integer getCartItemQuantity() {
        return cartItemQuantity;
    }

    public void setCartItemQuantity(Integer cartItemQuantity) {
        this.cartItemQuantity = cartItemQuantity;
    }

    public Integer getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(Integer cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public String getCartLastUpdatedBy() {
        return cartLastUpdatedBy;
    }

    public void setCartLastUpdatedBy(String cartLastUpdatedBy) {
        this.cartLastUpdatedBy = cartLastUpdatedBy;
    }

    public Boolean getCartIsProdFromOffer() {
        return cartIsProdFromOffer;
    }

    public void setCartIsProdFromOffer(Boolean cartIsProdFromOffer) {
        this.cartIsProdFromOffer = cartIsProdFromOffer;
    }

    @Override
    public String toString() {
        return "AddProductToCart{" +
                "cartUserId=" + cartUserId +
                ", cartProductQuantityPricingId=" + cartProductQuantityPricingId +
                ", cartItemQuantity=" + cartItemQuantity +
                ", cartTotalPrice=" + cartTotalPrice +
                ", cartLastUpdatedBy='" + cartLastUpdatedBy + '\'' +
                ", cartIsProdFromOffer=" + cartIsProdFromOffer +
                '}';
    }
}