// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.di;

import android.app.Application;
import com.timetorevenue.openapi.persistence.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAppDbFactory implements Factory<AppDatabase> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideAppDbFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDb(appProvider.get());
  }

  public static AppModule_ProvideAppDbFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideAppDbFactory(appProvider);
  }

  public static AppDatabase provideAppDb(Application app) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideAppDb(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
