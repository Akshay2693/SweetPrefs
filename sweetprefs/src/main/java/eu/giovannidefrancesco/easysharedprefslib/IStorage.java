package eu.giovannidefrancesco.easysharedprefslib;

import android.support.annotation.NonNull;

/**
 * Interface for saving or retrieving object from a storage.
 * An implementation of a storage could be Database, SharedPreferences or other means.
 */
public interface IStorage {
    /**
     * Saves the object into the storage using key as id.
     * @param key used to identify the object
     * @param toStore the object which is stored
     */
    void store(String key, Object toStore);

    /**
     * Retrieves an object from the storage using key as id.
     * @param key the id of the object
     * @param defaultObj it is returned in case the storage doesn't contain an object associated
     *                   with the id.
     * @return the wanted object or defaultObj.
     */
    @NonNull <T> T get(String key, T defaultObj);

    /**
     * This removes all the entries previously saved in the storage.
     */
    void reset();
}
