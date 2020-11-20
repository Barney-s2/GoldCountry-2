// Generated by Dagger (https://dagger.dev).
package com.timetorevenue.openapi.repository.main.framework.datasource.network;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.timetorevenue.openapi.repository.main.framework.datasource.network.mappers.NetworkMapper;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BlogFirestoreServiceImpl_Factory implements Factory<BlogFirestoreServiceImpl> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<NetworkMapper> networkMapperProvider;

  public BlogFirestoreServiceImpl_Factory(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<FirebaseFirestore> firestoreProvider,
      Provider<NetworkMapper> networkMapperProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
    this.firestoreProvider = firestoreProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public BlogFirestoreServiceImpl get() {
    return newInstance(firebaseAuthProvider.get(), firestoreProvider.get(), networkMapperProvider.get());
  }

  public static BlogFirestoreServiceImpl_Factory create(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<FirebaseFirestore> firestoreProvider,
      Provider<NetworkMapper> networkMapperProvider) {
    return new BlogFirestoreServiceImpl_Factory(firebaseAuthProvider, firestoreProvider, networkMapperProvider);
  }

  public static BlogFirestoreServiceImpl newInstance(FirebaseAuth firebaseAuth,
      FirebaseFirestore firestore, NetworkMapper networkMapper) {
    return new BlogFirestoreServiceImpl(firebaseAuth, firestore, networkMapper);
  }
}