package knaufdan.android.simpletimerapp.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import knaufdan.android.simpletimerapp.util.service.TimerService

@Module
abstract class ServiceModule {

    @ContributesAndroidInjector
    internal abstract fun contributeTimerService(): TimerService
}