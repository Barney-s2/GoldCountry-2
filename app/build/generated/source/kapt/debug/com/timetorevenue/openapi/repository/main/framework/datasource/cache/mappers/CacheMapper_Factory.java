// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.repository.main.framework.datasource.cache.mappers;

import com.timetorevenue.openapi.repository.main.business.domain.util.DateUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CacheMapper_Factory implements Factory<CacheMapper> {
  private final Provider<DateUtil> dateUtilProvider;

  public CacheMapper_Factory(Provider<DateUtil> dateUtilProvider) {
    this.dateUtilProvider = dateUtilProvider;
  }

  @Override
  public CacheMapper get() {
    return newInstance(dateUtilProvider.get());
  }

  public static CacheMapper_Factory create(Provider<DateUtil> dateUtilProvider) {
    return new CacheMapper_Factory(dateUtilProvider);
  }

  public static CacheMapper newInstance(DateUtil dateUtil) {
    return new CacheMapper(dateUtil);
  }
}
