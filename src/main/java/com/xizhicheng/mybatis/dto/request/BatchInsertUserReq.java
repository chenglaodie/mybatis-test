package com.xizhicheng.mybatis.dto.request;

import java.util.List;

public class BatchInsertUserReq {

    private List<BatchInsertUserRequest> batchInsertUserRequestList;

    public List<BatchInsertUserRequest> getBatchInsertUserRequestList() {
        return batchInsertUserRequestList;
    }

    public void setBatchInsertUserRequestList(List<BatchInsertUserRequest> batchInsertUserRequestList) {
        this.batchInsertUserRequestList = batchInsertUserRequestList;
    }
}
