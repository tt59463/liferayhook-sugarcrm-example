/**
 * 
 */
package it.dontesta.liferay.hook.sugarcrm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author amusarra
 *
 */
public class LoginPostAction extends Action {

	/* (non-Javadoc)
	 * @see com.liferay.portal.kernel.events.Action#run(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void run(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ActionException {
		if (_log.isInfoEnabled()) {
			_log.info("### My LoginPostAction ###");
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(LoginPostAction.class);
}
