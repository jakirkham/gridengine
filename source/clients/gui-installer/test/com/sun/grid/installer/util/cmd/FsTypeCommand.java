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
package com.sun.grid.installer.util.cmd;

import com.sun.grid.installer.util.Util;
import java.util.Vector;

public class FsTypeCommand extends CmdExec {
    private String host;
    private String user;
    private String shell;
    private boolean isWindowsMode;
    private String fstypePath;
    private String dirPath;

    public FsTypeCommand(String host, String user, String shell, boolean isWindowsMode, String fstypePath, String dirPath) {
        this(Util.DEF_RESOLVE_TIMEOUT, host, user, shell, isWindowsMode, fstypePath, dirPath);
    }

    public FsTypeCommand(long timeout, String host, String user, String shell, boolean isWindowsMode, String fstypePath, String dirPath) {
        super(timeout);

        this.host = host;
        this.user = user;
        this.shell = shell;
        this.isWindowsMode = isWindowsMode;
        this.dirPath = dirPath;
    }

    @Override
    public int getExitValue() {
        return 0;
    }

    public void execute() {
        try {
            Thread.sleep(TestBedManager.getFSTypeSleepLength());
        } catch (InterruptedException ex) {
        }
    }

    @Override
    public Vector<String> getOutput() {
        Vector<String> result = new Vector<String>();
        result.add("nfs4");
        
        return result;
    }
}
