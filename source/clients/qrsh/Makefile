###############################################################################
# Variable definitions for targets to build
###############################################################################
#___INFO__MARK_BEGIN__
##########################################################################
#
#  The Contents of this file are made available subject to the terms of
#  the Sun Industry Standards Source License Version 1.2
#
#  Sun Microsystems Inc., March, 2001
#
#
#  Sun Industry Standards Source License Version 1.2
#  =================================================
#  The contents of this file are subject to the Sun Industry Standards
#  Source License Version 1.2 (the "License"); You may not use this file
#  except in compliance with the License. You may obtain a copy of the
#  License at http://gridengine.sunsource.net/Gridengine_SISSL_license.html
#
#  Software provided under this License is provided on an "AS IS" basis,
#  WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,
#  WITHOUT LIMITATION, WARRANTIES THAT THE SOFTWARE IS FREE OF DEFECTS,
#  MERCHANTABLE, FIT FOR A PARTICULAR PURPOSE, OR NON-INFRINGING.
#  See the License for the specific provisions governing your rights and
#  obligations concerning the Software.
#
#  The Initial Developer of the Original Code is: Sun Microsystems, Inc.
#
#  Copyright: 2001 by Sun Microsystems, Inc.
#
#  All Rights Reserved.
#
##########################################################################
#___INFO__MARK_END__
QRSH_DIR = $(SDIR)/clients/qrsh

QRSH_TARGETS = qrsh_starter

QRSH_SRC = qrsh_starter.c

QRSH_ADD_SRC = config_file.c

QRSH_OBJS = $(QRSH_SRC:.c=.o)

QRSH_ADD_OBJS = $(QRSH_ADD_SRC:.c=.o) 

QRSH_ADD_LIBS = -luti $(WINGRIDLIB) $(COMMLISTSLIB) 

QRSH_LIB_DEPENDS = $(WINGRIDLIB_DEP) $(UTILIB) $(TPLIB)

###############################################################################
# global rules: all, clean, depend, messages
###############################################################################
qrsh: $(QRSH_TARGETS)

qrsh_clean:
	$(RM) $(QRSH_TARGETS) $(QRSH_OBJS)

qrsh_depend:
	$(DEPEND) -f$(QRSH_DIR)/qrsh_dependencies $(QRSH_DIR)/*.c

qrsh_messages:
	@echo Creating $@
	@for i in `ls $(QRSH_DIR)/*.c`; do \
		$(CC) $(CFLAGS) -DEXTRACT_MESSAGES -E $$i | $(XGETTEXT) - ; \
	done


###############################################################################
# rules to build binaries
###############################################################################
qrsh_starter: $(QRSH_OBJS) $(QRSH_ADD_OBJS) $(QRSH_LIB_DEPENDS)
	$(LD_WRAPPER) $(CC) -o $@ $(LFLAGS) $(QRSH_OBJS) $(QRSH_ADD_OBJS) $(QRSH_ADD_LIBS) $(LIBS)

###############################################################################
# include dependencies for object files generated by sge_depend
###############################################################################
include $(QRSH_DIR)/qrsh_dependencies

###############################################################################
# rules to build object codes
###############################################################################
qrsh_starter.o: $(QRSH_DIR)/qrsh_starter.c
		$(CC) $(CFLAGS) $(MEMCFLAG) -I$(SDIR)/utilbin -c $(QRSH_DIR)/qrsh_starter.c
