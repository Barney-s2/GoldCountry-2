// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.fragments.main.blog;

import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BlogFragmentFactory_Factory implements Factory<BlogFragmentFactory> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<RequestOptions> requestOptionsProvider;

  private final Provider<RequestManager> requestManagerProvider;

  public BlogFragmentFactory_Factory(Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RequestOptions> requestOptionsProvider,
      Provider<RequestManager> requestManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.requestOptionsProvider = requestOptionsProvider;
    this.requestManagerProvider = requestManagerProvider;
  }

  @Override
  public BlogFragmentFactory get() {
    return newInstance(viewModelFactoryProvider.get(), requestOptionsProvider.get(), requestManagerProvider.get());
  }

  public static BlogFragmentFactory_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RequestOptions> requestOptionsProvider,
      Provider<RequestManager> requestManagerProvider) {
    return new BlogFragmentFactory_Factory(viewModelFactoryProvider, requestOptionsProvider, requestManagerProvider);
  }

  public static BlogFragmentFactory newInstance(ViewModelProvider.Factory viewModelFactory,
      RequestOptions requestOptions, RequestManager requestManager) {
    return new BlogFragmentFactory(viewModelFactory, requestOptions, requestManager);
  }
}