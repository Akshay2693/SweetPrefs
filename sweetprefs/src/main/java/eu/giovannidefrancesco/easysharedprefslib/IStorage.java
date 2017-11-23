package eu.giovannidefrancesco.easysharedprefslib;

import android.support.annotation.NonNull;

/**
 * Created by jibbo on 9/29/17.
 */

public interface IStorage {
    void store(String key, Object toStore);
    @NonNull <T> T get(String key, T defaultObj);
    void reset();
}
