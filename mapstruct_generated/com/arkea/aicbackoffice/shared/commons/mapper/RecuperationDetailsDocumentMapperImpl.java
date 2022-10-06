package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.RecuperationDetailDocumentRequestBean;

import com.arkea.aicbackoffice.shared.service.bean.RecuperationDetailDocumentResponseBean;

import com.arkea.aicservice.thrift.data.RecuperationDetailDocumentRequest;

import com.arkea.aicservice.thrift.data.RecuperationDetailDocumentResponse;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class RecuperationDetailsDocumentMapperImpl implements RecuperationDetailsDocumentMapper {

    @Override

    public RecuperationDetailDocumentRequest alimenter(RecuperationDetailDocumentRequestBean req) {

        if ( req == null ) {

            return null;
        }

        RecuperationDetailDocumentRequest recuperationDetailDocumentRequest = new RecuperationDetailDocumentRequest();

        recuperationDetailDocumentRequest.setContrat( map( req.getContrat() ) );

        if ( req.getNumeroDocument() != null ) {

            recuperationDetailDocumentRequest.setNumeroDocument( String.valueOf( req.getNumeroDocument() ) );
        }

        return recuperationDetailDocumentRequest;
    }

    @Override

    public RecuperationDetailDocumentResponseBean alimenter(RecuperationDetailDocumentResponse req) {

        if ( req == null ) {

            return null;
        }

        RecuperationDetailDocumentResponseBean recuperationDetailDocumentResponseBean = new RecuperationDetailDocumentResponseBean();

        recuperationDetailDocumentResponseBean.setContext( map( req.getContext() ) );

        recuperationDetailDocumentResponseBean.setDetails( map( req.getDetails() ) );

        return recuperationDetailDocumentResponseBean;
    }
}

