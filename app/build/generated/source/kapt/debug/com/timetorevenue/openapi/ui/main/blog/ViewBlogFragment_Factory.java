// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.ui.main.blog;

import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewBlogFragment_Factory implements Factory<ViewBlogFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<RequestManager> requestManagerProvider;

  public ViewBlogFragment_Factory(Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RequestManager> requestManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.requestManagerProvider = requestManagerProvider;
  }

  @Override
  public ViewBlogFragment get() {
    return newInstance(viewModelFactoryProvider.get(), requestManagerProvider.get());
  }

  public static ViewBlogFragment_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<RequestManager> requestManagerProvider) {
    return new ViewBlogFragment_Factory(viewModelFactoryProvider, requestManagerProvider);
  }

  public static ViewBlogFragment newInstance(ViewModelProvider.Factory viewModelFactory,
      RequestManager requestManager) {
    return new ViewBlogFragment(viewModelFactory, requestManager);
  }
}