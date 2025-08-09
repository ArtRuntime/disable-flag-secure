package com.dhehydwyhdg.disable_flag_secure

import android.view.*
import com.highcapable.yukihookapi.YukiHookAPI
import com.highcapable.yukihookapi.annotation.xposed.InjectYukiHookWithXposed
import com.highcapable.yukihookapi.hook.xposed.proxy.IYukiHookXposedInit
import com.highcapable.yukihookapi.hook.factory.*
import com.highcapable.yukihookapi.hook.type.android.DisplayClass
import com.highcapable.yukihookapi.hook.type.android.SurfaceViewClass
import com.highcapable.yukihookapi.hook.type.android.ViewClass
import com.highcapable.yukihookapi.hook.type.android.WindowClass
import com.highcapable.yukihookapi.hook.type.java.BooleanType
import com.highcapable.yukihookapi.hook.type.java.IntType
import de.robv.android.xposed.XposedHelpers.findAndHookMethod

/**
 * @author @alex5402
 * Created 25/06/25 at 6:08 am
 * HookEntry
 */



@InjectYukiHookWithXposed
object HookEntry : IYukiHookXposedInit {
    override fun onHook() = YukiHookAPI.encase {
        
    }

    override fun onInit() = configs {
        isDebug = BuildConfig.DEBUG
    }

    override fun onXposedEvent() {
        super.onXposedEvent()

    }




}
