package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class LauncherUI$29
  implements DialogInterface.OnClickListener
{
  LauncherUI$29(LauncherUI paramLauncherUI) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
    localIntent.addFlags(268435456);
    kMs.startActivity(localIntent);
    paramDialogInterface.dismiss();
    MMAppMgr.a(kMs, true);
    kMs.finish();
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.LauncherUI.29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */