package eu.giovannidefrancesco.easysharedprefslib;

/**
 * Created by jibbo on 9/29/17.
 */

public interface ISharedPrefStorage extends IStorage {
    void storeImmediate(String key, Object toStore);
}
