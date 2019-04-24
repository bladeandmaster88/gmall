package com.lee.gmall.service;

import com.lee.gmall.bean.BaseAttrInfo;
import com.lee.gmall.bean.BaseAttrValue;

import java.util.List;

public interface AttrService {

    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);

    List<BaseAttrValue> getAttrValue(String attrName);

    void deleteAttr(String attrId);
}
