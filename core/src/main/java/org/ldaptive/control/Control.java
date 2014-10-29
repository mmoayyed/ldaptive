/*
  $Id$

  Copyright (C) 2003-2014 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware Services
  Email:   middleware@vt.edu
  Version: $Revision$
  Updated: $Date$
*/
package org.ldaptive.control;

/**
 * Marker interface for ldap controls.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public interface Control
{


  /**
   * Returns the OID for this control.
   *
   * @return  oid
   */
  String getOID();


  /**
   * Returns whether the control is critical.
   *
   * @return  whether the control is critical
   */
  boolean getCriticality();
}