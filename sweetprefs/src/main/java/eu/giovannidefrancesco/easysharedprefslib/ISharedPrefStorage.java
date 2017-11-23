package eu.giovannidefrancesco.easysharedprefslib;

/**
 * This interface allows users of a SharedPreferences to make use of the
 * synchronous method .commit(), instead of the asynchronous .apply() method.
 */
// I want this to be public such that tests and third-parties can use or extend it.
@SuppressWarnings("WeakerAccess")
public interface ISharedPrefStorage extends IStorage {
    /**
     * Same as .store() but synchronous.
     * @see IStorage
     */
    void storeImmediate(String key, Object toStore);

    /**
     * Same as .reset() but synchronous.
     * @see IStorage
     */
    void resetImmediate();
}
