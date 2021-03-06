/**
 * 
 */
package org.inbio.m3s.dao.core.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.inbio.m3s.dao.GenericBaseDAOImpl;
import org.inbio.m3s.dao.core.ImportControlDAO;
import org.inbio.m3s.model.core.ImportControl;
import org.inbio.m3s.model.core.ImportControlId;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author jgutierrez
 *
 */
public class ImportControlDAOImpl extends GenericBaseDAOImpl<ImportControl, ImportControlId> implements ImportControlDAO {

	/* (non-Javadoc)
	 * @see org.inbio.m3s.dao.core.ImportControlDAO#getImportControlList(java.lang.String, int)
	 */
	@SuppressWarnings("unchecked")
	public List<ImportControl> getImportControlList(final String username, final int quantity)
			throws IllegalArgumentException {
		HibernateTemplate template = getHibernateTemplate();
		return (List<ImportControl>) template.execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				Query query = session.createQuery(
						"select ip"
							+ " from ImportControl as ip"
							+ " where ip.id.userName = '" + username + "' " 
							+	" order by ip.creationDate desc, ip.id.systemFileName desc");
				//query.setParameter(0, nomenclaturalGroupId);
				query.setCacheable(false);
				query.setFirstResult(0);
				query.setMaxResults(quantity);
				return query.list();
			}
		});		
	}

	/*
	 * (non-Javadoc)
	 * @see org.inbio.m3s.dao.core.ImportControlDAO#findBySystemFileName(java.lang.String)
	 */
	public ImportControl findBySystemFileName(final String systemFileName)
			throws IllegalArgumentException {
		HibernateTemplate template = getHibernateTemplate();
		return (ImportControl) template.execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				Query query = session.createQuery(
						"select ip"
							+ " from ImportControl as ip"
							+ " where ip.id.systemFileName = :systemFileName");
				query.setParameter("systemFileName", systemFileName);
				return query.uniqueResult();
			}
		});
	}



}
