// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.di.auth;

import android.content.SharedPreferences;
import com.timetorevenue.openapi.api.auth.OpenApiAuthService;
import com.timetorevenue.openapi.persistence.AccountPropertiesDao;
import com.timetorevenue.openapi.persistence.AuthTokenDao;
import com.timetorevenue.openapi.repository.auth.AuthRepository;
import com.timetorevenue.openapi.session.SessionManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<AuthTokenDao> authTokenDaoProvider;

  private final Provider<AccountPropertiesDao> accountPropertiesDaoProvider;

  private final Provider<OpenApiAuthService> openApiAuthServiceProvider;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<SharedPreferences.Editor> editorProvider;

  public AuthModule_ProvideAuthRepositoryFactory(Provider<SessionManager> sessionManagerProvider,
      Provider<AuthTokenDao> authTokenDaoProvider,
      Provider<AccountPropertiesDao> accountPropertiesDaoProvider,
      Provider<OpenApiAuthService> openApiAuthServiceProvider,
      Provider<SharedPreferences> preferencesProvider,
      Provider<SharedPreferences.Editor> editorProvider) {
    this.sessionManagerProvider = sessionManagerProvider;
    this.authTokenDaoProvider = authTokenDaoProvider;
    this.accountPropertiesDaoProvider = accountPropertiesDaoProvider;
    this.openApiAuthServiceProvider = openApiAuthServiceProvider;
    this.preferencesProvider = preferencesProvider;
    this.editorProvider = editorProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(sessionManagerProvider.get(), authTokenDaoProvider.get(), accountPropertiesDaoProvider.get(), openApiAuthServiceProvider.get(), preferencesProvider.get(), editorProvider.get());
  }

  public static AuthModule_ProvideAuthRepositoryFactory create(
      Provider<SessionManager> sessionManagerProvider, Provider<AuthTokenDao> authTokenDaoProvider,
      Provider<AccountPropertiesDao> accountPropertiesDaoProvider,
      Provider<OpenApiAuthService> openApiAuthServiceProvider,
      Provider<SharedPreferences> preferencesProvider,
      Provider<SharedPreferences.Editor> editorProvider) {
    return new AuthModule_ProvideAuthRepositoryFactory(sessionManagerProvider, authTokenDaoProvider, accountPropertiesDaoProvider, openApiAuthServiceProvider, preferencesProvider, editorProvider);
  }

  public static AuthRepository provideAuthRepository(SessionManager sessionManager,
      AuthTokenDao authTokenDao, AccountPropertiesDao accountPropertiesDao,
      OpenApiAuthService openApiAuthService, SharedPreferences preferences,
      SharedPreferences.Editor editor) {
    return Preconditions.checkNotNull(AuthModule.INSTANCE.provideAuthRepository(sessionManager, authTokenDao, accountPropertiesDao, openApiAuthService, preferences, editor), "Cannot return null from a non-@Nullable @Provides method");
  }
}