package com.mibtech.HDAdmin.Model;

public class ShopModel  {
    private String shopName;
    private String shopAddress;
    private String shopPhoneNumber;
    private String shopRating;
    private String shopProfilePic;

    public ShopModel() {
    }

    public ShopModel(String shopName, String shopAddress, String shopPhoneNumber, String shopRating, String shopProfilePic) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPhoneNumber = shopPhoneNumber;
        this.shopRating = shopRating;
        this.shopProfilePic = shopProfilePic;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }

    public String getShopRating() {
        return shopRating;
    }

    public void setShopRating(String shopRating) {
        this.shopRating = shopRating;
    }

    public String getShopProfilePic() {
        return shopProfilePic;
    }

    public void setShopProfilePic(String shopProfilePic) {
        this.shopProfilePic = shopProfilePic;
    }
}
