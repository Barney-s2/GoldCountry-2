package com.timetorevenue.openapi.ui.main;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0016J\u0012\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u001dH\u0016J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020&H\u0014J\u0012\u00102\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u00103\u001a\u00020\u001dH\u0002J\u0012\u00104\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0006\u00105\u001a\u00020\u001dR$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000b\u00a8\u00066"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/MainActivity;", "Lcom/timetorevenue/openapi/ui/BaseActivity;", "Lcom/timetorevenue/openapi/util/BottomNavController$OnNavigationGraphChanged;", "Lcom/timetorevenue/openapi/util/BottomNavController$OnNavigationReselectedListener;", "()V", "accountFragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "accountFragmentFactory$annotations", "getAccountFragmentFactory", "()Landroidx/fragment/app/FragmentFactory;", "setAccountFragmentFactory", "(Landroidx/fragment/app/FragmentFactory;)V", "blogFragmentFactory", "blogFragmentFactory$annotations", "getBlogFragmentFactory", "setBlogFragmentFactory", "bottomNavController", "Lcom/timetorevenue/openapi/util/BottomNavController;", "getBottomNavController", "()Lcom/timetorevenue/openapi/util/BottomNavController;", "bottomNavController$delegate", "Lkotlin/Lazy;", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "createBlogFragmentFactory", "createBlogFragmentFactory$annotations", "getCreateBlogFragmentFactory", "setCreateBlogFragmentFactory", "displayProgressBar", "", "bool", "", "expandAppBar", "inject", "navAuthActivity", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGraphChange", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onReselectNavItem", "navController", "Landroidx/navigation/NavController;", "fragment", "Landroidx/fragment/app/Fragment;", "onSaveInstanceState", "outState", "restoreSession", "setupActionBar", "setupBottomNavigationView", "subscribeObservers", "app_debug"})
public final class MainActivity extends com.timetorevenue.openapi.ui.BaseActivity implements com.timetorevenue.openapi.util.BottomNavController.OnNavigationGraphChanged, com.timetorevenue.openapi.util.BottomNavController.OnNavigationReselectedListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.fragment.app.FragmentFactory accountFragmentFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.fragment.app.FragmentFactory blogFragmentFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.fragment.app.FragmentFactory createBlogFragmentFactory;
    private com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView;
    private final kotlin.Lazy bottomNavController$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @javax.inject.Named(value = "AccountFragmentFactory")
    public static void accountFragmentFactory$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentFactory getAccountFragmentFactory() {
        return null;
    }
    
    public final void setAccountFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentFactory p0) {
    }
    
    @javax.inject.Named(value = "BlogFragmentFactory")
    public static void blogFragmentFactory$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentFactory getBlogFragmentFactory() {
        return null;
    }
    
    public final void setBlogFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentFactory p0) {
    }
    
    @javax.inject.Named(value = "CreateBlogFragmentFactory")
    public static void createBlogFragmentFactory$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentFactory getCreateBlogFragmentFactory() {
        return null;
    }
    
    public final void setCreateBlogFragmentFactory(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentFactory p0) {
    }
    
    private final com.timetorevenue.openapi.util.BottomNavController getBottomNavController() {
        return null;
    }
    
    @java.lang.Override()
    public void onGraphChange() {
    }
    
    @java.lang.Override()
    public void onReselectNavItem(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void inject() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomNavigationView(android.os.Bundle savedInstanceState) {
    }
    
    private final void restoreSession(android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public final void subscribeObservers() {
    }
    
    @java.lang.Override()
    public void expandAppBar() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setupActionBar() {
    }
    
    private final void navAuthActivity() {
    }
    
    @java.lang.Override()
    public void displayProgressBar(boolean bool) {
    }
    
    public MainActivity() {
        super();
    }
}