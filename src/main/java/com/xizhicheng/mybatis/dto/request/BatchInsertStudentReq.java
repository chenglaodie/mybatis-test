package com.xizhicheng.mybatis.dto.request;

import java.util.List;

public class BatchInsertStudentReq {
    private List<BatchInsertStudentRequset> batchInsertStudentRequsetList;

    public List<BatchInsertStudentRequset> getBatchInsertStudentRequsetList() {
        return batchInsertStudentRequsetList;
    }

    public void setBatchInsertStudentRequsetList(List<BatchInsertStudentRequset> batchInsertStudentRequsetList) {
        this.batchInsertStudentRequsetList = batchInsertStudentRequsetList;
    }
}
