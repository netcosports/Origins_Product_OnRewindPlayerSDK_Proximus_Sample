package com.originsdigital.onrewind.sample

import android.app.Application
import com.origins.onrewind.OnRewind

class SampleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        OnRewind.initialize(
            OnRewind.InitParams.Builder()
                .setApplicationContext(this)
                .setBaseUrl("https://api-gateway.onrewind.tv/main-api/")
                .build()
        )
    }
}