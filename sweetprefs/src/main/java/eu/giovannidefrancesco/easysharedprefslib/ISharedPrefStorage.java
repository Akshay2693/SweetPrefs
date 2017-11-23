package eu.giovannidefrancesco.easysharedprefslib;

/**
 * Created by jibbo on 9/29/17.
 */
// I want this to be public such that tests and third-parties can use or extend it.
@SuppressWarnings("WeakerAccess")
public interface ISharedPrefStorage extends IStorage {
    void storeImmediate(String key, Object toStore);
    void resetImmediate();
}
