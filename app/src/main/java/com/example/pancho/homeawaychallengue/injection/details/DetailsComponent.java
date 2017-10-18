package com.example.pancho.homeawaychallengue.injection.details;

import com.example.pancho.homeawaychallengue.injection.CustomScope;
import com.example.pancho.homeawaychallengue.injection.sharepreferences.SharedPreferencesComponent;
import com.example.pancho.homeawaychallengue.view.detailsview.DetailsView;

import dagger.Component;

@CustomScope
@Component(dependencies = SharedPreferencesComponent.class, modules = {DetailsModule.class} )
public interface DetailsComponent {

    void insert(DetailsView detailsView);
}