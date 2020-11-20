// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.ui.auth;

import androidx.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterFragment_Factory implements Factory<RegisterFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public RegisterFragment_Factory(Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  @Override
  public RegisterFragment get() {
    return newInstance(viewModelFactoryProvider.get());
  }

  public static RegisterFragment_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new RegisterFragment_Factory(viewModelFactoryProvider);
  }

  public static RegisterFragment newInstance(ViewModelProvider.Factory viewModelFactory) {
    return new RegisterFragment(viewModelFactory);
  }
}