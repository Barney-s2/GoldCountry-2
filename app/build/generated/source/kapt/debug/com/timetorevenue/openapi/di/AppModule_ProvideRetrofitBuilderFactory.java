// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitBuilderFactory implements Factory<Retrofit.Builder> {
  private final Provider<Gson> gsonBuilderProvider;

  public AppModule_ProvideRetrofitBuilderFactory(Provider<Gson> gsonBuilderProvider) {
    this.gsonBuilderProvider = gsonBuilderProvider;
  }

  @Override
  public Retrofit.Builder get() {
    return provideRetrofitBuilder(gsonBuilderProvider.get());
  }

  public static AppModule_ProvideRetrofitBuilderFactory create(Provider<Gson> gsonBuilderProvider) {
    return new AppModule_ProvideRetrofitBuilderFactory(gsonBuilderProvider);
  }

  public static Retrofit.Builder provideRetrofitBuilder(Gson gsonBuilder) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRetrofitBuilder(gsonBuilder), "Cannot return null from a non-@Nullable @Provides method");
  }
}
