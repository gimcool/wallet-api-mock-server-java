// Copyright (c) 2019-2022 The Gim.Cool developers
// All Rights Reserved.
// NOTICE: All information contained herein is, and remains
// the property of Gim.Cool and its suppliers,
// if any. The intellectual and technical concepts contained
// herein are proprietary to Gim.Cool
// Dissemination of this information or reproduction of this materia
// is strictly forbidden unless prior written permission is obtained
// from Gim.Cool.

package com.gimcool.sofa.mock.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apitoken")
public class ApiToken {

    @Id
    private Long id;

    private String apiCode;

    private String apiSecret;

    public ApiToken() {

    }

    public ApiToken(long id, String apiCode, String apiSecret) {
        this.id = id;
        this.apiCode = apiCode;
        this.apiSecret = apiSecret;
    }

    @Override
    public String toString() {
        return String.format("ApiToken[%d,%s,%s]", id, apiCode, apiSecret);
    }

    public String getApiCode() {
        return apiCode;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public Long getWalletId() {
        return id;
    }
}