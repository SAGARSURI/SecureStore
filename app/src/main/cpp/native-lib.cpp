#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_sagar_securestore_KeyHandler_fabricKey(
        JNIEnv *env,
        jobject /* this */) {
    std::string fabrickey = "6wJsqVDF8K19zxfLxV5DGRneLyZso9"; //example of API_KEY: 6wJsqVDF8K19zxfLxV5DGRneLyZso9
    return env->NewStringUTF(fabrickey.c_str());
}

extern "C"
JNIEXPORT jstring
JNICALL
Java_com_sagar_securestore_KeyHandler_youtubeKey(
        JNIEnv *env,
jobject /* this */) {
std::string youtubeKey = "yZso96wJsqV9DF8K1zxfLxV5DGRneL"; //example of API_KEY: 6wJsqVDF8K19zxfLxV5DGRneLyZso9
return env->NewStringUTF(youtubeKey.c_str());
}

extern "C"
JNIEXPORT jstring
JNICALL
Java_com_sagar_securestore_KeyHandler_firebaseKey(
        JNIEnv *env,
jobject /* this */) {
std::string firebaseKey = "8K19zqVDFxfLxV5DGRneLyZs6wJso9"; //example of API_KEY: 6wJsqVDF8K19zxfLxV5DGRneLyZso9
return env->NewStringUTF(firebaseKey.c_str());
}
