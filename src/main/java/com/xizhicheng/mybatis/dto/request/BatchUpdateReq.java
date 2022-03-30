package com.xizhicheng.mybatis.dto.request;

import java.util.List;

public class BatchUpdateReq {
    private List<BatchUpdateRequset> batchUpdateRequsetList;

    public List<BatchUpdateRequset> getBatchUpdateRequsetList() {
        return batchUpdateRequsetList;
    }

    public void setBatchUpdateRequsetList(List<BatchUpdateRequset> batchUpdateRequsetList) {
        this.batchUpdateRequsetList = batchUpdateRequsetList;
    }
}
