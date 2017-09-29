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

//init, MODE_PRIVATE is default
IStorage storage = new SharedPreferenceStorage(this, "MainActivityPrefs");

// saving
storage.store("username", "jibbo");
storage.store("firstlaunch",false);

// retrieving
String username = storage.get("username", null)
boolean firstLaunch = storage.get("firstlaunch",true);
```

For a more advanced example, please check the MainActivity class.

## License
```
MIT License

Copyright (c) 2017 Giovanni De Francesco

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```