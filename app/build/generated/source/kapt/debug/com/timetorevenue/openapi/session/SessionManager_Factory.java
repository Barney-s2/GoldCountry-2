// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.session;

import android.app.Application;
import com.timetorevenue.openapi.persistence.AuthTokenDao;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionManager_Factory implements Factory<SessionManager> {
  private final Provider<AuthTokenDao> authTokenDaoProvider;

  private final Provider<Application> applicationProvider;

  public SessionManager_Factory(Provider<AuthTokenDao> authTokenDaoProvider,
      Provider<Application> applicationProvider) {
    this.authTokenDaoProvider = authTokenDaoProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SessionManager get() {
    return newInstance(authTokenDaoProvider.get(), applicationProvider.get());
  }

  public static SessionManager_Factory create(Provider<AuthTokenDao> authTokenDaoProvider,
      Provider<Application> applicationProvider) {
    return new SessionManager_Factory(authTokenDaoProvider, applicationProvider);
  }

  public static SessionManager newInstance(AuthTokenDao authTokenDao, Application application) {
    return new SessionManager(authTokenDao, application);
  }
}