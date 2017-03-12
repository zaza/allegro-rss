/**
 * ServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ServiceBindingStub extends org.apache.axis.client.Stub implements com.allegro.webapi.ServicePort_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[121];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddDescToItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest"), com.allegro.webapi.DoAddDescToItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoAddDescToItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddDescToItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddPackageInfoToPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest"), com.allegro.webapi.DoAddPackageInfoToPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse"));
        oper.setReturnClass(com.allegro.webapi.DoAddPackageInfoToPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddPackageInfoToPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest"), com.allegro.webapi.DoAddToBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse"));
        oper.setReturnClass(com.allegro.webapi.DoAddToBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest"), com.allegro.webapi.DoBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest"), com.allegro.webapi.DoCancelBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCancelBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest"), com.allegro.webapi.DoCancelRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCancelRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundWarning");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundWarningRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningRequest"), com.allegro.webapi.DoCancelRefundWarningRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCancelRefundWarningResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundWarningResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest"), com.allegro.webapi.DoCancelTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCancelTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest"), com.allegro.webapi.DoChangeItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoChangeItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangePriceItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest"), com.allegro.webapi.DoChangePriceItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoChangePriceItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangePriceItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeQuantityItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest"), com.allegro.webapi.DoChangeQuantityItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoChangeQuantityItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeQuantityItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckItemDescriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest"), com.allegro.webapi.DoCheckItemDescriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCheckItemDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckItemDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest"), com.allegro.webapi.DoCheckNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCheckNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCreateItemTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCreateItemTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest"), com.allegro.webapi.DoCreateItemTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse"));
        oper.setReturnClass(com.allegro.webapi.DoCreateItemTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCreateItemTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest"), com.allegro.webapi.DoFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse"));
        oper.setReturnClass(com.allegro.webapi.DoFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFeedbackManyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest"), com.allegro.webapi.DoFeedbackManyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse"));
        oper.setReturnClass(com.allegro.webapi.DoFeedbackManyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFeedbackManyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest"), com.allegro.webapi.DoFinishItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoFinishItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest"), com.allegro.webapi.DoFinishItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoFinishItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetAdminUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest"), com.allegro.webapi.DoGetAdminUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetAdminUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetAdminUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetArchiveRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetArchiveRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetArchiveRefundsListRequest"), com.allegro.webapi.DoGetArchiveRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetArchiveRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetArchiveRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBidItem2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request"), com.allegro.webapi.DoGetBidItem2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response"));
        oper.setReturnClass(com.allegro.webapi.DoGetBidItem2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBidItem2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBlackListUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest"), com.allegro.webapi.DoGetBlackListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetBlackListUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBlackListUsersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCategoryPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest"), com.allegro.webapi.DoGetCategoryPathRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetCategoryPathResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCategoryPathResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest"), com.allegro.webapi.DoGetCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest"), com.allegro.webapi.DoGetCatsDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetCatsDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest"), com.allegro.webapi.DoGetCatsDataLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetCatsDataLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest"), com.allegro.webapi.DoGetCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest"), com.allegro.webapi.DoGetDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteCategoriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest"), com.allegro.webapi.DoGetFavouriteCategoriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetFavouriteCategoriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteCategoriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFavouriteSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest"), com.allegro.webapi.DoGetFavouriteSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetFavouriteSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFavouriteSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFeedbackRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest"), com.allegro.webapi.DoGetFeedbackRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetFeedbackResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFeedbackResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFilledPostBuyFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest"), com.allegro.webapi.DoGetFilledPostBuyFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetFilledPostBuyFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFilledPostBuyFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest"), com.allegro.webapi.DoGetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest"), com.allegro.webapi.DoGetItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest"), com.allegro.webapi.DoGetItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsImagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest"), com.allegro.webapi.DoGetItemsImagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetItemsImagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsImagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest"), com.allegro.webapi.DoGetItemsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetItemsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest"), com.allegro.webapi.DoGetItemsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetItemsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMessageToBuyer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMessageToBuyerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest"), com.allegro.webapi.DoGetMessageToBuyerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMessageToBuyerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMessageToBuyerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest"), com.allegro.webapi.DoGetMyAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyBidItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest"), com.allegro.webapi.DoGetMyBidItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyBidItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyBidItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyCurrentShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest"), com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest"), com.allegro.webapi.DoGetMyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyFutureItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest"), com.allegro.webapi.DoGetMyFutureItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyFutureItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyFutureItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest"), com.allegro.webapi.DoGetMyIncomingPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyIncomingPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest"), com.allegro.webapi.DoGetMyIncomingPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyIncomingPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotSoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest"), com.allegro.webapi.DoGetMyNotSoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyNotSoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotSoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest"), com.allegro.webapi.DoGetMyNotWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyNotWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest"), com.allegro.webapi.DoGetMyPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest"), com.allegro.webapi.DoGetMyPaymentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyPaymentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest"), com.allegro.webapi.DoGetMyPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest"), com.allegro.webapi.DoGetMyPayoutsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyPayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayoutsDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsDetailsRequest"), com.allegro.webapi.DoGetMyPayoutsDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsDetailsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyPayoutsDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest"), com.allegro.webapi.DoGetMySellItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMySellItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellRatingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest"), com.allegro.webapi.DoGetMySellRatingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMySellRatingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellRatingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest"), com.allegro.webapi.DoGetMySoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMySoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest"), com.allegro.webapi.DoGetMyWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetMyWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest"), com.allegro.webapi.DoGetPaymentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPaymentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentMethodsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest"), com.allegro.webapi.DoGetPaymentMethodsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPaymentMethodsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentMethodsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest"), com.allegro.webapi.DoGetPostBuyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPostBuyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForBuyersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest"), com.allegro.webapi.DoGetPostBuyFormsDataForBuyersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPostBuyFormsDataForBuyersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForBuyersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest"), com.allegro.webapi.DoGetPostBuyFormsDataForSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPostBuyFormsDataForSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest"), com.allegro.webapi.DoGetPostBuyFormsIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPostBuyFormsIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyItemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest"), com.allegro.webapi.DoGetPostBuyItemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetPostBuyItemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyItemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest"), com.allegro.webapi.DoGetRefundsDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetRefundsDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest"), com.allegro.webapi.DoGetRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest"), com.allegro.webapi.DoGetRefundsReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetRefundsReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest"), com.allegro.webapi.DoGetRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormAttribsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest"), com.allegro.webapi.DoGetSellFormAttribsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellFormAttribsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormAttribsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest"), com.allegro.webapi.DoGetSellFormFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellFormFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest"), com.allegro.webapi.DoGetSellFormFieldsExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellFormFieldsExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsExtLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest"), com.allegro.webapi.DoGetSellFormFieldsExtLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellFormFieldsExtLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsExtLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsForCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest"), com.allegro.webapi.DoGetSellFormFieldsForCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellFormFieldsForCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsForCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest"), com.allegro.webapi.DoGetSellFormFieldsLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellFormFieldsLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellRatingReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest"), com.allegro.webapi.DoGetSellRatingReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSellRatingReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellRatingReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSessionHandleForWidgetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest"), com.allegro.webapi.DoGetSessionHandleForWidgetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSessionHandleForWidgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSessionHandleForWidgetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest"), com.allegro.webapi.DoGetShipmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetShipmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentDataForRelatedItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataForRelatedItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest"), com.allegro.webapi.DoGetShipmentDataForRelatedItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetShipmentDataForRelatedItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataForRelatedItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentPriceTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest"), com.allegro.webapi.DoGetShipmentPriceTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetShipmentPriceTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentPriceTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopsTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShopsTagsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopsTagsRequest"), com.allegro.webapi.DoGetShopsTagsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetShopsTagsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShopsTagsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest"), com.allegro.webapi.DoGetSiteJournalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSiteJournalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest"), com.allegro.webapi.DoGetSiteJournalDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSiteJournalDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest"), com.allegro.webapi.DoGetSiteJournalDealsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSiteJournalDealsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest"), com.allegro.webapi.DoGetSiteJournalInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSiteJournalInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetStatesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest"), com.allegro.webapi.DoGetStatesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetStatesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetStatesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSystemTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest"), com.allegro.webapi.DoGetSystemTimeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetSystemTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSystemTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetTransactionsIDsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"), com.allegro.webapi.DoGetTransactionsIDsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetTransactionsIDsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetTransactionsIDsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest"), com.allegro.webapi.DoGetUserIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetUserIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest"), com.allegro.webapi.DoGetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest"), com.allegro.webapi.DoGetUserLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetUserLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest"), com.allegro.webapi.DoGetWaitingFeedbacksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetWaitingFeedbacksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetWaitingFeedbacksCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest"), com.allegro.webapi.DoGetWaitingFeedbacksCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse"));
        oper.setReturnClass(com.allegro.webapi.DoGetWaitingFeedbacksCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetWaitingFeedbacksCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest"), com.allegro.webapi.DoLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse"));
        oper.setReturnClass(com.allegro.webapi.DoLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginEncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest"), com.allegro.webapi.DoLoginEncRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse"));
        oper.setReturnClass(com.allegro.webapi.DoLoginEncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginEncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginWithAccessTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest"), com.allegro.webapi.DoLoginWithAccessTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse"));
        oper.setReturnClass(com.allegro.webapi.DoLoginWithAccessTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginWithAccessTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccount2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request"), com.allegro.webapi.DoMyAccount2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response"));
        oper.setReturnClass(com.allegro.webapi.DoMyAccount2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccount2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccountItemsCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest"), com.allegro.webapi.DoMyAccountItemsCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse"));
        oper.setReturnClass(com.allegro.webapi.DoMyAccountItemsCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccountItemsCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest"), com.allegro.webapi.DoMyBillingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse"));
        oper.setReturnClass(com.allegro.webapi.DoMyBillingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest"), com.allegro.webapi.DoMyBillingItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoMyBillingItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyContactRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest"), com.allegro.webapi.DoMyContactRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse"));
        oper.setReturnClass(com.allegro.webapi.DoMyContactResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyContactResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request"), com.allegro.webapi.DoMyFeedback2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response"));
        oper.setReturnClass(com.allegro.webapi.DoMyFeedback2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyFeedback2LimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest"), com.allegro.webapi.DoMyFeedback2LimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse"));
        oper.setReturnClass(com.allegro.webapi.DoMyFeedback2LimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyFeedback2LimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest"), com.allegro.webapi.DoNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse"));
        oper.setReturnClass(com.allegro.webapi.DoNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQueryAllSysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest"), com.allegro.webapi.DoQueryAllSysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse"));
        oper.setReturnClass(com.allegro.webapi.DoQueryAllSysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQueryAllSysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQuerySysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest"), com.allegro.webapi.DoQuerySysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse"));
        oper.setReturnClass(com.allegro.webapi.DoQuerySysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQuerySysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest"), com.allegro.webapi.DoRemoveFromBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse"));
        oper.setReturnClass(com.allegro.webapi.DoRemoveFromBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveItemTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveItemTemplatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest"), com.allegro.webapi.DoRemoveItemTemplatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse"));
        oper.setReturnClass(com.allegro.webapi.DoRemoveItemTemplatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveItemTemplatesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestCancelBidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest"), com.allegro.webapi.DoRequestCancelBidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse"));
        oper.setReturnClass(com.allegro.webapi.DoRequestCancelBidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestCancelBidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestPayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest"), com.allegro.webapi.DoRequestPayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse"));
        oper.setReturnClass(com.allegro.webapi.DoRequestPayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestPayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestSurchargeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest"), com.allegro.webapi.DoRequestSurchargeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse"));
        oper.setReturnClass(com.allegro.webapi.DoRequestSurchargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestSurchargeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest"), com.allegro.webapi.DoSellSomeAgainRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSellSomeAgainResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainInShopRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest"), com.allegro.webapi.DoSellSomeAgainInShopRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSellSomeAgainInShopResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainInShopResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendEmailToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest"), com.allegro.webapi.DoSendEmailToUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSendEmailToUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendEmailToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest"), com.allegro.webapi.DoSendPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSendPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest"), com.allegro.webapi.DoSendRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSendRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest"), com.allegro.webapi.DoSetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest"), com.allegro.webapi.DoSetShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSetShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetUserLicenceDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest"), com.allegro.webapi.DoSetUserLicenceDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse"));
        oper.setReturnClass(com.allegro.webapi.DoSetUserLicenceDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetUserLicenceDateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowItemInfoExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest"), com.allegro.webapi.DoShowItemInfoExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        oper.setReturnClass(com.allegro.webapi.DoShowItemInfoExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowItemInfoExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest"), com.allegro.webapi.DoShowUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse"));
        oper.setReturnClass(com.allegro.webapi.DoShowUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoVerifyItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest"), com.allegro.webapi.DoVerifyItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse"));
        oper.setReturnClass(com.allegro.webapi.DoVerifyItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doVerifyItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

    }

    public ServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddDescToItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoAddDescToItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddDescToItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoAddDescToItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoAddPackageInfoToPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoAddPackageInfoToPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoAddToBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoAddToBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelBidItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelBidItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundWarningRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelRefundWarningRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundWarningResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelRefundWarningResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCancelTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoChangeItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoChangeItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoChangePriceItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoChangePriceItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoChangeQuantityItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoChangeQuantityItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCheckItemDescriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCheckItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCheckNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCheckNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCreateItemTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCreateItemTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCreateItemTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoCreateItemTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackManyRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFeedbackManyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackManyResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFeedbackManyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFinishItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFinishItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFinishItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoFinishItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetAdminUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetAdminUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetAdminUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetAdminUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetArchiveRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetArchiveRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetArchiveRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetArchiveRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetBidItem2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetBidItem2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetBlackListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetBlackListUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCategoryPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCategoryPathResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCatsDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCatsDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCatsDataLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCatsDataLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCountriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetCountriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteCategoriesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFavouriteCategoriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFavouriteCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFavouriteSellersRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFavouriteSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFavouriteSellersResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFavouriteSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFeedbackRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFeedbackRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFeedbackResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFeedbackResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFilledPostBuyFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFilledPostBuyFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsImagesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemsImagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsImagesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemsImagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMessageToBuyerRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMessageToBuyerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMessageToBuyerResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMessageToBuyerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyAddressesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyAddressesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyBidItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyBidItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyFutureItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyFutureItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyIncomingPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyIncomingPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyIncomingPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyIncomingPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyNotSoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyNotSoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyNotWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyNotWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPaymentsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPaymentsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPayoutsDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPayoutsDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPayoutsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyPayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMySellItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMySellItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellRatingRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMySellRatingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellRatingResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMySellRatingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMySoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMySoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetMyWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentDataRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPaymentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentDataResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPaymentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPaymentMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPaymentMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyFormsDataForBuyersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyFormsDataForBuyersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyFormsDataForSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyFormsDataForSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyFormsIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyFormsIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyItemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetPostBuyItemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRefundsDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRefundsDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRefundsReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRefundsReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormAttribsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormAttribsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormAttribsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormAttribsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsExtLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsExtLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsExtRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsExtResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsForCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsForCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellFormFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellRatingReasonsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellRatingReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellRatingReasonsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSellRatingReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSessionHandleForWidgetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSessionHandleForWidgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataForRelatedItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShipmentDataForRelatedItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataForRelatedItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShipmentDataForRelatedItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShipmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShipmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShipmentPriceTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShipmentPriceTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShopsTagsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShopsTagsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShopsTagsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetShopsTagsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalDealsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalDealsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSiteJournalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetStatesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetStatesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSystemTimeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetSystemTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetTransactionsIDsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetTransactionsIDsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetUserIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetUserIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetUserLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetUserLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksCountRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetWaitingFeedbacksCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksCountResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetWaitingFeedbacksCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetWaitingFeedbacksRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetWaitingFeedbacksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetWaitingFeedbacksResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoGetWaitingFeedbacksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoLoginEncRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoLoginEncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoLoginWithAccessTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoLoginWithAccessTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyAccount2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyAccount2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyAccountItemsCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyAccountItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyBillingItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyBillingItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyBillingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyBillingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyContactRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyContactRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyContactResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyContactResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2LimitRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyFeedback2LimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2LimitResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyFeedback2LimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyFeedback2Request");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyFeedback2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyFeedback2Response");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoMyFeedback2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoQueryAllSysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoQueryAllSysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoQuerySysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoQuerySysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRemoveFromBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRemoveFromBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveItemTemplatesRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRemoveItemTemplatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveItemTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRemoveItemTemplatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestCancelBidRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRequestCancelBidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestCancelBidResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRequestCancelBidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRequestPayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRequestPayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestSurchargeRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRequestSurchargeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestSurchargeResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoRequestSurchargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSellSomeAgainInShopRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSellSomeAgainInShopResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSellSomeAgainRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSellSomeAgainResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSendEmailToUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSendEmailToUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSendPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSendPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSendRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSendRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSetShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSetShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetUserLicenceDateRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSetUserLicenceDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetUserLicenceDateResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoSetUserLicenceDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoShowItemInfoExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoShowItemInfoExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoShowUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoShowUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoVerifyItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DoVerifyItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ActionDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ActionDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.AddressInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AddressUserDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.AddressUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.AdvertInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArchiveRefundsListTypeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArchiveRefundsListTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfActiondatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfActiondatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAddressinfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfAddressinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfArchiverefundslisttypestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfArchiverefundslisttypestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAttribstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfAttribstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBiditemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfBiditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBidliststruct2");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfBidliststruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBillingdatatype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfBillingdatatype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlacklistresstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfBlacklistresstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlackliststruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfBlackliststruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorydata");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfCategorydata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorypathtype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfCategorypathtype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorytreetype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfCategorytreetype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCatinfotype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfCatinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCountryinfotype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfCountryinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfDealsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfDealsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritescategoriesstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFavouritescategoriesstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFavouritessellersstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFavouritessellersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbacklist");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFeedbacklist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackmanystruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFeedbackmanystruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFeedbackresultstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFeedbackresultstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFieldsvalue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFilteroptionstype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFilterslisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFiltervaluetype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFiltervaluetype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishfailurestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFinishfailurestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishitemsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFinishitemsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFutureitemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfFutureitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItembilling");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItembilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemcatlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemgetimage");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemgetimage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemimagelist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagesstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemimagesstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfIteminfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfIteminfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItempostbuydatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempricestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItempricestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemslisttype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemslisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsurchargestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemsurchargestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemtemplateliststruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemtemplateliststruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantattributestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemvariantattributestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemvariantstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfItemvariantstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfLong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyaccountstruct2");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfMyaccountstruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMycontactlist");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfMycontactlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyfeedbackliststruct2");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfMyfeedbackliststruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNewpostbuyformsellerstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfNewpostbuyformsellerstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotsolditemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfNotsolditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotwonitemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfNotwonitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPackageinfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPackageinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfParameterinfotype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfParameterinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentdetailsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPaymentdetailsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentitemsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPaymentitemsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentmethodstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPaymentmethodstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentsellersstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPaymentsellersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPayoutpaymentsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPayoutpaymentsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPayoutrefundfromstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPayoutrefundfromstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPayoutrefundtostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPayoutrefundtostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPhotoinfotype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPhotoinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostagestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostagestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformdatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyformdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformforbuyersdatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyformforbuyersdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemdealsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyformitemdealsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyformitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformsellersstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyformsellersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformshipmenttrackingstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyformshipmenttrackingstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyiteminfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPostbuyiteminfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPriceinfotype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfPriceinfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersgroupstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfProductparametersgroupstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfProductparametersstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfReasoninfotype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfReasoninfotype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundlisttype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfRefundlisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundsdealslisttype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfRefundsdealslisttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRelateditemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfRelateditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellershipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellershipmentdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellformtype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellformtype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellitemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragepermonthstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingaveragepermonthstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingaveragestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingdetailstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingdetailstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingestimationstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingestimationstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratinginfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratinginfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingreasonstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingreasonsumstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingreasonsumstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingstatsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSellratingstatsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfShipmentdatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpaymentinfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfShipmentpaymentinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpricetypestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfShipmentpricetypestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShopstagtypestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfShopstagtypestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournal");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSitejournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournaldealsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSitejournaldealsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSolditemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSolditemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStateinfostruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfStateinfostruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellagain");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfStructsellagain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellfailed");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfStructsellfailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSysstatustype");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfSysstatustype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfTagnamestruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfTagnamestruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblacklistaddresultstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserblacklistaddresultstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblackliststruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserblackliststruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserincomingpaymentrefundsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserincomingpaymentstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserpaymentrefundsstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserpaymentstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpayoutstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserpayoutstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfUserpostbuydatastruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantquantitystruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfVariantquantitystruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfVariantstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWaitfeedbackstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfWaitfeedbackstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWonitemstruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ArrayOfWonitemstruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BillingDataType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.BillingDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CategoriesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CategoryPathType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CategoryTreeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CreatedItemTemplateStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.CreatedItemTemplateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.DurationInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesCategoriesStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FavouritesCategoriesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FavouritesSellersStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FavouritesSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackList");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FeedbackList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackManyStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FeedbackManyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FeedbackResultStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FeedbackResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.InvoiceInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemGetImage");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemGetImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImagesStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemImagesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateListStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemTemplateListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantAttributeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemVariantAttributeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemVariantStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ItemVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MessageToBuyerStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.MessageToBuyerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyContactList");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.MyContactList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyFeedbackListStruct2");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.MyFeedbackListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormCommonStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.NewPostBuyFormCommonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NewPostBuyFormSellerStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.NewPostBuyFormSellerStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ParameterInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutPaymentsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PayoutPaymentsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundFromStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PayoutRefundFromStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundToStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PayoutRefundToStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PhotoInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormItemDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsVariantStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormItemDealsVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyFormStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.PriceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ReasonInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundDetailsType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RefundDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RefundListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RefundsDealsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RelatedItemsShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RelatedItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RelatedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RemovedItemTemplatesStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RemovedItemTemplatesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellerPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellerShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAveragePerMonthStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingAveragePerMonthStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingDetailStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingDetailStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingEstimationStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingEstimationStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingReasonStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingReasonSumStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingReasonSumStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingStatsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SellRatingStatsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPaymentInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ShipmentPaymentInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShopsTagTypeStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ShopsTagTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SortOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.TagNameStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TransactionPayByLinkStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.TransactionPayByLinkStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.VariantQuantityStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.VariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WaitFeedbackStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.WaitFeedbackStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = com.allegro.webapi.WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.allegro.webapi.DoAddDescToItemsResponse doAddDescToItems(com.allegro.webapi.DoAddDescToItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddDescToItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoAddDescToItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoAddDescToItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoAddDescToItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(com.allegro.webapi.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddPackageInfoToPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoAddPackageInfoToPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoAddPackageInfoToPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoAddPackageInfoToPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoAddToBlackListResponse doAddToBlackList(com.allegro.webapi.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoAddToBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoAddToBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoAddToBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoBidItemResponse doBidItem(com.allegro.webapi.DoBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCancelBidItemResponse doCancelBidItem(com.allegro.webapi.DoCancelBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCancelBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCancelBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCancelBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCancelRefundFormResponse doCancelRefundForm(com.allegro.webapi.DoCancelRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCancelRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCancelRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCancelRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCancelRefundWarningResponse doCancelRefundWarning(com.allegro.webapi.DoCancelRefundWarningRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundWarning");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundWarning"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCancelRefundWarningResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCancelRefundWarningResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCancelRefundWarningResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCancelTransactionResponse doCancelTransaction(com.allegro.webapi.DoCancelTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCancelTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCancelTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCancelTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoChangeItemFieldsResponse doChangeItemFields(com.allegro.webapi.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoChangeItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoChangeItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoChangeItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoChangePriceItemResponse doChangePriceItem(com.allegro.webapi.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangePriceItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoChangePriceItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoChangePriceItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoChangePriceItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoChangeQuantityItemResponse doChangeQuantityItem(com.allegro.webapi.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoChangeQuantityItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoChangeQuantityItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoChangeQuantityItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCheckItemDescriptionResponse doCheckItemDescription(com.allegro.webapi.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckItemDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCheckItemDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCheckItemDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCheckItemDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(com.allegro.webapi.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCheckNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCheckNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCheckNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoCreateItemTemplateResponse doCreateItemTemplate(com.allegro.webapi.DoCreateItemTemplateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCreateItemTemplate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCreateItemTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoCreateItemTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoCreateItemTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoCreateItemTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoFeedbackResponse doFeedback(com.allegro.webapi.DoFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoFeedbackManyResponse doFeedbackMany(com.allegro.webapi.DoFeedbackManyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFeedbackMany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoFeedbackManyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoFeedbackManyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoFeedbackManyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoFinishItemResponse doFinishItem(com.allegro.webapi.DoFinishItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoFinishItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoFinishItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoFinishItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoFinishItemsResponse doFinishItems(com.allegro.webapi.DoFinishItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoFinishItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoFinishItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoFinishItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetAdminUserLicenceDateResponse doGetAdminUserLicenceDate(com.allegro.webapi.DoGetAdminUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetAdminUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetAdminUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetAdminUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetAdminUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetArchiveRefundsListResponse doGetArchiveRefundsList(com.allegro.webapi.DoGetArchiveRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetArchiveRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetArchiveRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetArchiveRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetArchiveRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetArchiveRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetBidItem2Response doGetBidItem2(com.allegro.webapi.DoGetBidItem2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBidItem2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetBidItem2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetBidItem2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetBidItem2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetBlackListUsersResponse doGetBlackListUsers(com.allegro.webapi.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBlackListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetBlackListUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetBlackListUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetBlackListUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetCategoryPathResponse doGetCategoryPath(com.allegro.webapi.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCategoryPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetCategoryPathResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetCategoryPathResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetCategoryPathResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetCatsDataResponse doGetCatsData(com.allegro.webapi.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetCatsDataCountResponse doGetCatsDataCount(com.allegro.webapi.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetCatsDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetCatsDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetCatsDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetCatsDataLimitResponse doGetCatsDataLimit(com.allegro.webapi.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetCatsDataLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetCatsDataLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetCatsDataLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetCountriesResponse doGetCountries(com.allegro.webapi.DoGetCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetCountriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetCountriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetDealsResponse doGetDeals(com.allegro.webapi.DoGetDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetFavouriteCategoriesResponse doGetFavouriteCategories(com.allegro.webapi.DoGetFavouriteCategoriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetFavouriteCategoriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetFavouriteCategoriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetFavouriteCategoriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetFavouriteSellersResponse doGetFavouriteSellers(com.allegro.webapi.DoGetFavouriteSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFavouriteSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetFavouriteSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetFavouriteSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetFavouriteSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetFeedbackResponse doGetFeedback(com.allegro.webapi.DoGetFeedbackRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFeedback");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetFeedbackResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetFeedbackResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetFeedbackResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(com.allegro.webapi.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFilledPostBuyForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetFilledPostBuyFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetFilledPostBuyFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetFilledPostBuyFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetFreeDeliveryAmountResponse doGetFreeDeliveryAmount(com.allegro.webapi.DoGetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetItemFieldsResponse doGetItemFields(com.allegro.webapi.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetItemTemplatesResponse doGetItemTemplates(com.allegro.webapi.DoGetItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetItemsImagesResponse doGetItemsImages(com.allegro.webapi.DoGetItemsImagesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsImages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetItemsImagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetItemsImagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetItemsImagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetItemsInfoResponse doGetItemsInfo(com.allegro.webapi.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetItemsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetItemsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetItemsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetItemsListResponse doGetItemsList(com.allegro.webapi.DoGetItemsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetItemsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetItemsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetItemsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMessageToBuyerResponse doGetMessageToBuyer(com.allegro.webapi.DoGetMessageToBuyerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMessageToBuyer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMessageToBuyer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMessageToBuyerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMessageToBuyerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMessageToBuyerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyAddressesResponse doGetMyAddresses(com.allegro.webapi.DoGetMyAddressesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyAddresses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyBidItemsResponse doGetMyBidItems(com.allegro.webapi.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyBidItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyBidItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyBidItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyBidItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyCurrentShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyCurrentShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyDataResponse doGetMyData(com.allegro.webapi.DoGetMyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyFutureItemsResponse doGetMyFutureItems(com.allegro.webapi.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyFutureItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyFutureItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyFutureItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyFutureItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(com.allegro.webapi.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyIncomingPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyIncomingPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyIncomingPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(com.allegro.webapi.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyIncomingPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyIncomingPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyIncomingPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(com.allegro.webapi.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotSoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyNotSoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyNotSoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyNotSoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyNotWonItemsResponse doGetMyNotWonItems(com.allegro.webapi.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyNotWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyNotWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyNotWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyPaymentsResponse doGetMyPayments(com.allegro.webapi.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(com.allegro.webapi.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyPaymentsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyPaymentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyPaymentsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyPaymentsRefundsResponse doGetMyPaymentsRefunds(com.allegro.webapi.DoGetMyPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyPayoutsResponse doGetMyPayouts(com.allegro.webapi.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyPayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyPayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyPayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyPayoutsDetailsResponse doGetMyPayoutsDetails(com.allegro.webapi.DoGetMyPayoutsDetailsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayoutsDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayoutsDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyPayoutsDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyPayoutsDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyPayoutsDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMySellItemsResponse doGetMySellItems(com.allegro.webapi.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMySellItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMySellItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMySellItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMySellRatingResponse doGetMySellRating(com.allegro.webapi.DoGetMySellRatingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellRating");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMySellRatingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMySellRatingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMySellRatingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMySoldItemsResponse doGetMySoldItems(com.allegro.webapi.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMySoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMySoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMySoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetMyWonItemsResponse doGetMyWonItems(com.allegro.webapi.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetMyWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetMyWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetMyWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPaymentDataResponse doGetPaymentData(com.allegro.webapi.DoGetPaymentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPaymentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPaymentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPaymentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPaymentMethodsResponse doGetPaymentMethods(com.allegro.webapi.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPaymentMethodsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPaymentMethodsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPaymentMethodsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPostBuyDataResponse doGetPostBuyData(com.allegro.webapi.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPostBuyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPostBuyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPostBuyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(com.allegro.webapi.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForBuyers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPostBuyFormsDataForBuyersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPostBuyFormsDataForBuyersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPostBuyFormsDataForBuyersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(com.allegro.webapi.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPostBuyFormsDataForSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPostBuyFormsDataForSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPostBuyFormsDataForSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(com.allegro.webapi.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPostBuyFormsIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPostBuyFormsIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPostBuyFormsIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(com.allegro.webapi.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyItemInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetPostBuyItemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetPostBuyItemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetPostBuyItemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetRefundsDealsResponse doGetRefundsDeals(com.allegro.webapi.DoGetRefundsDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetRefundsDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetRefundsDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetRefundsDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetRefundsListResponse doGetRefundsList(com.allegro.webapi.DoGetRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetRefundsReasonsResponse doGetRefundsReasons(com.allegro.webapi.DoGetRefundsReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetRefundsReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetRefundsReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetRefundsReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetRelatedItemsResponse doGetRelatedItems(com.allegro.webapi.DoGetRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellFormAttribsResponse doGetSellFormAttribs(com.allegro.webapi.DoGetSellFormAttribsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormAttribs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellFormAttribsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellFormAttribsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellFormAttribsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellFormFieldsResponse doGetSellFormFields(com.allegro.webapi.DoGetSellFormFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellFormFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellFormFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellFormFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellFormFieldsExtResponse doGetSellFormFieldsExt(com.allegro.webapi.DoGetSellFormFieldsExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellFormFieldsExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellFormFieldsExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellFormFieldsExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellFormFieldsExtLimitResponse doGetSellFormFieldsExtLimit(com.allegro.webapi.DoGetSellFormFieldsExtLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsExtLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellFormFieldsExtLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellFormFieldsExtLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellFormFieldsExtLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(com.allegro.webapi.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsForCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellFormFieldsForCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellFormFieldsForCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellFormFieldsForCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellFormFieldsLimitResponse doGetSellFormFieldsLimit(com.allegro.webapi.DoGetSellFormFieldsLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellFormFieldsLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellFormFieldsLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellFormFieldsLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSellRatingReasonsResponse doGetSellRatingReasons(com.allegro.webapi.DoGetSellRatingReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellRatingReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSellRatingReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSellRatingReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSellRatingReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSessionHandleForWidgetResponse doGetSessionHandleForWidget(com.allegro.webapi.DoGetSessionHandleForWidgetRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSessionHandleForWidget");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSessionHandleForWidgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSessionHandleForWidgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSessionHandleForWidgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetShipmentDataResponse doGetShipmentData(com.allegro.webapi.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetShipmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetShipmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetShipmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetShipmentDataForRelatedItemsResponse doGetShipmentDataForRelatedItems(com.allegro.webapi.DoGetShipmentDataForRelatedItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentDataForRelatedItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentDataForRelatedItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetShipmentDataForRelatedItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetShipmentDataForRelatedItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetShipmentDataForRelatedItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(com.allegro.webapi.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentPriceTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetShipmentPriceTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetShipmentPriceTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetShipmentPriceTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetShopsTagsResponse doGetShopsTags(com.allegro.webapi.DoGetShopsTagsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShopsTags");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShopsTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetShopsTagsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetShopsTagsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetShopsTagsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSiteJournalResponse doGetSiteJournal(com.allegro.webapi.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSiteJournalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSiteJournalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSiteJournalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(com.allegro.webapi.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSiteJournalDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSiteJournalDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSiteJournalDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(com.allegro.webapi.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDealsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSiteJournalDealsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSiteJournalDealsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSiteJournalDealsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(com.allegro.webapi.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSiteJournalInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSiteJournalInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSiteJournalInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetStatesInfoResponse doGetStatesInfo(com.allegro.webapi.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetStatesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetStatesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetStatesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetStatesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetSystemTimeResponse doGetSystemTime(com.allegro.webapi.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSystemTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetSystemTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetSystemTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetSystemTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetTransactionsIDsResponse doGetTransactionsIDs(com.allegro.webapi.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetTransactionsIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetTransactionsIDsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetTransactionsIDsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetTransactionsIDsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetUserIDResponse doGetUserID(com.allegro.webapi.DoGetUserIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetUserIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetUserIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetUserIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetUserLicenceDateResponse doGetUserLicenceDate(com.allegro.webapi.DoGetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetUserLoginResponse doGetUserLogin(com.allegro.webapi.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetUserLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetUserLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetUserLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetWaitingFeedbacksResponse doGetWaitingFeedbacks(com.allegro.webapi.DoGetWaitingFeedbacksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetWaitingFeedbacksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetWaitingFeedbacksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetWaitingFeedbacksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoGetWaitingFeedbacksCountResponse doGetWaitingFeedbacksCount(com.allegro.webapi.DoGetWaitingFeedbacksCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetWaitingFeedbacksCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoGetWaitingFeedbacksCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoGetWaitingFeedbacksCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoGetWaitingFeedbacksCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoLoginResponse doLogin(com.allegro.webapi.DoLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoLoginEncResponse doLoginEnc(com.allegro.webapi.DoLoginEncRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginEnc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoLoginEncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoLoginEncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoLoginEncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoLoginWithAccessTokenResponse doLoginWithAccessToken(com.allegro.webapi.DoLoginWithAccessTokenRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginWithAccessToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoLoginWithAccessTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoLoginWithAccessTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoLoginWithAccessTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyAccount2Response doMyAccount2(com.allegro.webapi.DoMyAccount2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccount2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyAccount2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyAccount2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyAccount2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyAccountItemsCountResponse doMyAccountItemsCount(com.allegro.webapi.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccountItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyAccountItemsCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyAccountItemsCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyAccountItemsCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyBillingResponse doMyBilling(com.allegro.webapi.DoMyBillingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyBillingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyBillingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyBillingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyBillingItemResponse doMyBillingItem(com.allegro.webapi.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBillingItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyBillingItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyBillingItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyBillingItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyContactResponse doMyContact(com.allegro.webapi.DoMyContactRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyContactResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyContactResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyContactResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyFeedback2Response doMyFeedback2(com.allegro.webapi.DoMyFeedback2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyFeedback2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyFeedback2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyFeedback2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoMyFeedback2LimitResponse doMyFeedback2Limit(com.allegro.webapi.DoMyFeedback2LimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyFeedback2Limit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoMyFeedback2LimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoMyFeedback2LimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoMyFeedback2LimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoNewAuctionExtResponse doNewAuctionExt(com.allegro.webapi.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoQueryAllSysStatusResponse doQueryAllSysStatus(com.allegro.webapi.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQueryAllSysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoQueryAllSysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoQueryAllSysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoQueryAllSysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoQuerySysStatusResponse doQuerySysStatus(com.allegro.webapi.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQuerySysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoQuerySysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoQuerySysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoQuerySysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoRemoveFromBlackListResponse doRemoveFromBlackList(com.allegro.webapi.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoRemoveFromBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoRemoveFromBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoRemoveFromBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoRemoveItemTemplatesResponse doRemoveItemTemplates(com.allegro.webapi.DoRemoveItemTemplatesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveItemTemplates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveItemTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoRemoveItemTemplatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoRemoveItemTemplatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoRemoveItemTemplatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoRequestCancelBidResponse doRequestCancelBid(com.allegro.webapi.DoRequestCancelBidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestCancelBid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoRequestCancelBidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoRequestCancelBidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoRequestCancelBidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoRequestPayoutResponse doRequestPayout(com.allegro.webapi.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestPayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoRequestPayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoRequestPayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoRequestPayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoRequestSurchargeResponse doRequestSurcharge(com.allegro.webapi.DoRequestSurchargeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestSurcharge");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoRequestSurchargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoRequestSurchargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoRequestSurchargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSellSomeAgainResponse doSellSomeAgain(com.allegro.webapi.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSellSomeAgainResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSellSomeAgainResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSellSomeAgainResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(com.allegro.webapi.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgainInShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSellSomeAgainInShopResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSellSomeAgainInShopResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSellSomeAgainInShopResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSendEmailToUserResponse doSendEmailToUser(com.allegro.webapi.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendEmailToUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSendEmailToUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSendEmailToUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSendEmailToUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSendPostBuyFormResponse doSendPostBuyForm(com.allegro.webapi.DoSendPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSendPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSendPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSendPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSendRefundFormResponse doSendRefundForm(com.allegro.webapi.DoSendRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSendRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSendRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSendRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSetFreeDeliveryAmountResponse doSetFreeDeliveryAmount(com.allegro.webapi.DoSetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(com.allegro.webapi.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSetShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSetShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSetShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoSetUserLicenceDateResponse doSetUserLicenceDate(com.allegro.webapi.DoSetUserLicenceDateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetUserLicenceDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoSetUserLicenceDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoSetUserLicenceDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoSetUserLicenceDateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoShowItemInfoExtResponse doShowItemInfoExt(com.allegro.webapi.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowItemInfoExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoShowItemInfoExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoShowItemInfoExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoShowItemInfoExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoShowUserResponse doShowUser(com.allegro.webapi.DoShowUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoShowUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoShowUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoShowUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.allegro.webapi.DoVerifyItemResponse doVerifyItem(com.allegro.webapi.DoVerifyItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doVerifyItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.allegro.webapi.DoVerifyItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.allegro.webapi.DoVerifyItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.allegro.webapi.DoVerifyItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
