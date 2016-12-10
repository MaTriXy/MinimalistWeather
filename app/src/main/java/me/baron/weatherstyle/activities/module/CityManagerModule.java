package me.baron.weatherstyle.activities.module;

import dagger.Module;
import dagger.Provides;
import me.baron.weatherstyle.contract.CityManagerContract;

/**
 * @author 张磊 (baronzhang[at]anjuke[dot]com)
 *         2016/11/30
 */
@Module
public class CityManagerModule {

    private CityManagerContract.View view;

    public CityManagerModule(CityManagerContract.View view) {
        this.view = view;
    }

    @Provides
    CityManagerContract.View provideCityManagerContactView() {
        return view;
    }
}