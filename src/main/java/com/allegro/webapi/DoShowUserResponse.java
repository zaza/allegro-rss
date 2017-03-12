/**
 * DoShowUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoShowUserResponse  implements java.io.Serializable {
    private long userId;

    private java.lang.String userLogin;

    private int userCountry;

    private long userCreateDate;

    private long userLoginDate;

    private int userRating;

    private int userIsNewUser;

    private int userNotActivated;

    private int userClosed;

    private int userBlocked;

    private int userTerminated;

    private int userHasPage;

    private int userIsSseller;

    private int userIsEco;

    private com.allegro.webapi.ShowUserFeedbacks userPositiveFeedback;

    private com.allegro.webapi.ShowUserFeedbacks userNegativeFeedback;

    private com.allegro.webapi.ShowUserFeedbacks userNeutralFeedback;

    private int userJuniorStatus;

    private int userHasShop;

    private int userCompanyIcon;

    private int userSellRatingCount;

    private com.allegro.webapi.ArrayOfSellratingaveragestruct userSellRatingAverage;

    private int userIsAllegroStandard;

    private int userIsB2CSeller;

    public DoShowUserResponse() {
    }

    public DoShowUserResponse(
           long userId,
           java.lang.String userLogin,
           int userCountry,
           long userCreateDate,
           long userLoginDate,
           int userRating,
           int userIsNewUser,
           int userNotActivated,
           int userClosed,
           int userBlocked,
           int userTerminated,
           int userHasPage,
           int userIsSseller,
           int userIsEco,
           com.allegro.webapi.ShowUserFeedbacks userPositiveFeedback,
           com.allegro.webapi.ShowUserFeedbacks userNegativeFeedback,
           com.allegro.webapi.ShowUserFeedbacks userNeutralFeedback,
           int userJuniorStatus,
           int userHasShop,
           int userCompanyIcon,
           int userSellRatingCount,
           com.allegro.webapi.ArrayOfSellratingaveragestruct userSellRatingAverage,
           int userIsAllegroStandard,
           int userIsB2CSeller) {
           this.userId = userId;
           this.userLogin = userLogin;
           this.userCountry = userCountry;
           this.userCreateDate = userCreateDate;
           this.userLoginDate = userLoginDate;
           this.userRating = userRating;
           this.userIsNewUser = userIsNewUser;
           this.userNotActivated = userNotActivated;
           this.userClosed = userClosed;
           this.userBlocked = userBlocked;
           this.userTerminated = userTerminated;
           this.userHasPage = userHasPage;
           this.userIsSseller = userIsSseller;
           this.userIsEco = userIsEco;
           this.userPositiveFeedback = userPositiveFeedback;
           this.userNegativeFeedback = userNegativeFeedback;
           this.userNeutralFeedback = userNeutralFeedback;
           this.userJuniorStatus = userJuniorStatus;
           this.userHasShop = userHasShop;
           this.userCompanyIcon = userCompanyIcon;
           this.userSellRatingCount = userSellRatingCount;
           this.userSellRatingAverage = userSellRatingAverage;
           this.userIsAllegroStandard = userIsAllegroStandard;
           this.userIsB2CSeller = userIsB2CSeller;
    }


    /**
     * Gets the userId value for this DoShowUserResponse.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoShowUserResponse.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userLogin value for this DoShowUserResponse.
     * 
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this DoShowUserResponse.
     * 
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the userCountry value for this DoShowUserResponse.
     * 
     * @return userCountry
     */
    public int getUserCountry() {
        return userCountry;
    }


    /**
     * Sets the userCountry value for this DoShowUserResponse.
     * 
     * @param userCountry
     */
    public void setUserCountry(int userCountry) {
        this.userCountry = userCountry;
    }


    /**
     * Gets the userCreateDate value for this DoShowUserResponse.
     * 
     * @return userCreateDate
     */
    public long getUserCreateDate() {
        return userCreateDate;
    }


    /**
     * Sets the userCreateDate value for this DoShowUserResponse.
     * 
     * @param userCreateDate
     */
    public void setUserCreateDate(long userCreateDate) {
        this.userCreateDate = userCreateDate;
    }


    /**
     * Gets the userLoginDate value for this DoShowUserResponse.
     * 
     * @return userLoginDate
     */
    public long getUserLoginDate() {
        return userLoginDate;
    }


    /**
     * Sets the userLoginDate value for this DoShowUserResponse.
     * 
     * @param userLoginDate
     */
    public void setUserLoginDate(long userLoginDate) {
        this.userLoginDate = userLoginDate;
    }


    /**
     * Gets the userRating value for this DoShowUserResponse.
     * 
     * @return userRating
     */
    public int getUserRating() {
        return userRating;
    }


    /**
     * Sets the userRating value for this DoShowUserResponse.
     * 
     * @param userRating
     */
    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }


    /**
     * Gets the userIsNewUser value for this DoShowUserResponse.
     * 
     * @return userIsNewUser
     */
    public int getUserIsNewUser() {
        return userIsNewUser;
    }


    /**
     * Sets the userIsNewUser value for this DoShowUserResponse.
     * 
     * @param userIsNewUser
     */
    public void setUserIsNewUser(int userIsNewUser) {
        this.userIsNewUser = userIsNewUser;
    }


    /**
     * Gets the userNotActivated value for this DoShowUserResponse.
     * 
     * @return userNotActivated
     */
    public int getUserNotActivated() {
        return userNotActivated;
    }


    /**
     * Sets the userNotActivated value for this DoShowUserResponse.
     * 
     * @param userNotActivated
     */
    public void setUserNotActivated(int userNotActivated) {
        this.userNotActivated = userNotActivated;
    }


    /**
     * Gets the userClosed value for this DoShowUserResponse.
     * 
     * @return userClosed
     */
    public int getUserClosed() {
        return userClosed;
    }


    /**
     * Sets the userClosed value for this DoShowUserResponse.
     * 
     * @param userClosed
     */
    public void setUserClosed(int userClosed) {
        this.userClosed = userClosed;
    }


    /**
     * Gets the userBlocked value for this DoShowUserResponse.
     * 
     * @return userBlocked
     */
    public int getUserBlocked() {
        return userBlocked;
    }


    /**
     * Sets the userBlocked value for this DoShowUserResponse.
     * 
     * @param userBlocked
     */
    public void setUserBlocked(int userBlocked) {
        this.userBlocked = userBlocked;
    }


    /**
     * Gets the userTerminated value for this DoShowUserResponse.
     * 
     * @return userTerminated
     */
    public int getUserTerminated() {
        return userTerminated;
    }


    /**
     * Sets the userTerminated value for this DoShowUserResponse.
     * 
     * @param userTerminated
     */
    public void setUserTerminated(int userTerminated) {
        this.userTerminated = userTerminated;
    }


    /**
     * Gets the userHasPage value for this DoShowUserResponse.
     * 
     * @return userHasPage
     */
    public int getUserHasPage() {
        return userHasPage;
    }


    /**
     * Sets the userHasPage value for this DoShowUserResponse.
     * 
     * @param userHasPage
     */
    public void setUserHasPage(int userHasPage) {
        this.userHasPage = userHasPage;
    }


    /**
     * Gets the userIsSseller value for this DoShowUserResponse.
     * 
     * @return userIsSseller
     */
    public int getUserIsSseller() {
        return userIsSseller;
    }


    /**
     * Sets the userIsSseller value for this DoShowUserResponse.
     * 
     * @param userIsSseller
     */
    public void setUserIsSseller(int userIsSseller) {
        this.userIsSseller = userIsSseller;
    }


    /**
     * Gets the userIsEco value for this DoShowUserResponse.
     * 
     * @return userIsEco
     */
    public int getUserIsEco() {
        return userIsEco;
    }


    /**
     * Sets the userIsEco value for this DoShowUserResponse.
     * 
     * @param userIsEco
     */
    public void setUserIsEco(int userIsEco) {
        this.userIsEco = userIsEco;
    }


    /**
     * Gets the userPositiveFeedback value for this DoShowUserResponse.
     * 
     * @return userPositiveFeedback
     */
    public com.allegro.webapi.ShowUserFeedbacks getUserPositiveFeedback() {
        return userPositiveFeedback;
    }


    /**
     * Sets the userPositiveFeedback value for this DoShowUserResponse.
     * 
     * @param userPositiveFeedback
     */
    public void setUserPositiveFeedback(com.allegro.webapi.ShowUserFeedbacks userPositiveFeedback) {
        this.userPositiveFeedback = userPositiveFeedback;
    }


    /**
     * Gets the userNegativeFeedback value for this DoShowUserResponse.
     * 
     * @return userNegativeFeedback
     */
    public com.allegro.webapi.ShowUserFeedbacks getUserNegativeFeedback() {
        return userNegativeFeedback;
    }


    /**
     * Sets the userNegativeFeedback value for this DoShowUserResponse.
     * 
     * @param userNegativeFeedback
     */
    public void setUserNegativeFeedback(com.allegro.webapi.ShowUserFeedbacks userNegativeFeedback) {
        this.userNegativeFeedback = userNegativeFeedback;
    }


    /**
     * Gets the userNeutralFeedback value for this DoShowUserResponse.
     * 
     * @return userNeutralFeedback
     */
    public com.allegro.webapi.ShowUserFeedbacks getUserNeutralFeedback() {
        return userNeutralFeedback;
    }


    /**
     * Sets the userNeutralFeedback value for this DoShowUserResponse.
     * 
     * @param userNeutralFeedback
     */
    public void setUserNeutralFeedback(com.allegro.webapi.ShowUserFeedbacks userNeutralFeedback) {
        this.userNeutralFeedback = userNeutralFeedback;
    }


    /**
     * Gets the userJuniorStatus value for this DoShowUserResponse.
     * 
     * @return userJuniorStatus
     */
    public int getUserJuniorStatus() {
        return userJuniorStatus;
    }


    /**
     * Sets the userJuniorStatus value for this DoShowUserResponse.
     * 
     * @param userJuniorStatus
     */
    public void setUserJuniorStatus(int userJuniorStatus) {
        this.userJuniorStatus = userJuniorStatus;
    }


    /**
     * Gets the userHasShop value for this DoShowUserResponse.
     * 
     * @return userHasShop
     */
    public int getUserHasShop() {
        return userHasShop;
    }


    /**
     * Sets the userHasShop value for this DoShowUserResponse.
     * 
     * @param userHasShop
     */
    public void setUserHasShop(int userHasShop) {
        this.userHasShop = userHasShop;
    }


    /**
     * Gets the userCompanyIcon value for this DoShowUserResponse.
     * 
     * @return userCompanyIcon
     */
    public int getUserCompanyIcon() {
        return userCompanyIcon;
    }


    /**
     * Sets the userCompanyIcon value for this DoShowUserResponse.
     * 
     * @param userCompanyIcon
     */
    public void setUserCompanyIcon(int userCompanyIcon) {
        this.userCompanyIcon = userCompanyIcon;
    }


    /**
     * Gets the userSellRatingCount value for this DoShowUserResponse.
     * 
     * @return userSellRatingCount
     */
    public int getUserSellRatingCount() {
        return userSellRatingCount;
    }


    /**
     * Sets the userSellRatingCount value for this DoShowUserResponse.
     * 
     * @param userSellRatingCount
     */
    public void setUserSellRatingCount(int userSellRatingCount) {
        this.userSellRatingCount = userSellRatingCount;
    }


    /**
     * Gets the userSellRatingAverage value for this DoShowUserResponse.
     * 
     * @return userSellRatingAverage
     */
    public com.allegro.webapi.ArrayOfSellratingaveragestruct getUserSellRatingAverage() {
        return userSellRatingAverage;
    }


    /**
     * Sets the userSellRatingAverage value for this DoShowUserResponse.
     * 
     * @param userSellRatingAverage
     */
    public void setUserSellRatingAverage(com.allegro.webapi.ArrayOfSellratingaveragestruct userSellRatingAverage) {
        this.userSellRatingAverage = userSellRatingAverage;
    }


    /**
     * Gets the userIsAllegroStandard value for this DoShowUserResponse.
     * 
     * @return userIsAllegroStandard
     */
    public int getUserIsAllegroStandard() {
        return userIsAllegroStandard;
    }


    /**
     * Sets the userIsAllegroStandard value for this DoShowUserResponse.
     * 
     * @param userIsAllegroStandard
     */
    public void setUserIsAllegroStandard(int userIsAllegroStandard) {
        this.userIsAllegroStandard = userIsAllegroStandard;
    }


    /**
     * Gets the userIsB2CSeller value for this DoShowUserResponse.
     * 
     * @return userIsB2CSeller
     */
    public int getUserIsB2CSeller() {
        return userIsB2CSeller;
    }


    /**
     * Sets the userIsB2CSeller value for this DoShowUserResponse.
     * 
     * @param userIsB2CSeller
     */
    public void setUserIsB2CSeller(int userIsB2CSeller) {
        this.userIsB2CSeller = userIsB2CSeller;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowUserResponse)) return false;
        DoShowUserResponse other = (DoShowUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userId == other.getUserId() &&
            ((this.userLogin==null && other.getUserLogin()==null) || 
             (this.userLogin!=null &&
              this.userLogin.equals(other.getUserLogin()))) &&
            this.userCountry == other.getUserCountry() &&
            this.userCreateDate == other.getUserCreateDate() &&
            this.userLoginDate == other.getUserLoginDate() &&
            this.userRating == other.getUserRating() &&
            this.userIsNewUser == other.getUserIsNewUser() &&
            this.userNotActivated == other.getUserNotActivated() &&
            this.userClosed == other.getUserClosed() &&
            this.userBlocked == other.getUserBlocked() &&
            this.userTerminated == other.getUserTerminated() &&
            this.userHasPage == other.getUserHasPage() &&
            this.userIsSseller == other.getUserIsSseller() &&
            this.userIsEco == other.getUserIsEco() &&
            ((this.userPositiveFeedback==null && other.getUserPositiveFeedback()==null) || 
             (this.userPositiveFeedback!=null &&
              this.userPositiveFeedback.equals(other.getUserPositiveFeedback()))) &&
            ((this.userNegativeFeedback==null && other.getUserNegativeFeedback()==null) || 
             (this.userNegativeFeedback!=null &&
              this.userNegativeFeedback.equals(other.getUserNegativeFeedback()))) &&
            ((this.userNeutralFeedback==null && other.getUserNeutralFeedback()==null) || 
             (this.userNeutralFeedback!=null &&
              this.userNeutralFeedback.equals(other.getUserNeutralFeedback()))) &&
            this.userJuniorStatus == other.getUserJuniorStatus() &&
            this.userHasShop == other.getUserHasShop() &&
            this.userCompanyIcon == other.getUserCompanyIcon() &&
            this.userSellRatingCount == other.getUserSellRatingCount() &&
            ((this.userSellRatingAverage==null && other.getUserSellRatingAverage()==null) || 
             (this.userSellRatingAverage!=null &&
              this.userSellRatingAverage.equals(other.getUserSellRatingAverage()))) &&
            this.userIsAllegroStandard == other.getUserIsAllegroStandard() &&
            this.userIsB2CSeller == other.getUserIsB2CSeller();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserLogin() != null) {
            _hashCode += getUserLogin().hashCode();
        }
        _hashCode += getUserCountry();
        _hashCode += new Long(getUserCreateDate()).hashCode();
        _hashCode += new Long(getUserLoginDate()).hashCode();
        _hashCode += getUserRating();
        _hashCode += getUserIsNewUser();
        _hashCode += getUserNotActivated();
        _hashCode += getUserClosed();
        _hashCode += getUserBlocked();
        _hashCode += getUserTerminated();
        _hashCode += getUserHasPage();
        _hashCode += getUserIsSseller();
        _hashCode += getUserIsEco();
        if (getUserPositiveFeedback() != null) {
            _hashCode += getUserPositiveFeedback().hashCode();
        }
        if (getUserNegativeFeedback() != null) {
            _hashCode += getUserNegativeFeedback().hashCode();
        }
        if (getUserNeutralFeedback() != null) {
            _hashCode += getUserNeutralFeedback().hashCode();
        }
        _hashCode += getUserJuniorStatus();
        _hashCode += getUserHasShop();
        _hashCode += getUserCompanyIcon();
        _hashCode += getUserSellRatingCount();
        if (getUserSellRatingAverage() != null) {
            _hashCode += getUserSellRatingAverage().hashCode();
        }
        _hashCode += getUserIsAllegroStandard();
        _hashCode += getUserIsB2CSeller();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRating");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIsNewUser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userIsNewUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userNotActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTerminated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userTerminated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userHasPage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userHasPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIsSseller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userIsSseller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIsEco");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userIsEco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPositiveFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userPositiveFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNegativeFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userNegativeFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNeutralFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userNeutralFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJuniorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userJuniorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userHasShop");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userHasShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCompanyIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userCompanyIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSellRatingCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userSellRatingCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSellRatingAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userSellRatingAverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIsAllegroStandard");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userIsAllegroStandard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIsB2CSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userIsB2cSeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
