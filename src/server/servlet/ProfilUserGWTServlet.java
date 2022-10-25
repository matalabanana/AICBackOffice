
package com.arkea.aicbackoffice.server.servlet;

import java.util.HashMap;

import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arkea.aicbackoffice.server.commons.bean.UserSession;
import com.arkea.aicbackoffice.shared.commons.Constantes;
import com.arkea.aicbackoffice.shared.commons.HabilitationUtils;
import com.arkea.aicbackoffice.shared.service.ProfilUserService;
import com.arkea.aicbackoffice.shared.service.bean.ProfilUserRequestBean;
import com.arkea.aicbackoffice.shared.service.bean.ProfilUserResponseBean;
import com.arkea.commons.ihm.client.ihmevent.model.ProfilSalarieBean;
import com.arkea.commons.ihm.shared.model.ApplicationException;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import net.gicm.methode.clientgestioncontexte.bo.ContexteSalarieBean;
import net.gicm.methode.clientgestioncontexte.bo.HabilitationBean;
import net.gicm.methode.clientgestioncontexte.bo.MapHabilitationBean;
import net.gicm.methode.clientgestioncontexte.servlet.ClientGestionContexteLiaison;
import net.gicm.methode.paramfede.ParamFede;

/**
 * This servlet is the remote entry point for the GWT-RPC service ProfilUser.
 */
@Singleton
@SuppressWarnings("serial")
public class ProfilUserGWTServlet extends AbstractGWTServlet implements ProfilUserService.Iface {

  /**
   * Logger shared instance
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(ProfilUserGWTServlet.class);

  @Inject
  @Nullable
  ParamFede paramFede;

  // Objet de contexte partagé sur le serveur
  @Inject
  Provider<UserSession> userSessionProv;

  /**
   * Servlet de recuperation du profil salarié connecté
   * 
   * @param entree entree
   * @return sortie sortie
   * @throws ApplicationException ApplicationException
   */
  @Override
  public ProfilUserResponseBean getProfilUserService(ProfilUserRequestBean entree) throws ApplicationException {

      ProfilSalarieBean profil = new ProfilSalarieBean();
      profil.setNomUsu("Mathieu");
      profil.setUser("ls066");
      profil.setHabilitation(900);
      profil.setCdEfs("01");
      

      HashMap<String, String> tabFede = new HashMap<String, String>();
      tabFede.put("01", "CMB");
      tabFede.put("03", "CMSO");
      
      ProfilUserResponseBean sortie = new ProfilUserResponseBean();
      sortie.setSalarie(profil);
      sortie.setMabFederationsAuthorisee(tabFede);

    return sortie;
  }
}
