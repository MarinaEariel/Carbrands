package com.luboganev.carbrands.application;


import com.luboganev.carbrands.carbrandDetail.CarBrandDetailModule;
import com.luboganev.carbrands.carbrands.CarBrandsListModule;
import com.luboganev.carbrands.common.NavigatorModule;
import dagger.Module;

/**
 * This module exists only to allow the Dagger pre-processor to be able to do a
 * compile time check of all declared modules and injections. This is a great feature of Dagger,
 * which makes sure everything is alright with the object graph, so that no runtime crashes
 * due missing dependencies occur.
 *
 * Created by Lyubomir Ganev (ganevlyu) on 20.04.2015
 */
@Module(
        includes = {
                AppModule.class,
                NavigatorModule.class,
                CarBrandsListModule.class,
                CarBrandDetailModule.class
        }
)
public class CompileTimeValidationModule {
}
