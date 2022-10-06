package com.arkea.aicbackoffice.shared.commons.mapper;

import com.arkea.aicbackoffice.shared.service.bean.client.ContratBean;

import com.arkea.aicservice.thrift.data.Contrat;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2022-05-16T09:05:53+0200",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_102 (Oracle Corporation)"

)

public class ContratMapperImpl implements ContratMapper {

    @Override

    public ContratBean alimenter(Contrat req) {

        if ( req == null ) {

            return null;
        }

        ContratBean contratBean = new ContratBean();

        contratBean.setDateSouscription( req.getDateSouscription() );

        contratBean.setDistributeur( map( req.getDistributeur() ) );

        contratBean.setEtat( req.getEtat() );

        contratBean.setMontant( req.getMontant() );

        contratBean.setNombreParts( req.getNombreParts() );

        contratBean.setNumeroContrat( String.valueOf( req.getNumeroContrat() ) );

        contratBean.setNumeroContratExterne( req.getNumeroContratExterne() );

        contratBean.setProprietePart( req.getProprietePart() );

        contratBean.setScpi( map( req.getScpi() ) );

        contratBean.setSouscripteur( map( req.getSouscripteur() ) );

        return contratBean;
    }

    @Override

    public Contrat alimenter(ContratBean req) {

        if ( req == null ) {

            return null;
        }

        Contrat contrat = new Contrat();

        contrat.setDateSouscription( req.getDateSouscription() );

        contrat.setDistributeur( map( req.getDistributeur() ) );

        contrat.setSouscripteur( map( req.getSouscripteur() ) );

        contrat.setScpi( map( req.getScpi() ) );

        contrat.setEtat( req.getEtat() );

        contrat.setMontant( req.getMontant() );

        if ( req.getNumeroContrat() != null ) {

            contrat.setNumeroContrat( Long.parseLong( req.getNumeroContrat() ) );
        }

        contrat.setNumeroContratExterne( req.getNumeroContratExterne() );

        contrat.setNombreParts( req.getNombreParts() );

        contrat.setProprietePart( req.getProprietePart() );

        return contrat;
    }
}

