package com.timetorevenue.openapi.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"BOTTOM_NAV_BACKSTACK_KEY", "", "setUpNavigation", "", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "bottomNavController", "Lcom/timetorevenue/openapi/util/BottomNavController;", "onReselectListener", "Lcom/timetorevenue/openapi/util/BottomNavController$OnNavigationReselectedListener;", "app_debug"})
public final class BottomNavControllerKt {
    
    /**
     * Class credit: Allan Veloso
     * I took the concept from Allan Veloso and made alterations to fit our needs.
     * https://stackoverflow.com/questions/50577356/android-jetpack-navigation-bottomnavigationview-with-youtube-or-instagram-like#_=_
     * @property navigationBackStack: Backstack for the bottom navigation
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BOTTOM_NAV_BACKSTACK_KEY = "com.timetorevenue.openapi.util.BottomNavController.bottom_nav_backstack";
    
    public static final void setUpNavigation(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView $this$setUpNavigation, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.BottomNavController bottomNavController, @org.jetbrains.annotations.NotNull()
    com.timetorevenue.openapi.util.BottomNavController.OnNavigationReselectedListener onReselectListener) {
    }
}