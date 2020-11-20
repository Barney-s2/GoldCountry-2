// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.ui.auth;

import androidx.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForgotPasswordFragment_Factory implements Factory<ForgotPasswordFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ForgotPasswordFragment_Factory(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  @Override
  public ForgotPasswordFragment get() {
    return newInstance(viewModelFactoryProvider.get());
  }

  public static ForgotPasswordFragment_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ForgotPasswordFragment_Factory(viewModelFactoryProvider);
  }

  public static ForgotPasswordFragment newInstance(ViewModelProvider.Factory viewModelFactory) {
    return new ForgotPasswordFragment(viewModelFactory);
  }
}
