package cn.jet.plugin.trycatch;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import com.android.build.gradle.AppExtension;

import java.util.Collections;

public class AddTryCatchPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        Config.getInstance().extension = project.getExtensions().create("addTryCatch", AddTryCatchExtension.class);
        AppExtension appExtension = (AppExtension) project.getProperties().get("android");
        appExtension.registerTransform(new AddTryCatchTransform(project), Collections.EMPTY_LIST);
    }
}