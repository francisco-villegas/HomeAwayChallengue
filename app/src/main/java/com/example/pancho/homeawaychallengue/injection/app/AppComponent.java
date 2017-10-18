package com.example.pancho.homeawaychallengue.injection.app;

import com.example.pancho.homeawaychallengue.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Pancho on 10/18/2017.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void insert (App app);
}