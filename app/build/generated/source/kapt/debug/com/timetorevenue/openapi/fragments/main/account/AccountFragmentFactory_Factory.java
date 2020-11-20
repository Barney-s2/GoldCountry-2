// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.fragments.main.account;

import androidx.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AccountFragmentFactory_Factory implements Factory<AccountFragmentFactory> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public AccountFragmentFactory_Factory(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  @Override
  public AccountFragmentFactory get() {
    return newInstance(viewModelFactoryProvider.get());
  }

  public static AccountFragmentFactory_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new AccountFragmentFactory_Factory(viewModelFactoryProvider);
  }

  public static AccountFragmentFactory newInstance(ViewModelProvider.Factory viewModelFactory) {
    return new AccountFragmentFactory(viewModelFactory);
  }
}
