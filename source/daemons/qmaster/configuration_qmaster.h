#ifndef __CONFIGURATION_QMASTER_H
#define __CONFIGURATION_QMASTER_H
/*___INFO__MARK_BEGIN__*/
/*************************************************************************
 * 
 *  The Contents of this file are made available subject to the terms of
 *  the Sun Industry Standards Source License Version 1.2
 * 
 *  Sun Microsystems Inc., March, 2001
 * 
 * 
 *  Sun Industry Standards Source License Version 1.2
 *  =================================================
 *  The contents of this file are subject to the Sun Industry Standards
 *  Source License Version 1.2 (the "License"); You may not use this file
 *  except in compliance with the License. You may obtain a copy of the
 *  License at http://gridengine.sunsource.net/Gridengine_SISSL_license.html
 * 
 *  Software provided under this License is provided on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,
 *  WITHOUT LIMITATION, WARRANTIES THAT THE SOFTWARE IS FREE OF DEFECTS,
 *  MERCHANTABLE, FIT FOR A PARTICULAR PURPOSE, OR NON-INFRINGING.
 *  See the License for the specific provisions governing your rights and
 *  obligations concerning the Software.
 * 
 *   The Initial Developer of the Original Code is: Sun Microsystems, Inc.
 * 
 *   Copyright: 2001 by Sun Microsystems, Inc.
 * 
 *   All Rights Reserved.
 * 
 ************************************************************************/
/*___INFO__MARK_END__*/

#include "basis_types.h"


int sge_del_configuration(lListElem *cxp, lList **alpp, char *ruser, char *rhost);
int sge_mod_configuration(lListElem *cxp, lList **alpp, char *ruser, char *rhost);
int is_configuration_up_to_date(lListElem *hep, lList *conf_list, lList *to_check_list);
int select_configuration(const char *config_name, lList *lp, lListElem **cepp);
lListElem *get_local_conf_val(const char *host, const char *name);  

lListElem* sge_get_configuration(const char* aName);
int  sge_mod_global_configuration(lList **alpp, char *ruser, char *rhost);

void sge_set_conf_reprioritize(lListElem *aConf, bool aFlag);
bool sge_get_conf_reprioritize(lListElem *aConf);

bool sge_conf_is_reprioritize(void);

#endif /* __CONFIGURATION_QMASTER_H */
