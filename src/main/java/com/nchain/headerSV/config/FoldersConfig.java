package com.nchain.headerSV.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author m.jose@nchain.com
 * Copyright (c) 2009-2010 Satoshi Nakamoto
 * Copyright (c) 2009-2016 The Bitcoin Core developers
 * Copyright (c) 2018-2020 Bitcoin Association
 * Distributed under the Open BSV software license, see the accompanying file LICENSE.
 * @date 05/06/2020
 */
@Component
@ConfigurationProperties(prefix = "bna.listener-app.listener.p2p.folders")
@Getter
@Setter
public class FoldersConfig {
    String data;
    String config;
}
