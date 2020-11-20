// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.di;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSharedPrefsEditorFactory implements Factory<SharedPreferences.Editor> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public AppModule_ProvideSharedPrefsEditorFactory(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPreferences.Editor get() {
    return provideSharedPrefsEditor(sharedPreferencesProvider.get());
  }

  public static AppModule_ProvideSharedPrefsEditorFactory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new AppModule_ProvideSharedPrefsEditorFactory(sharedPreferencesProvider);
  }

  public static SharedPreferences.Editor provideSharedPrefsEditor(
      SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSharedPrefsEditor(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
}