package com.timetorevenue.openapi.ui.main.blog;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0016\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020\u0018H\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/timetorevenue/openapi/ui/main/blog/BaseBlogFragment;", "Landroidx/fragment/app/Fragment;", "layoutRes", "", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(ILandroidx/lifecycle/ViewModelProvider$Factory;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "uiCommunicationListener", "Lcom/timetorevenue/openapi/ui/UICommunicationListener;", "getUiCommunicationListener", "()Lcom/timetorevenue/openapi/ui/UICommunicationListener;", "setUiCommunicationListener", "(Lcom/timetorevenue/openapi/ui/UICommunicationListener;)V", "viewModel", "Lcom/timetorevenue/openapi/ui/main/blog/viewmodel/BlogViewModel;", "getViewModel", "()Lcom/timetorevenue/openapi/ui/main/blog/viewmodel/BlogViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupActionBarWithNavController", "fragmentId", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "setupChannel", "app_debug"})
public abstract class BaseBlogFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "AppDebug";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public com.timetorevenue.openapi.ui.UICommunicationListener uiCommunicationListener;
    private final int layoutRes = 0;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.ui.main.blog.viewmodel.BlogViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.timetorevenue.openapi.ui.UICommunicationListener getUiCommunicationListener() {
        return null;
    }
    
    public final void setUiCommunicationListener(@org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.ui.UICommunicationListener p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupChannel() {
    }
    
    public final void setupActionBarWithNavController(int fragmentId, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public BaseBlogFragment(@androidx.annotation.LayoutRes()
    int layoutRes, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        super();
    }
}