package in.rxjavademo.model.cart.cartadditionresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductAddedToCartData {

    @SerializedName("cartId")
    @Expose
    private Integer cartId;
    @SerializedName("cartProductQuantityPricingId")
    @Expose
    private Integer cartProductQuantityPricingId;
    @SerializedName("cartUserId")
    @Expose
    private Integer cartUserId;
    @SerializedName("cartOfferProdId")
    @Expose
    private Object cartOfferProdId;
    @SerializedName("cartItemQuantity")
    @Expose
    private Integer cartItemQuantity;
    @SerializedName("cartTotalPrice")
    @Expose
    private Double cartTotalPrice;
    @SerializedName("cartIsProdFromOffer")
    @Expose
    private Boolean cartIsProdFromOffer;
    @SerializedName("cartLastUpdatedBy")
    @Expose
    private String cartLastUpdatedBy;
    @SerializedName("cartCreatedDate")
    @Expose
    private String cartCreatedDate;
    @SerializedName("cartLastUpdatedDate")
    @Expose
    private String cartLastUpdatedDate;
    @SerializedName("item")
    @Expose
    private Object item;
    @SerializedName("offerProduct")
    @Expose
    private Object offerProduct;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductAddedToCartData() {
    }

    /**
     * 
     * @param item
     * @param offerProduct
     * @param cartId
     * @param cartLastUpdatedDate
     * @param cartItemQuantity
     * @param cartIsProdFromOffer
     * @param cartUserId
     * @param cartLastUpdatedBy
     * @param cartTotalPrice
     * @param cartCreatedDate
     * @param cartProductQuantityPricingId
     * @param cartOfferProdId
     */
    public ProductAddedToCartData(Integer cartId, Integer cartProductQuantityPricingId, Integer cartUserId, Object cartOfferProdId, Integer cartItemQuantity, Double cartTotalPrice, Boolean cartIsProdFromOffer, String cartLastUpdatedBy, String cartCreatedDate, String cartLastUpdatedDate, Object item, Object offerProduct) {
        super();
        this.cartId = cartId;
        this.cartProductQuantityPricingId = cartProductQuantityPricingId;
        this.cartUserId = cartUserId;
        this.cartOfferProdId = cartOfferProdId;
        this.cartItemQuantity = cartItemQuantity;
        this.cartTotalPrice = cartTotalPrice;
        this.cartIsProdFromOffer = cartIsProdFromOffer;
        this.cartLastUpdatedBy = cartLastUpdatedBy;
        this.cartCreatedDate = cartCreatedDate;
        this.cartLastUpdatedDate = cartLastUpdatedDate;
        this.item = item;
        this.offerProduct = offerProduct;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartProductQuantityPricingId() {
        return cartProductQuantityPricingId;
    }

    public void setCartProductQuantityPricingId(Integer cartProductQuantityPricingId) {
        this.cartProductQuantityPricingId = cartProductQuantityPricingId;
    }

    public Integer getCartUserId() {
        return cartUserId;
    }

    public void setCartUserId(Integer cartUserId) {
        this.cartUserId = cartUserId;
    }

    public Object getCartOfferProdId() {
        return cartOfferProdId;
    }

    public void setCartOfferProdId(Object cartOfferProdId) {
        this.cartOfferProdId = cartOfferProdId;
    }

    public Integer getCartItemQuantity() {
        return cartItemQuantity;
    }

    public void setCartItemQuantity(Integer cartItemQuantity) {
        this.cartItemQuantity = cartItemQuantity;
    }

    public Double getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(Double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Boolean getCartIsProdFromOffer() {
        return cartIsProdFromOffer;
    }

    public void setCartIsProdFromOffer(Boolean cartIsProdFromOffer) {
        this.cartIsProdFromOffer = cartIsProdFromOffer;
    }

    public String getCartLastUpdatedBy() {
        return cartLastUpdatedBy;
    }

    public void setCartLastUpdatedBy(String cartLastUpdatedBy) {
        this.cartLastUpdatedBy = cartLastUpdatedBy;
    }

    public String getCartCreatedDate() {
        return cartCreatedDate;
    }

    public void setCartCreatedDate(String cartCreatedDate) {
        this.cartCreatedDate = cartCreatedDate;
    }

    public String getCartLastUpdatedDate() {
        return cartLastUpdatedDate;
    }

    public void setCartLastUpdatedDate(String cartLastUpdatedDate) {
        this.cartLastUpdatedDate = cartLastUpdatedDate;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getOfferProduct() {
        return offerProduct;
    }

    public void setOfferProduct(Object offerProduct) {
        this.offerProduct = offerProduct;
    }

    @Override
    public String toString() {
        return "ProductAddedToCartData{" +
                "cartId=" + cartId +
                ", cartProductQuantityPricingId=" + cartProductQuantityPricingId +
                ", cartUserId=" + cartUserId +
                ", cartOfferProdId=" + cartOfferProdId +
                ", cartItemQuantity=" + cartItemQuantity +
                ", cartTotalPrice=" + cartTotalPrice +
                ", cartIsProdFromOffer=" + cartIsProdFromOffer +
                ", cartLastUpdatedBy='" + cartLastUpdatedBy + '\'' +
                ", cartCreatedDate='" + cartCreatedDate + '\'' +
                ", cartLastUpdatedDate='" + cartLastUpdatedDate + '\'' +
                ", item=" + item +
                ", offerProduct=" + offerProduct +
                '}';
    }
}
