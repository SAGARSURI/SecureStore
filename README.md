# SecureStore

Many times we want to securely store API keys in our app to make different service calls through it. Here "API keys" I mean youtube key, fabric crashlytics key or Firebase cloud messaging key .

Eg of a Youtube API key:
AIzaSyDhEeq_FYAdCzMMSigmMcRwF_nQEhUXS-0

# Problems storing API keys in our android app:
1) We cannot write these keys in plain Java class. If done it can be easily stolen by reverse engineering the apk.
2) Cannot store it in strings.xml file. Even it is vulnerable to reverse engineering.
3) Creating a SQLite database to store these keys would be an overkill.

So to tackle these problems. I present you a very simple, clear and effective solution to store these sensitive keys without having the fear of getting it stolen due to reverse engineering.

I use the power of C++(NDK) to write these keys in the C++ files and passing these keys when need to Java classes through the power of jni.

# Reason I use C++ to store these keys is:
1) C++ generally compile directly to native machine code.
2) C++ is much harder to decompile

(Note: This is not a silverbullet to securely store the keys. But it is very difficult to decompile a C++ code. It will take an experienced hacker(many are just script kiddies in the market) to decompile it.)
You can read about NDK by going through the below link:
https://developer.android.com/ndk/

Now you have a big question. How can I immediately implement it in my project without wasting much time reading about NDK and understand its core. 
The answer to your question is:
1) Download and setup NDK with your android studio.(Link to download: https://developer.android.com/ndk/downloads/older_releases)
2) Copy and paste below three files to the respective directory in your project:

-> KeyHandler.java

-> native-lib.cpp

-> CMakeLists.txt
