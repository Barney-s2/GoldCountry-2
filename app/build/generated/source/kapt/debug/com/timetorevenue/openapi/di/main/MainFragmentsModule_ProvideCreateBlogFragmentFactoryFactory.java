// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.di.main;

import androidx.fragment.app.FragmentFactory;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainFragmentsModule_ProvideCreateBlogFragmentFactoryFactory implements Factory<FragmentFactory> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<RequestManager> requestManagerProvider;

  public MainFragmentsModule_ProvideCreateBlogFragmentFactoryFactory(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RequestManager> requestManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.requestManagerProvider = requestManagerProvider;
  }

  @Override
  public FragmentFactory get() {
    return provideCreateBlogFragmentFactory(viewModelFactoryProvider.get(), requestManagerProvider.get());
  }

  public static MainFragmentsModule_ProvideCreateBlogFragmentFactoryFactory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RequestManager> requestManagerProvider) {
    return new MainFragmentsModule_ProvideCreateBlogFragmentFactoryFactory(viewModelFactoryProvider, requestManagerProvider);
  }

  public static FragmentFactory provideCreateBlogFragmentFactory(
      ViewModelProvider.Factory viewModelFactory, RequestManager requestManager) {
    return Preconditions.checkNotNull(MainFragmentsModule.INSTANCE.provideCreateBlogFragmentFactory(viewModelFactory, requestManager), "Cannot return null from a non-@Nullable @Provides method");
  }
}