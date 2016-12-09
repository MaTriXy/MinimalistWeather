package me.baron.weatherstyle.activities.component;

import dagger.Component;
import me.baron.weatherstyle.ApplicationComponent;
import me.baron.weatherstyle.activities.MainActivity;
import me.baron.weatherstyle.utils.ApplicationScoped;
import me.baron.weatherstyle.presenter.module.HomePagePresenterModule;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2016/11/29
 */
@ApplicationScoped
@Component(modules = HomePagePresenterModule.class, dependencies = ApplicationComponent.class)
public interface HomePageComponent {

    void inject(MainActivity mainActivity);
}