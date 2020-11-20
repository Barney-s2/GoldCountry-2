// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.di.auth;

import com.timetorevenue.openapi.api.auth.OpenApiAuthService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthModule_ProvideOpenApiAuthServiceFactory implements Factory<OpenApiAuthService> {
  private final Provider<Retrofit.Builder> retrofitBuilderProvider;

  public AuthModule_ProvideOpenApiAuthServiceFactory(
      Provider<Retrofit.Builder> retrofitBuilderProvider) {
    this.retrofitBuilderProvider = retrofitBuilderProvider;
  }

  @Override
  public OpenApiAuthService get() {
    return provideOpenApiAuthService(retrofitBuilderProvider.get());
  }

  public static AuthModule_ProvideOpenApiAuthServiceFactory create(
      Provider<Retrofit.Builder> retrofitBuilderProvider) {
    return new AuthModule_ProvideOpenApiAuthServiceFactory(retrofitBuilderProvider);
  }

  public static OpenApiAuthService provideOpenApiAuthService(Retrofit.Builder retrofitBuilder) {
    return Preconditions.checkNotNull(AuthModule.INSTANCE.provideOpenApiAuthService(retrofitBuilder), "Cannot return null from a non-@Nullable @Provides method");
  }
}
