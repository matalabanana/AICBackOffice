package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.ResponseContextBean;

import com.arkea.aicbackoffice.shared.service.bean.client.ResponseTypeBean;

import com.arkea.commons.thrift.thrift.data.ResponseContext;

import java.util.List;

import java.util.Map;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class ResponseContextMapperImpl implements ResponseContextMapper {

    @Override

    public ResponseContextBean alimenter(ResponseContext resp) {

        if ( resp == null ) {

            return null;
        }

        ResponseContextBean responseContextBean = new ResponseContextBean();

        Map<ResponseTypeBean, List<String>> map = map( resp.getMessages() );

        if ( map != null ) {

            responseContextBean.setMessages( map );
        }

        responseContextBean.setResponseTime( resp.getResponseTime() );

        responseContextBean.setFishTag( resp.getFishTag() );

        return responseContextBean;
    }
}

