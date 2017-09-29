# SweetPrefs
SweetPrefs alleviates the pain of using SharedPreferences on Android

## Download

`compile 'eu.giovannidefrancesco.sweetprefs:sweetprefs:1.0'`

## Usage

```java

//init
IStorage storage = new SharedPreferenceStorage(this, "SomePrefs", MODE_PRIVATE);

// saving
storage.store("aKey", ANY_OBJECT);

// retrieving
THE_REAL_OBJECT_TYPE object = storage.get("aKey", DEFAULT_VALUE)

```

## Example

```java

//init
IStorage storage = new SharedPreferenceStorage(this, "MainActivityPrefs", MODE_PRIVATE);

// saving
storage.store("username", "jibbo");
storage.store("firstlaunch",false);

// retrieving
String username = storage.get("username", null)
boolean firstLaunch = storage.get("firstlaunch",true);
```

For a more advanced, see the MainActivity class.